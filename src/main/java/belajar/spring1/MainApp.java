package belajar.spring1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import tdi.bootcamp.belajar.spring1.service.HitungLuasServices;

public class MainApp {
    
//    public static void main(String[] args) {
//    XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("appconfig.xml"));
////    Menghitung luas dari hasil persegi
//    HitungLuasServices pers = (HitungLuasServices)factory.getBean("luasPersegi");
//        System.out.println(pers.hitungLuasHasil(15, 10));
//    
//////    Menghitung luas dari hasil lingkaran
////    HitungLuasServices ling = (HitungLuasServices)factory.getBean("luasLingkaran");
////    System.out.println(ling.hitungLuasPersegiP(10, 15));
//    }
    
    //Anot dengan package pada xml
    public static void main(String[] args) {
    org.springframework.context.support.AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"appconfig.xml"});
    HitungLuasServices nilai = (HitungLuasServices) context.getBean("hitungLuasServices"); //nama getBean bisa dganti sesuai di clasa service(" ")
    System.out.println(" hasil == " + nilai.hitungLuasHasil(40,30));
    }
}