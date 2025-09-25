/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;



    

public class PinModel {
    private String kod = "";    
    private final int KOD_HOSSZ = 4;
    private final Path fajlUtvonal;
    
    public PinModel(Path fajlUtvonal) {
        this.fajlUtvonal = fajlUtvonal;
    }
    
    
    public void hozzaadSzamjegy(String szam) {
        if (kod.length() < KOD_HOSSZ) {
            kod += szam;
        }
    }
    
    
    public boolean keszVan() {
        return kod.length() == KOD_HOSSZ;
    }
    
    
    public String getKod() {
        return kod;
    }
    
   public void mentes() throws IOException {
        Files.writeString(fajlUtvonal, kod);
    }
   
   
   public String FilebolBetoltes() throws IOException {
        if (Files.exists(fajlUtvonal)) {
            return Files.readString(fajlUtvonal);
        }
        return "";
    }
}


