package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component  //等价于在applicationContext.xml中配置 <bean id="animal" class="entity.Animal" />
public class Animal {
    private Integer age;
    @Value("tom")
    private String name;
    @Value("女")
    private String gender;

    //@Resource(name = "tea")  // autowire="byName"
    @Autowired(required = false)  //相当于 autowire="byType" ,required = false 让找不到teacher不报异常
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @PostConstruct
    public void init(){
        System.out.println("Animal初始化");
    }
    @PreDestroy
    public void destory(){
        System.out.println("Animal销毁了");
    }

    public Integer getAge() {
        return age;
    }

    @Value("20")
    public void setAge(Integer age) {
        this.age = age;
    }

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
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
