package ai.cuddle.instruction.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by suman.das on 1/6/17.
 */
public class InstructionDTO implements Serializable{
    private String version;
    private List<RuleDTO> rules;
    private ContextDTO context;
    private JobDTO job;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<RuleDTO> getRules() {
        return rules;
    }

    public void setRules(List<RuleDTO> rules) {
        this.rules = rules;
    }

    public ContextDTO getContext() {
        return context;
    }

    public void setContext(ContextDTO context) {
        this.context = context;
    }

    public JobDTO getJob() {
        return job;
    }

    public void setJob(JobDTO job) {
        this.job = job;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InstructionDTO{");
        sb.append("version='").append(version).append('\'');
        sb.append(", rules=").append(rules);
        sb.append(", context=").append(context);
        sb.append(", job=").append(job);
        sb.append('}');
        return sb.toString();
    }
}
