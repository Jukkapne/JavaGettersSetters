package com.javaesimerkki.gettersetter;

public class Henkilo {
    // Yksityiset attribuutit
    private String nimi;
    private int ika;

    // Konstruktori
    public Henkilo(String nimi, int ika) {
        this.nimi = nimi;
        this.ika = ika;
    }

    // Getter nimen hakemiseen
    public String getNimi() {
        return nimi;
    }

    // Setter nimen asettamiseen
    public void setNimi(String nimi) {
        // Tarkistetaan, ettei nimi ole tyhjä
        if (nimi != null && !nimi.isEmpty()) {
            this.nimi = nimi;
        } else {
            System.out.println("Nimi ei voi olla tyhjä.");
        }
    }

    // Getter iän hakemiseen
    public int getIka() {
        return ika;
    }

    // Setter iän asettamiseen
    public void setIka(int ika) {
        // Tarkistetaan, ettei ikä ole negatiivinen
        if (ika >= 0) {
            this.ika = ika;
        } else {
            System.out.println("Ikä ei voi olla negatiivinen.");
        }
    }
}