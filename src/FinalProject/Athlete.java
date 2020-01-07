package FinalProject;

import java.util.Date;

public class Athlete {

    private String name;
    private Integer age;
    private Date birthDate;
    private String gender;

    public Athlete(String name, Integer age, Date birthDate, String gender) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
