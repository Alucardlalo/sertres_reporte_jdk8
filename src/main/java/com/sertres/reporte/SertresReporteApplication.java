package com.sertres.reporte;

import com.sertres.reporte.domain.Device;
import com.sertres.reporte.domain.Report;
import com.sertres.reporte.domain.service.DeviceService;
import com.sertres.reporte.domain.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

@SpringBootApplication
@EnableScheduling
public class SertresReporteApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SertresReporteApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SertresReporteApplication.class, args);
	}

	@Autowired
	private ReportService reportService;

	@Autowired
	private DeviceService deviceService;

	//@Scheduled(fixedRate = 10000)
	@Scheduled(cron = "0 30 16 * * *", zone = "America/Mexico_City")//todos los dias a las 4:30 pm
	public void routineATM(){
		Date now = new Date();
		LocalDateTime now2 = Instant.ofEpochMilli(now.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
		List<Report> getAllroutine = reportService.getAll(); //(0:4, 1:2, 2:6)
		List<Device> getAllDevice = deviceService.getAll(); // 5485 dispositivos
		System.out.print("se realizo la tarea de las 4:30 a las  " + now2);

		Map<Integer, Report> mapaRutinas = new HashMap<Integer, Report>();
		for(Report rutina : getAllroutine) {
			if (mapaRutinas.containsKey(rutina.getDeviceId())) {
				if (mapaRutinas.get(rutina.getDeviceId()).getBeginDate().compareTo(rutina.getBeginDate()) > 0) {
					mapaRutinas.put(rutina.getDeviceId(), rutina);
				}
			} else {
				mapaRutinas.put(rutina.getDeviceId(), rutina);
			}
		}
		for(int i= 0; i<getAllDevice.size(); i++) {
			int activeDevice = getAllDevice.get(i).getDeviceId();//todos los device

			// Por cada dispositivo busca si tiene rutinas
			// Busca la rutina con fecha inicio mas reciente
			// que no esté revisado
			// Compara fecha actual con inicio

			if (!mapaRutinas.containsKey(activeDevice)) continue;

			Report rutina = mapaRutinas.get(activeDevice);

			LocalDateTime datebeginroutine = rutina.getBeginDate();
			int diasDiff = now2.compareTo(datebeginroutine);
			boolean revisado = rutina.isReviewATM();
			if (diasDiff <= 16 && diasDiff > 1) {
				int routineId = rutina.getReportId();
				int routineType = rutina.getReportTypeId();
				String routineName = rutina.getReportTittle();
				int deviceId = rutina.getDeviceId();
				LocalDateTime datecompro = rutina.getCommitmentDate();
				LocalDateTime dateBegin = rutina.getBeginDate();
				LocalDateTime dateEnd = rutina.getEndDate();
				int status1 = rutina.getStatus();
				int created1 = rutina.getCreatedBy();
				String createdName = rutina.getIdCreated();
				boolean atm = rutina.isReviewATM();

				//save con
				Report reportUpdate = new Report();
				reportUpdate.setReportId(routineId);
				reportUpdate.setReportTypeId(routineType);
				reportUpdate.setDeviceId(deviceId);
				reportUpdate.setReportTittle(routineName);
				reportUpdate.setCommitmentDate(datecompro);
				reportUpdate.setBeginDate(dateBegin);
				reportUpdate.setEndDate(dateEnd);
				reportUpdate.setStatus(status1);
				reportUpdate.setReviewATM(atm);
				reportUpdate.setCreatedBy(created1);
				reportUpdate.setIdCreated(createdName);
				reportService.save(reportUpdate);

			} else if (diasDiff >= 16 && revisado == false) {
				int routineId = rutina.getReportId();
				int routineType = rutina.getReportTypeId();
				String routineName = rutina.getReportTittle();
				int deviceId = rutina.getDeviceId();
				LocalDateTime datecompro = rutina.getCommitmentDate();
				LocalDateTime dateBegin = rutina.getBeginDate();
				LocalDateTime dateEnd = rutina.getEndDate();
				int status = rutina.getStatus();
				int createdByUp = rutina.getCreatedBy();
				String createStringUp = rutina.getIdCreated();

				//save con
				Report reportUpdate = new Report();
				reportUpdate.setReportId(routineId);
				reportUpdate.setReportTypeId(routineType);
				reportUpdate.setDeviceId(deviceId);
				reportUpdate.setReportTittle(routineName);
				reportUpdate.setCommitmentDate(datecompro);
				reportUpdate.setBeginDate(dateBegin);
				reportUpdate.setEndDate(dateEnd);
				if (status == 1) {
					reportUpdate.setStatus(1);
				}
				if (status == 2) {
					reportUpdate.setStatus(3);
				}
				if (status == 4) {
					reportUpdate.setStatus(4);
				}
				if (status == 5) {
					reportUpdate.setStatus(5);
				}

				reportUpdate.setReviewATM(true);
				reportUpdate.setCreatedBy(createdByUp);
				reportUpdate.setIdCreated(createStringUp);
				reportService.save(reportUpdate);


				//creacion de nueva rutina
				//int id = reportService.getAll().size() +1;
				int routineTypeN = rutina.getReportTypeId();
				String routineNameN = rutina.getReportTittle();
				int deviceIdN = rutina.getDeviceId();
				//fecha de hoy mas 15 dias para fecha compromiso
				LocalDateTime dateCommitment = Instant.ofEpochMilli(now.getTime() + 1296000000).atZone(ZoneId.systemDefault()).toLocalDateTime();
				int statusN = rutina.getStatus();

				//save nueva rutina
				if (statusN != 4) {
					Report newReport = new Report();
					//newReport.setReportId();
					newReport.setReportTypeId(routineTypeN);
					newReport.setDeviceId(deviceIdN);
					newReport.setReportTittle(routineNameN);
					newReport.setCommitmentDate(dateCommitment);
					newReport.setBeginDate(now2);
					newReport.setEndDate(null);
					newReport.setStatus(2);
					newReport.setReviewATM(false);
					newReport.setCreatedBy(null);
					newReport.setIdCreated(null);
					reportService.save(newReport);
				}
			}
		}

	}
}
