package Applicants;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Skills", schema = "Applicant")
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull

    private String jobSkill;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJobSkill() {
        return jobSkill;
    }

    public void setJobSkill(String jobSkill) {
        this.jobSkill = jobSkill;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "id=" + id +
                ", jobSkill='" + jobSkill + '\'' +
                '}';
    }
}

