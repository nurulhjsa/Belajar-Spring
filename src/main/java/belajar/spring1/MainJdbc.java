/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.spring1;

import JdbcSpring.Anot;
import JdbcSpring.Pegawai;
import JdbcSpring.Repost;
import com.sun.org.apache.xerces.internal.impl.xs.XSDDescription;
import com.sun.org.apache.xerces.internal.xni.grammars.XMLSchemaDescription;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author rodiyatunmardiyah
 */
public class MainJdbc {
    public static void main (String[] abc) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Anot.class);
    
    Repost repost = (Repost) context.getBean("database");
    
    List<Pegawai> listpeg = repost.getPegawai();
    for (Pegawai peg : listpeg) {
    System.out.println(peg.getIdPegawai()+ " | " + peg.getNama()+ " | " +peg.getAlamat());
    }
    
//    listpeg.forEach((peg) -> {
//        System.out.println(peg.getNama());
//    });
    
    context.close();
   }
}