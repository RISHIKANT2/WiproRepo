package com.wipro.DIproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService obj= context.getBean(OrderService.class);
        obj.setOrder("Lapinos Pizza");
        obj.setPayment("UPI");
        obj.order();
        
    }
}
