package com.kk.spring.springbasicexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.spring.springbasicexample.model.Customer;
import com.kk.spring.springbasicexample.model.Employee;

/**
 * Spring Example
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("*************Employee************");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.print(employee);
        System.out.println("\n*************End************\n");
        System.out.println("*************Customer************");
        Customer customer = context.getBean("customer1",  Customer.class);
        System.out.println(customer);
        System.out.println("*************End************");
        ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext) context;
        ctx.close();
    }
}
