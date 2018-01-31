package tdi.bootcamp.belajar.spring1.impl;

import org.springframework.stereotype.Component;
import tdi.bootcamp.belajar.spring1.service.HitungServices;

//public class HitungPersegi implements HitungServices{
//
//    public double hitungLuas(int param) {
//        
//        return param*param;
//    }
//}  

//Menggunakan Anot
@Component("hsPersegi")
public class HitungPersegi implements HitungServices{

    public double hitungLuas(int param) {
        
        return param*param;
    }
} 