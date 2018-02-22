package JobCategory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class JobPost {
    @Id
    @NotNull
    private long id;
    @NotNull
    @Column(name = "jobRole")
    private String jobRole;
    @NotNull
    public String companyName;
    @NotNull
    private String jobLocation;

    @NotNull
    private String jobRequirment;
    @NotNull
    private String jobSkill;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobRequirment() {
        return jobRequirment;
    }

    public void setJobRequirment(String jobRequirment) {
        this.jobRequirment = jobRequirment;
    }

    public String getJobSkill() {
        return jobSkill;
    }

    public void setJobSkill(String jobSkill) {
        this.jobSkill = jobSkill;
    }
}
