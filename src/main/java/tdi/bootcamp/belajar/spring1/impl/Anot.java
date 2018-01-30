/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdi.bootcamp.belajar.spring1.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author rodiyatunmardiyah
 */
@Configuration
public class Anot {
    @Bean 
    public HitungPersegi hitungPersegi(){
        return new HitungPersegi();
   }
    
    @Bean
    public HitungLingkaran hitungLingkaran(){
        return new HitungLingkaran();
    }
}
