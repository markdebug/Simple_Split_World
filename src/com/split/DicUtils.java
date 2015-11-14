package com.split;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DicUtils {

    static Map<String, String> dicMap = new HashMap<>(220000);

    static {
        loadFile("source/chars.dic");
        loadFile("source/words.txt");
    }

    public static void loadFile(String name) {
        BufferedReader read = null;
        try {
            read = new BufferedReader(new InputStreamReader(new FileInputStream(new File(name))));
            String line;
            int leg;
            while ((line = read.readLine()) != null) {
                leg = line.indexOf(" ");
                if (leg != -1)
                    dicMap.put(line.substring(0, leg), "1");
                else
                    dicMap.put(line, "1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean match(String world) {
        if (dicMap.get(world) != null)
            return true;
        return false;
    }

}
