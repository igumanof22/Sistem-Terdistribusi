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
public class Mahasiswa_1811081007 implements Serializable{
    private static final long serialVersionUID = 6529685098267757690L;
    private String Nama;
    private String NoBp;
    private String Jekel;
    private String NoTelp;

    public Mahasiswa_1811081007(String Nama, String NoBp, String Jekel, String NoTelp) {
        this.Nama = Nama;
        this.NoBp = NoBp;
        this.Jekel = Jekel;
        this.NoTelp = NoTelp;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNoBp() {
        return NoBp;
    }

    public void setNoBp(String NoBp) {
        this.NoBp = NoBp;
    }

    public String getJekel() {
        return Jekel;
    }

    public void setJekel(String Jekel) {
        this.Jekel = Jekel;
    }

    public String getNoTelp() {
        return NoTelp;
    }

    public void setNoTelp(String NoTelp) {
        this.NoTelp = NoTelp;
    }
    
}