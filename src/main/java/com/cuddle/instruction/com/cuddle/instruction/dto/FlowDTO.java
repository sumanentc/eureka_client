package com.cuddle.instruction.com.cuddle.instruction.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by suman.das on 1/6/17.
 */
public class FlowDTO implements Serializable {

    private String label;
    private String version;
    private String onError;
    private String onConditionFail;
    private ContextDTO contextDTO;
    private List<RuleDTO> rules;

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

    public String getOnError() {
        return onError;
    }

    public void setOnError(String onError) {
        this.onError = onError;
    }

    public String getOnConditionFail() {
        return onConditionFail;
    }

    public void setOnConditionFail(String onConditionFail) {
        this.onConditionFail = onConditionFail;
    }

    public ContextDTO getContextDTO() {
        return contextDTO;
    }

    public void setContextDTO(ContextDTO contextDTO) {
        this.contextDTO = contextDTO;
    }

    public List<RuleDTO> getRules() {
        return rules;
    }

    public void setRules(List<RuleDTO> rules) {
        this.rules = rules;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FlowDTO{");
        sb.append("label='").append(label).append('\'');
        sb.append(", version='").append(version).append('\'');
        sb.append(", onError='").append(onError).append('\'');
        sb.append(", onConditionFail='").append(onConditionFail).append('\'');
        sb.append(", contextDTO=").append(contextDTO);
        sb.append(", rules=").append(rules);
        sb.append('}');
        return sb.toString();
    }
}
