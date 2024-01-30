package com.javaesimerkki.gettersetter;

public class App {
    public static void main(String[] args) throws Exception {
                // Luodaan Henkilö-olio
                Henkilo henkilo = new Henkilo("Matti", 30);

                // Käytetään gettereitä ja tulostetaan tiedot
                System.out.println("Nimi: " + henkilo.getNimi());
                System.out.println("Ikä: " + henkilo.getIka());
        
                // Käytetään settereitä muuttaaksemme tietoja
                henkilo.setNimi("Maija");
                henkilo.setIka(25);
        
                // Tulostetaan päivitetyt tiedot
                System.out.println("Nimi: " + henkilo.getNimi());
                System.out.println("Ikä: " + henkilo.getIka());
    }
}
