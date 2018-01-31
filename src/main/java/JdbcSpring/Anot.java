/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcSpring;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author rodiyatunmardiyah
 */

//@Configuration
//public class Anot {
//    @Bean 
//    public HitungPersegi hitungPersegi(){
//        return new HitungPersegi();
//   }
//    
//    @Bean
//    public HitungLingkaran hitungLingkaran(){
//        return new HitungLingkaran();
//    }
//}
//Atau dengan cara mengambil anot dalam satu package :
@Configuration
//@ComponentScan ("tdi.bootcamp.belajar.spring1.impl")
@ComponentScan ("JdbcSpring")
public class Anot {
    
    @Bean
    public DataSource dataSource (){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/hbn");
        dataSource.setUsername("hr");
        dataSource.setPassword("hr");
        
        return dataSource;
    }
    
    @Bean
    public JdbcTemplate jdbcTemplate(){
        
        return new JdbcTemplate (dataSource());
    }   
}