package com.sertres.reporte.domain;

import java.time.LocalDateTime;

public class Report {

    private int reportId;

    private int reportTypeId;

    private int deviceId;

    private String reportTittle;

    private LocalDateTime commitmentDate;

    private LocalDateTime beginDate;

    private LocalDateTime endDate;

    private int status;

    private ReportType reportType;

    public ReportType getReportType() {
        return reportType;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public int getReportTypeId() {
        return reportTypeId;
    }

    public void setReportTypeId(int reportTypeId) {
        this.reportTypeId = reportTypeId;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    //relationshio with device and

    private Device deviceRel;

    public Device getDeviceRel() {
        return deviceRel;
    }

    public void setDeviceRel(Device deviceRel) {
        this.deviceRel = deviceRel;
    }
}
