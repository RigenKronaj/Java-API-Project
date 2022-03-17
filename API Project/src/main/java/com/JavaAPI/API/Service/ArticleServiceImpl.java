package com.JavaAPI.API.Service;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService{

    /*public JSONObject readData() {
        JSONObject jsonObject = new JSONObject();
        List<List<String>> records = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
            try (PrintWriter fileOutput = new PrintWriter(new BufferedWriter(new FileWriter("data.txt")))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    records.add(Arrays.asList(values));
                    if(Integer.parseInt(values[2]) < Integer.parseInt(values[3]))
                    {
                        jsonObject.put("EAN", values[0]);
                        jsonObject.put("Product name", values[1]);
                        jsonObject.put("Current stock", values[2]);
                        jsonObject.put("Minimum stock", values[3]);
                        jsonObject.put("Price", values[4]);
                        jsonObject.put("Date", values[5]);
                        jsonObject.put("In order", values[6]);
                    }
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }*/

    public Collection<String[]> getData() {
        List<List<String>> records = new ArrayList<>();
        Map<String, String[]> map = new HashMap<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(", ");
                    records.add(Arrays.asList(values));
                    if(Integer.parseInt(values[2]) < Integer.parseInt(values[3]))
                    {
                        map.put("Article: ", values);
                    }
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        return map.values();
    }

    /*@Override
    public void updateArticle() {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(", ");
                records.add(Arrays.asList(values));
                if(Integer.parseInt(values[2]) < Integer.parseInt(values[3]))
                {
                    values[5] = "17/03/2022";
                    values[6] = "true";
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
