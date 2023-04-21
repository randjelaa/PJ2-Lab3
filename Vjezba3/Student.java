//package org.unibl.etf.pj2.student;

//import org.unibl.etf.pj2.util.Util;

public class Student {
    private String ime, prezime;
    private Integer brispita;

    Student () {
    }

    Student (String ime, String prezime, Integer brispita) {
        this.ime=ime;
        this.prezime=prezime;
        this.brispita=brispita;
    }

    public String getIme () {
        return this.ime;
    }

    public void setIme (String ime) {
        this.ime=ime;
    }

    public String getPrezime () {
        return this.prezime;
    }

    public void setPrezime (String prezime) {
        this.prezime=prezime;
    }

    public Integer getBrispita () {
        return this.brispita;
    }

    public void setBrispita (Integer brispita) {
        this.brispita=brispita;
    }

    public String getFullNameReverse () {
        return new StringBuilder(Util.concat(ime, prezime)).reverse().toString();
    }
}
