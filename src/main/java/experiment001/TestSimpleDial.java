package experiment001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class TestSimpleDial {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
        Person p=ctx.getBean("person",Person.class);
        String to="10086";
        p.dial(to);

        String dialInfo=ctx.getMessage("dialInfo",new String[]{p.getName(),p.getPhone().getType(),to}, Locale.US);
//        String dialInfo=ctx.getMessage("dialInfo",new String[]{p.getName(),p.getPhone().getType(),to}, Locale.CHINESE);
        System.out.println(dialInfo);
        ctx.close();
    }
}
