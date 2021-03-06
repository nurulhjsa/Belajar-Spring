/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcSpring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rodiyatunmardiyah
 */
@Repository ("database")
public class Repost {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    //Mengambil semua data pegawai yang ada di postgre
    public List<Pegawai> getPegawai(){
     
        return jdbcTemplate.query(" SELECT id, nama, alamat FROM pegawai ",
                new Object[] {},
            (abc, rowNum)-> {
                Pegawai peg = new Pegawai();
                peg.setIdPegawai(abc.getInt("id"));
                peg.setNama(abc.getString("nama"));
                peg.setAlamat(abc.getString("alamat"));            
                return peg;
        });
    }
    
    //Mengambil Data khusus untuk 1 object yang dipanggil tambahkan pada parameternya
        public Pegawai getIdPegawai(int id){
     
        return jdbcTemplate.queryForObject(" SELECT id, nama, alamat FROM pegawai WHERE id = ? ",
                new Object[] { id},
            (abc, rowNum)-> {
                Pegawai peg = new Pegawai();
                peg.setIdPegawai(abc.getInt("id"));
                peg.setNama(abc.getString("nama"));
                peg.setAlamat(abc.getString("alamat"));            
                return peg;
        });
    }
}
