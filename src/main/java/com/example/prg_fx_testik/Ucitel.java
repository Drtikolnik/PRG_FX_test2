package com.example.prg_fx_testik;

public class Ucitel {

    private String jmeno;
    private String vyucovanyPredmet;
    private int hodnoceni;


    public Ucitel(String jmeno, String vyucovanyPredmet, int hodnoceni) {
        this.jmeno = jmeno;
        this.vyucovanyPredmet = vyucovanyPredmet;
        this.hodnoceni = hodnoceni;
    }

    public String toString(){
        return this.jmeno;
    }


    public String getJmeno() {
        return jmeno;
    }

    public String getVyucovanyPredmet() {
        return vyucovanyPredmet;
    }

    public int getHodnoceni() {
        return hodnoceni;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setVyucovanyPredmet(String vyucovanyPredmet) {
        this.vyucovanyPredmet = vyucovanyPredmet;
    }

    public void setHodnoceni(int hodnoceni) {
        this.hodnoceni = hodnoceni;

    }


}
