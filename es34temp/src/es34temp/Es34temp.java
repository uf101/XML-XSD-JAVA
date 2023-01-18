/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es34temp;

import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author NICOLASDAGOSTINI
 */
public class Es34temp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        Veicoli veicoli = new Veicoli();
        double soglia = -5;
        System.out.print("Valore: " + soglia);
        
        try {
            veicoli.readXMLFile(args[0], soglia);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.err.println("Errore durante il parsing ");
        }
    }
    
}
