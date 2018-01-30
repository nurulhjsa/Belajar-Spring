package belajar.spring1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import tdi.bootcamp.belajar.spring1.service.HitungLuasServices;
import tdi.bootcamp.belajar.spring1.service.HitungServices;

public class Main {
        
        public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("appcfg.xml"));
////      Hitung Lingkaran
//        HitungServices ling = (HitungServices)factory.getBean("lingkaran");
//        System.out.println(ling.hitungLuas(7));
//        
////      Hitung Persegi
//        HitungServices psg = (HitungServices)factory.getBean("persegi");
//        System.out.println(psg.hitungLuas(5));

//      Menghitung Persegi dulu baru Luas Persegi
        HitungLuasServices pers = (HitungLuasServices)factory.getBean("luasPersegi");
        System.out.println(pers.hitungLuasHasil(15, 10));
    
//      Menghitung Lingkaran dulu baru Luas Lingkaran
        HitungLuasServices lin = (HitungLuasServices)factory.getBean("luasLingkaran");
        System.out.println(lin.hitungLuasHasil(10, 15));
    }
}