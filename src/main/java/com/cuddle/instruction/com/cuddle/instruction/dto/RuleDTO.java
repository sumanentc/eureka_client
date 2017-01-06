package com.cuddle.instruction.com.cuddle.instruction.dto;

/**
 * Created by suman.das on 1/6/17.
 */
public class RuleDTO {
    private String id;
    private String label;
    private String version;
    private String service;
    private Object bluePrint;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Object getBluePrint() {
        return bluePrint;
    }

    public void setBluePrint(Object bluePrint) {
        this.bluePrint = bluePrint;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RuleDTO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", label='").append(label).append('\'');
        sb.append(", version='").append(version).append('\'');
        sb.append(", service='").append(service).append('\'');
        sb.append(", bluePrint=").append(bluePrint);
        sb.append('}');
        return sb.toString();
    }
}
