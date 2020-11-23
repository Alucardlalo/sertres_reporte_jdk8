package com.sertres.reporte.domain;

public class VariableI {

    private int variableId;

    private int reportTypeId;

    private String variableName;

    private String variableLabel;

    private int order;

    private ReportType reportType;

    private VariableData variableData;

    public int getVariableId() {
        return variableId;
    }

    public void setVariableId(int variableId) {
        this.variableId = variableId;
    }

    public int getReportTypeId() {
        return reportTypeId;
    }

    public void setReportTypeId(int reportTypeId) {
        this.reportTypeId = reportTypeId;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getVariableLabel() {
        return variableLabel;
    }

    public void setVariableLabel(String variableLabel) {
        this.variableLabel = variableLabel;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public ReportType getReportType() {
        return reportType;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType;
    }

    public VariableData getVariableData() {
        return variableData;
    }

    public void setVariableData(VariableData variableData) {
        this.variableData = variableData;
    }
}
