package tdi.bootcamp.belajar.spring1.impl;

import org.springframework.stereotype.Component;
import tdi.bootcamp.belajar.spring1.service.HitungServices;

//public class HitungLingkaran implements HitungServices{
//
//    public double hitungLuas(int param) {
//        
//        return Math.PI*param*param;
//    }

//Menggunakan Anot
//@Component("hsLingkaran")
@Component("hitungServices")
public class HitungLingkaran implements HitungServices{
    
    public double hitungLuas(int param) {
        
        System.out.println(" Hasil Lingkaran ");
        
        return Math.PI*param*param;
    }
}
