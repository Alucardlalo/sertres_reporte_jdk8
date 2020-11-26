package com.sertres.reporte.domain;

import com.sertres.reporte.persistence.entity.Variable;

public class VariableData {

    private int variableDataId;

    private int ReportId;

    private int variableId;

    private String data;

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

}
