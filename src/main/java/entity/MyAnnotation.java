package entity;

import annotation.Hello;

@Hello(name = "tom")
public class MyAnnotation {
    @Hello(name = "tom2")
    private String name;
    @Hello(name = "男")
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "MyAnnotation{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
