package com.kk.spring_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.spring_aop.aop.Operation;
import com.kk.spring_aop.model.CustomerService;

/**
 * Spring AOP Example
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*Advice*/
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        
        CustomerService customerService = (CustomerService) ctx.getBean("customerServiceAroundProxy");
        customerService.printName();
        customerService.printUrl();
        try {
        	customerService.printThrowException();
        }catch (Exception e) {
			// TODO: handle exception
		}
        
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) ctx;
        context.close();
        System.out.println("********END*******\n");
        /*Annotation based AspectJ
         * */
        
        ApplicationContext ctx1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Operation e = (Operation) ctx1.getBean("opBean");
        System.out.println("calling msg");
        e.msg();
        System.out.println("calling m...");
        e.m();
        System.out.println("calling k...");
        e.k();
        
    }
}
