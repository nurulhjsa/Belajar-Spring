/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcSpring;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rodiyatunmardiyah
 */
@Repository ("namaparam")
public class NameJdbc {
    
    @Autowired 
    private JdbcTemplate jdbcTemplate ;
    
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate ;
    
//  Insert Tugas pada postgre
    public void saveTugas (Tugas tugas) {
        Map<String, Object> param = new HashMap<>();
        param.put("idTugas", tugas.getIdTugas());
        param.put("idEntry", tugas.getIdEntry());
        param.put("dEntry", new Timestamp(System.currentTimeMillis()));
        param.put("namaTugas", tugas.getNamaTugas());
        param.put("id", tugas.getId());
        namedParameterJdbcTemplate.update("INSERT INTO tugas( "
        + "         id_tugas, id_Entry, d_entry, nama_tugas, id) "
              + "   VALUES (:idTugas, :idEntry, :dEntry, :namaTugas, :id) ",param);
    }
            
    //Mengambil semua data pegawai yang ada di postgre
    public List<Pegawai> getPegawaiNamedParam(String nama){
        Map <String, String> param = new HashMap<>();
        param.put("paramNama", nama);
        return namedParameterJdbcTemplate.query(" SELECT id, nama, alamat FROM pegawai WHERE nama LIKE CONCAT('%',:paramNama,'%')",
            param,(abc, rowNum)-> {
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
