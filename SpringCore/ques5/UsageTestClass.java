package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.AppConfig;
import beans.UsageClass;

public class UsageTestClass {
    public static void main(String[] args) {
    	ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        UsageClass use= (UsageClass)context.getBean(UsageClass.class);
        use.usage();
    }
}
