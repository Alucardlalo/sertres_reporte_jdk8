package com.sertres.reporte;

import com.sertres.reporte.domain.Report;
import com.sertres.reporte.domain.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
public class SertresReporteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SertresReporteApplication.class, args);
	}

	@Autowired
	private ReportService reportService;

	//@Scheduled(fixedRate = 100000)
	@Scheduled(cron = "0 30 16 * * *", zone = "America/Mexico_City")//todos los dias a las 4:30 pm
	public void routineATM(){
		Date now = new Date();
		LocalDateTime now2 = Instant.ofEpochMilli(now.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
		List<Report> getAllroutine = reportService.getAll();

		for (int i = 0; i<10;i++){
			int activeDevice = getAllroutine.get(i).getDeviceId();//todos los device
			ArrayList al1 = new ArrayList();al1.add(activeDevice); //lista de device
			LocalDateTime datebeginroutine = getAllroutine.get(i).getBeginDate();
			int diasDiff = now2.compareTo(datebeginroutine);
			boolean revisado = getAllroutine.get(i).isReviewATM();

			if(diasDiff <= 15 && diasDiff > 1) {
				int routineId = getAllroutine.get(i).getReportId();
				int routineType = getAllroutine.get(i).getReportTypeId();
				String routineName = getAllroutine.get(i).getReportTittle();
				int deviceId = getAllroutine.get(i).getDeviceId();
				LocalDateTime datecompro = getAllroutine.get(i).getCommitmentDate();
				LocalDateTime dateBegin = getAllroutine.get(i).getBeginDate();
				LocalDateTime dateEnd = getAllroutine.get(i).getEndDate();

				//save con
				Report reportUpdate = new Report();
				reportUpdate.setReportId(routineId);
				reportUpdate.setReportTypeId(routineType);
				reportUpdate.setDeviceId(deviceId);
				reportUpdate.setReportTittle(routineName);
				reportUpdate.setCommitmentDate(datecompro);
				reportUpdate.setBeginDate(dateBegin);
				reportUpdate.setEndDate(dateEnd);
				reportUpdate.setStatus(2);
				reportService.save(reportUpdate);

			}else if (diasDiff >= 16 && revisado ==  false){
				int routineId = getAllroutine.get(i).getReportId();
				int routineType = getAllroutine.get(i).getReportTypeId();
				String routineName = getAllroutine.get(i).getReportTittle();
				int deviceId = getAllroutine.get(i).getDeviceId();
				LocalDateTime datecompro = getAllroutine.get(i).getCommitmentDate();
				LocalDateTime dateBegin = getAllroutine.get(i).getBeginDate();
				LocalDateTime dateEnd = getAllroutine.get(i).getEndDate();

				//save con
				Report reportUpdate = new Report();
				reportUpdate.setReportId(routineId);
				reportUpdate.setReportTypeId(routineType);
				reportUpdate.setDeviceId(deviceId);
				reportUpdate.setReportTittle(routineName);
				reportUpdate.setCommitmentDate(datecompro);
				reportUpdate.setBeginDate(dateBegin);
				reportUpdate.setEndDate(dateEnd);
				reportUpdate.setStatus(2);
				reportUpdate.setReviewATM(true);
				reportService.save(reportUpdate);


				//creacion de nueva rutina
					//int id = reportService.getAll().size() +1;
					int routineTypeN = getAllroutine.get(i).getReportTypeId();
					String routineNameN = getAllroutine.get(i).getReportTittle();
					int deviceIdN = getAllroutine.get(i).getDeviceId();
					//fecha de hoy mas 15 dias para fecha compromiso
					LocalDateTime dateCommitment = Instant.ofEpochMilli(now.getTime()+1296000000).atZone(ZoneId.systemDefault()).toLocalDateTime();
					//save nueva rutina
					Report newReport = new Report();
					//newReport.setReportId(id);
					newReport.setReportTypeId(routineTypeN);
					newReport.setDeviceId(deviceIdN);
					newReport.setReportTittle(routineNameN);
					newReport.setCommitmentDate(dateCommitment);
					newReport.setBeginDate(now2);
					newReport.setEndDate(null);
					newReport.setStatus(2);
					reportService.save(newReport);

			}
		}

}
}
