package org.jplus.utilities;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CsvReader {
    public static void main(String[] args) throws IOException {
        new CsvReader().printAsOutputStream();
    }

    public void printAsOutputStream() throws IOException {
        String line;
        try (Reader reader = new InputStreamReader(new FileInputStream("D://mp.csv"), "gbk");
             BufferedReader br = new BufferedReader(reader);
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D://mp2-new.csv"), "UTF-8"))
        ) {

            Map<String, Float> map = new HashMap<>();

            //skip header
            line = br.readLine();
            line = br.readLine();
            int i = 0;
            int ignored = 0;
            while (line != null) {
                String[] lines = line.split(",");
                String key = lines[4].trim() + "," + lines[5].trim() + "," + lines[19] + ",";
                if (map.keySet().contains(key)) {
                    map.put(key, map.get(key) + Float.valueOf(lines[17]));
                } else {
                    map.put(key, Float.valueOf(lines[17]));
                }
                line = br.readLine();
                i++;
            }
            System.out.println("writing...");
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                writer.write(entry.getKey() + entry.getValue() + "\n");
            }
            System.out.println(i);
            System.out.println(ignored);
        }
    }
}