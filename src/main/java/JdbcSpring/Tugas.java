/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcSpring;

import java.sql.Timestamp;

/**
 *
 * @author rodiyatunmardiyah
 */
public class Tugas {
    private int idTugas;
    private String idEntry;
    private Timestamp dEntry;
    private String namaTugas;
    private int id;

    public int getIdTugas() {
        return idTugas;
    }

    public void setIdTugas(int idTugas) {
        this.idTugas = idTugas;
    }

    public String getIdEntry() {
        return idEntry;
    }

    public void setIdEntry(String idEntry) {
        this.idEntry = idEntry;
    }

    public Timestamp getdEntry() {
        return dEntry;
    }

    public void setdEntry(Timestamp dEntry) {
        this.dEntry = dEntry;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public void setNamaTugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}