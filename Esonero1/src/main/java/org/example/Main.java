package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        Random r = new Random();


            String e1="";
            String filename = ""+System.currentTimeMillis()+".txt";
            for (int j = 0; j < 10000; j++) {
                String[] programmingLanguages = {"Java", "Python ", "Javascript"};
                int languages = r.nextInt(3);
                ProgrammingLanguage[] pls = new ProgrammingLanguage[languages];
                for (int i = 0; i < languages; i++) {
                    int version = r.nextInt(8);
                    pls[i] = new ProgrammingLanguage(programmingLanguages[i], "Version " + i + " of " + programmingLanguages[i]);
                }
                int x = r.nextInt(156);
                int prov = x % 10;
                Employee ginoTmp = new Employee("Gino " + j, "Gino " + String.valueOf(j % 26), 99, new City("City " + x, "Province " + prov), pls);
                e1+= String.valueOf(ginoTmp.getJson())+"\n";
            }
            HdfsManager.getInstance().createNewFile(filename, e1);




    }


}

