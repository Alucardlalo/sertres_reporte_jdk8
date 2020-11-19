package com.sertres.reporte.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class Report {

    private Integer reportId;

    private Integer reportTypeId;

    private Integer deviceId;

    private String reportTittle;

    private LocalDateTime commitmentDate;

    private LocalDateTime beginDate;

    private LocalDateTime endDate;

    private String status;

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Integer getReportTypeId() {
        return reportTypeId;
    }

    public void setReportTypeId(Integer reportTypeId) {
        this.reportTypeId = reportTypeId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getReportTittle() {
        return reportTittle;
    }

    public void setReportTittle(String reportTittle) {
        this.reportTittle = reportTittle;
    }

    public LocalDateTime getCommitmentDate() {
        return commitmentDate;
    }

    public void setCommitmentDate(LocalDateTime commitmentDate) {
        this.commitmentDate = commitmentDate;
    }

    public LocalDateTime getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDateTime beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
