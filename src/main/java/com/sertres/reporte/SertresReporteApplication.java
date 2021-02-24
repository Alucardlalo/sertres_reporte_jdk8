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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
		List<Report> getAllroutine = reportService.getAll();
		List<Device> getAllDevice = deviceService.getAll();
		System.out.print("se realizo la tarea de las 4:30 a las  "+ now2);
		for(int i= 0;i<getAllDevice.size();i++) {
			int activeDevice = getAllroutine.get(i).getDeviceId();//todos los device
			ArrayList al1 = new ArrayList();
			al1.add(activeDevice); //lista de device
			LocalDateTime datebeginroutine = getAllroutine.get(i).getBeginDate();
			int diasDiff = now2.compareTo(datebeginroutine);
			boolean revisado = getAllroutine.get(i).isReviewATM();
			if (diasDiff <= 15 && diasDiff > 1) {
				int routineId = getAllroutine.get(i).getReportId();
				int routineType = getAllroutine.get(i).getReportTypeId();
				String routineName = getAllroutine.get(i).getReportTittle();
				int deviceId = getAllroutine.get(i).getDeviceId();
				LocalDateTime datecompro = getAllroutine.get(i).getCommitmentDate();
				LocalDateTime dateBegin = getAllroutine.get(i).getBeginDate();
				LocalDateTime dateEnd = getAllroutine.get(i).getEndDate();
				int status1 = getAllroutine.get(i).getStatus();
				int created1 = getAllroutine.get(i).getCreatedBy();
				String createdName = getAllroutine.get(i).getIdCreated();
				boolean atm = getAllroutine.get(i).isReviewATM();

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
				int routineId = getAllroutine.get(i).getReportId();
				int routineType = getAllroutine.get(i).getReportTypeId();
				String routineName = getAllroutine.get(i).getReportTittle();
				int deviceId = getAllroutine.get(i).getDeviceId();
				LocalDateTime datecompro = getAllroutine.get(i).getCommitmentDate();
				LocalDateTime dateBegin = getAllroutine.get(i).getBeginDate();
				LocalDateTime dateEnd = getAllroutine.get(i).getEndDate();
				int status = getAllroutine.get(i).getStatus();
				int createdByUp = getAllroutine.get(i).getCreatedBy();
				String createStringUp = getAllroutine.get(i).getIdCreated();

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
				int routineTypeN = getAllroutine.get(i).getReportTypeId();
				String routineNameN = getAllroutine.get(i).getReportTittle();
				int deviceIdN = getAllroutine.get(i).getDeviceId();
				//fecha de hoy mas 15 dias para fecha compromiso
				LocalDateTime dateCommitment = Instant.ofEpochMilli(now.getTime() + 1296000000).atZone(ZoneId.systemDefault()).toLocalDateTime();
				int statusN = getAllroutine.get(i).getStatus();

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
