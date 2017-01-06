package com.cuddle.instruction.com.cuddle.instruction.dto;

import java.io.Serializable;

/**
 * Created by suman.das on 1/6/17.
 */
public class ContextDTO implements Serializable{
    private String version;
    private String domain;
    private Object blueprint;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Object getBlueprint() {
        return blueprint;
    }

    public void setBlueprint(Object blueprint) {
        this.blueprint = blueprint;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContextDTO{");
        sb.append("version='").append(version).append('\'');
        sb.append(", domain='").append(domain).append('\'');
        sb.append(", blueprint=").append(blueprint);
        sb.append('}');
        return sb.toString();
    }
}
