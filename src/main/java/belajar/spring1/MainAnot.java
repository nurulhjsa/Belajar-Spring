/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import JdbcSpring.Anot;
import tdi.bootcamp.belajar.spring1.impl.HitungLingkaran;
import tdi.bootcamp.belajar.spring1.impl.HitungPersegi;
import tdi.bootcamp.belajar.spring1.service.HitungServices;

/**
 *
 * @author rodiyatunmardiyah
 */
public class MainAnot {
    
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Anot.class);

    	HitungPersegi psgi = (HitungPersegi)context.getBean(HitungPersegi.class);
    	System.out.println(psgi.hitungLuas(10));
        
        HitungLingkaran lgkr = (HitungLingkaran)context.getBean(HitungLingkaran.class);
    	System.out.println(lgkr.hitungLuas(20));

//      Memanggil package anot
//        HitungPersegi psgi = (HitungPersegi)context.getBean("hsPersegi");
//    	System.out.println(psgi.hitungLuas(10));
//        
//        HitungLingkaran lgkr = (HitungLingkaran)context.getBean("hsLingkaran");
//    	System.out.println(lgkr.hitungLuas(20));
    }
}