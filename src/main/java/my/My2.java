package my;

import annotation.Hello;
import entity.Animal;
import entity.MyAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class My2 {
    public static void main(String[] args) throws NoSuchFieldException, IntrospectionException, InvocationTargetException, IllegalAccessException {
        MyAnnotation myAnnotation = new MyAnnotation();
        Field[] fields = MyAnnotation.class.getDeclaredFields(); //获取MyAnnotation类中所有的公共字段
        for (Field field : fields){
            //PropertyDescriptor类表示JavaBean类通过存储器导出一个属性
            PropertyDescriptor pd = new PropertyDescriptor(field.getName(), MyAnnotation.class);//获取bean的某个属性的描述符
            Method method = pd.getWriteMethod(); //getWriteMethod()，获得用于写入属性值的方法；
            method.invoke(myAnnotation,field.getAnnotation(Hello.class).name());//写入属性值
        }
        System.out.println(myAnnotation);

    }
}
