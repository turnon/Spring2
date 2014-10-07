/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.idol;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class Juggler implements Performer {

    private int beanBags = 3;

    public int getBeanBags() {
        return beanBags;
    }

    public void setBeanBags(int beanBags) {
        this.beanBags = beanBags;
    }

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
    
    public static void main(String[] arg){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/idol/idol.xml");
        
        Performer p = (Performer) ctx.getBean("duke");
        
        p.perform();
        
        Performer p2 = (Performer) ctx.getBean("poeticDuke");
        
        p2.perform();
        
        Performer p3 = (Performer) ctx.getBean("poeticDuke");
        
        System.out.println(p2 == p3); //scope="prototype" or "singleton"
        
        ApplicationContext ctx2 = new ClassPathXmlApplicationContext("com/spring/idol/idol.xml");
        
        Performer p4 = (Performer) ctx2.getBean("poeticDuke");
        
        System.out.println("poeticDuke is singleton : " + ctx.isSingleton("poeticDuke"));  
        
        System.out.println(p3 == p4);
        
        System.out.println("kenny---");
        
        Performer p5 = (Performer) ctx.getBean("kenny");
        
        p5.perform();
        
        System.out.println("jay---");
        
        Performer p6 = (Performer) ctx.getBean("jay");
        
        System.out.println(ctx.getType("jay"));  
                
        p6.perform();
        
//        List juggleres = (List)ctx.getBean("juggleres");
        
        
    }
}
