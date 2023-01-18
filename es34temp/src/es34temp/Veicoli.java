/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es34temp;

import java.io.*;
import java.time.*;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 *
 * @author NICOLASDAGOSTINI
 */
public class Veicoli {
    
    public void readXMLFile(String filePath, double sogl) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(filePath);
        doc.getDocumentElement().normalize();

        NodeList vList = doc.getElementsByTagName("veicolo");

        for (int i = 0; i < vList.getLength(); i++) {
            Node vNode = vList.item(i);
            if (vNode.getNodeType() == Node.ELEMENT_NODE) {
                Element vElement = (Element) vNode;
                String id = vElement.getElementsByTagName("ID").item(0).getTextContent();
                NodeList mList = vElement.getElementsByTagName("misura");
                boolean bolean = true;
                List<Long> TStamp = new ArrayList<>();
                for (int j = 0; j < mList.getLength(); j++) {
                    Node mNode = mList.item(j);
                    if (mNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element mElement = (Element) mNode;
                        double temp = Double.parseDouble(mElement.getElementsByTagName("temperatura").item(0).getTextContent());
                        String ora = mElement.getElementsByTagName("data_ora").item(0).getTextContent();
                        if (temp > sogl) {
                            bolean = false;
                            LocalDateTime data = LocalDateTime.parse(ora);
                            long timstamp = data.toEpochSecond(ZoneOffset.UTC);
                            TStamp.add(timstamp);
                        }
                    }
                }
                System.out.println("Veicolo: " + id + " temperature sotto la soglia?: " + bolean);
                if (!bolean) {
                    System.out.println("Timestamp dove la temperatura e superiore: " + TStamp);
                }
            }
        }
    }  
}
