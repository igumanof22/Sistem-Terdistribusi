/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5_1811081007;

import java.io.Serializable;

/**
 *
 * @author RyderPhantom
 */
public class Pesan_1811081007 implements Serializable{
    private String nama, pesan;
    
    @Override
    public String toString(){
        return "["+nama+"] "+pesan;
    }

    public Pesan_1811081007(String nama, String pesan) {
        this.nama = nama;
        this.pesan = pesan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
    
}
