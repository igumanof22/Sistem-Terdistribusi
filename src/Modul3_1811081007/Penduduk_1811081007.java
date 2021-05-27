/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3_1811081007;

import java.io.Serializable;

/**
 *
 * @author RyderPhantom
 */
public class Penduduk_1811081007 implements Serializable{
    private String NIK;
    private String Nama;
    private String KK;
    private String Alamat;
    private String Pendidikan;

    public Penduduk_1811081007() {
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setKK(String KK) {
        this.KK = KK;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setPendidikan(String Pendidikan) {
        this.Pendidikan = Pendidikan;
    }  
}
