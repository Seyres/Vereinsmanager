/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vereinsmanager;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Timo
 */
public class XMLSerializer {

    public static void serializeToXML(ArrayList<Object> object, ESaveObject SaveObject) throws IOException {
        FileOutputStream fos = new FileOutputStream(SaveObject.toString() + ".xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.setExceptionListener((Exception e) -> {
            System.out.println("Exception! :" + e.toString());
        });
        encoder.writeObject(object);
        encoder.close();
        fos.close();
    }
    
     public static Object deserializeFromXML(ESaveObject SaveObject) throws IOException {
        FileInputStream fis = new FileInputStream(SaveObject.toString() + ".xml");
        XMLDecoder decoder = new XMLDecoder(fis);
        Object decodedEntity = decoder.readObject();
        decoder.close();
        fis.close();
        return decodedEntity;
    }

}
