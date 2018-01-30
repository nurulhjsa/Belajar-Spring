package tdi.bootcamp.belajar.spring1.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import tdi.bootcamp.belajar.spring1.service.HitungServices;
import tdi.bootcamp.belajar.spring1.service.HitungLuasServices;

//public class HasilHitung implements HitungLuasServices{
//    
//    private HitungServices luas;
//
//    public void setLuas(HitungServices luas){
//        this.luas = luas;
//    }
//    
//    public double hitungLuasHasil(int panjang, int lebar) {
//        return luas.hitungLuas(panjang)*lebar;
//    }
//}

//Menggunakan Anot
@Service ("hitungLuasServices")
public class HasilHitung implements HitungLuasServices{
    
    @Autowired //Manggil Service
    private HitungServices luas;
    
        public double hitungLuasHasil(int panjang, int lebar) {
        System.out.println(" masuk hitung volume ");
        return luas.hitungLuas(panjang)*lebar;
    }
}