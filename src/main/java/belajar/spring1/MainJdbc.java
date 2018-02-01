/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.spring1;

import JdbcSpring.Anot;
import JdbcSpring.NameJdbc;
import JdbcSpring.Pegawai;
import JdbcSpring.Repost;
import JdbcSpring.Tugas;
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
    
//Mengambil dari class repost    
//    Repost repost = (Repost) context.getBean("database");
//    
//    List<Pegawai> listpeg = repost.getPegawai();
//    for (Pegawai peg : listpeg) {
//    System.out.println(peg.getIdPegawai()+ " | " + peg.getNama()+ " | " +peg.getAlamat());
//    }
    
//    listpeg.forEach((peg) -> {
//        System.out.println(peg.getNama());
//    });

//Idnya sudah diketahui karna ada di postgre tinggal dpanggil dari java
//    Pegawai idPeg = repost.getIdPegawai(12);
//    System.out.println(" idPeg " + idPeg.getNama());
    
//Mengambil dari class nameJdbc
//    NameJdbc nameJdbc = (NameJdbc) context.getBean("namaparam");
//        
//    List<Pegawai> listpeg = nameJdbc.getPegawaiNamedParam("nama");
//    for (Pegawai peg : listpeg) {
//    System.out.println(peg.getIdPegawai()+ " | " + peg.getNama()+ " | " +peg.getAlamat());
//    }

//Menginput data baru pada tabel Tugas
    NameJdbc nameJdbc = (NameJdbc) context.getBean("namaparam");
        
    Tugas tugas = new Tugas();
    tugas.setIdTugas(46);
    tugas.setIdEntry("entrytask32");
    tugas.setNamaTugas("tugas 32");
    tugas.setId(26);
    nameJdbc.saveTugas(tugas);
    
    context.close();
   }
}