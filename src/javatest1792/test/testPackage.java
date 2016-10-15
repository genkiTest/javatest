/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest1792.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author genki_desk
 */
public class testPackage {
    private static testPackage instans;
    private static FileWriter fw;
    private testPackage(){
        try {
            this.fw = new FileWriter("C:\\Users\\owner\\Documents\\test.txt",true);
            
        } catch (IOException ex) {
            Logger.getLogger(testPackage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void log(String s){
        try {
            this.fw.write(s);
        } catch (IOException ex) {
            Logger.getLogger(testPackage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static testPackage getInstans(){
        if(instans==null){
            instans =new testPackage();
            return instans;
        }else {
            return instans;
        }
    }
    public static void fileReder(){
        try {
            fw.close();
            Stream<String> lines = Files.lines(Paths.get("C:\\Users\\owner\\Documents\\test.txt"));
            lines.forEach(line ->{
                System.out.println(line);
            }
            );
        } catch (IOException ex) {
            Logger.getLogger(testPackage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
