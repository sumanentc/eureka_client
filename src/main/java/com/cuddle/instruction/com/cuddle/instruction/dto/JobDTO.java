package com.cuddle.instruction.com.cuddle.instruction.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by suman.das on 1/6/17.
 */
public class JobDTO implements Serializable{
    private String onError;
    private List<FlowDTO> flows;

    public String getOnError() {
        return onError;
    }

    public void setOnError(String onError) {
        this.onError = onError;
    }

    public List<FlowDTO> getFlows() {
        return flows;
    }

    public void setFlows(List<FlowDTO> flows) {
        this.flows = flows;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JobDTO{");
        sb.append("onError='").append(onError).append('\'');
        sb.append(", flows=").append(flows);
        sb.append('}');
        return sb.toString();
    }
}
