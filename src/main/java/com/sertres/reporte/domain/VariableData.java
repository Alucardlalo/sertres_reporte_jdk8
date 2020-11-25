package com.sertres.reporte.domain;

public class VariableData {

    private int variableDataId;

    private int ReportId;

    private int variableId;

    private String data;

    private Report report1;

    public Report getReport1() {
        return report1;
    }

    public void setReport1(Report report1) {
        this.report1 = report1;
    }

    public int getVariableDataId() {
        return variableDataId;
    }

    public void setVariableDataId(int variableDataId) {
        this.variableDataId = variableDataId;
    }

    public int getReportId() {
        return ReportId;
    }

    public void setReportId(int reportId) {
        ReportId = reportId;
    }

    public int getVariableId() {
        return variableId;
    }

    public void setVariableId(int variableId) {
        this.variableId = variableId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    //geter and setter relacion


}
