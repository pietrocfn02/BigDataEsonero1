package org.example;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class HdfsManager {

    private static HdfsManager instance;

    private FileSystem fs;
    private FSDataInputStream fsInputStream;
    private BufferedReader bufferedReader;

    private HdfsManager(){
        long timestamp = System.currentTimeMillis();
        try {
            fs = FileSystem.get(new Configuration());
        }
        catch (IOException e) {
            System.err.println("I'm really sad for that :(");
        }
    }


    public static HdfsManager getInstance() {
        if (instance == null) {
            instance = new HdfsManager();
        }

        return instance;
    }




    public boolean createNewFile (String path, String text) {

        try {
            FSDataOutputStream f = fs.create(new Path(path));
            f.writeBytes(text);
            // CHiusami tutt0!

            f.close();
        } catch (Exception e) {
            System.err.println("I'm really sad for that :(, but i'm not able to create that file!");
            return false;
        }
        return true;
    }

}
