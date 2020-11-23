package com.sertres.reporte.domain;

public class VariableData {

    private int variableDataId;

    private int ReportId;

    private int variableId;

    private String data;

    private Report reports;

    private VariableI variablesI;

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
    public Report getReports() {
        return reports;
    }

    public void setReports(Report reports) {
        this.reports = reports;
    }

    public VariableI getVariablesI() {
        return variablesI;
    }

    public void setVariablesI(VariableI variablesI) {
        this.variablesI = variablesI;
    }
}
