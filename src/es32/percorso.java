/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es32;

import java.io.IOException;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;


public class percorso {
    
    private List<posizione> posizioni;

    public percorso() {
        posizioni = new ArrayList<posizione>();
    }

    public List parseDocument(String filename)
            throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory;
        DocumentBuilder builder;
        Document document;
        Element root, element;
        NodeList nodelist;
        posizione p;
		
        // creazione dell’albero DOM dal documento XML
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(filename);
        root = document.getDocumentElement();
        // generazione della lista degli elementi "posizione"
        nodelist = root.getElementsByTagName("posizione");
        if (nodelist != null && nodelist.getLength() > 0) {
            for (int i = 0; i < nodelist.getLength(); i++) {
                element = (Element) nodelist.item(i);
                p = getPosizione(element);
                posizioni.add(p);
            }
        }
        return posizioni;
    }

    private posizione getPosizione(Element element) {
        posizione p;
        String latitudine = getTextValue(element, "latitudine");//String latitudine = element.getAttribute("latitudine");
        String longitudine = getTextValue(element, "longitudine");
        String altitudine = getTextValue(element, "altitudine");
        String dataOre = getTextValue(element, "dataOre");
        p = new posizione(latitudine, longitudine, altitudine, dataOre);
        return p;
    }
    
    // restituisce il valore testuale dell’elemento figlio specificato
    private String getTextValue(Element element, String tag) {
        String value = null;
        NodeList nodelist;
        nodelist = element.getElementsByTagName(tag);
        if (nodelist != null && nodelist.getLength() > 0) {
            value = nodelist.item(0).getFirstChild().getNodeValue();
        }
        return value;
    }
    
    // restituisce il valore intero dell’elemento figlio specificato
    private int getIntValue(Element element, String tag) {
        return Integer.parseInt(getTextValue(element, tag));
    }
    
    // restituisce il valore numerico dell’elemento figlio specificato
    private float getFloatValue(Element element, String tag) {
        return Float.parseFloat(getTextValue(element, tag));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<posizione> posizioni = null;
        percorso per = new percorso();
		
        try {
            posizioni = per.parseDocument(args[0]);
        } catch (ParserConfigurationException | SAXException | IOException exception) {
            System.out.println("Errore!");
        }
        // iterazione della lista e visualizzazione degli oggetti
        System.out.println("Numero di percorsi: " + posizioni.size());
        Iterator iterator = posizioni.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
    
}
