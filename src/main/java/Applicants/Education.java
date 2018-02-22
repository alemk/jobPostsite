package Applicants;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Table(name="Education", schema = "Applicant")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @NotNull
    private String degreetype;
    @NotNull
    private String degreename;
    @NotNull
    private String school;
    @NotNull
    private String year;

    public Education() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDegreetype() {
        return degreetype;
    }

    public void setDegreetype(String degreetype) {
        this.degreetype = degreetype;
    }

    public String getDegreename() {
        return degreename;
    }

    public void setDegreename(String degreename) {
        this.degreename = degreename;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Education{" +
                "id=" + id +
                ", degreetype='" + degreetype + '\'' +
                ", degreename='" + degreename + '\'' +
                ", school='" + school + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
