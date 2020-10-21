package my;

import entity.Animal;
import entity.Student;
import entity.Teacher;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class My {
    public static void main(String[] args) {
        String conf = "applicationContext.xml";
        //饿汉
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        //懒汉
        //BeanFactory ac2 = new ClassPathXmlApplicationContext(conf);

        /*Student stu1 = ac.getBean("student", Student.class);
        System.out.println(stu1);*/

        //默认单例
        //Student stu2 = ac.getBean("stu", Student.class);
        //System.out.println(stu1==stu2); //true

        //销毁bean对象
        //((ClassPathXmlApplicationContext)ac).close();

        /*Teacher tea = ac.getBean("tea", Teacher.class);
        System.out.println(tea);*/

        Animal animal = ac.getBean("animal", Animal.class);
        System.out.println(animal);
    }
}
