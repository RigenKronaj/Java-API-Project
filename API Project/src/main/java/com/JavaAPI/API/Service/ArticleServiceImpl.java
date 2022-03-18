package com.JavaAPI.API.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService{

    public Collection<String[]> getData() {
        List<List<String>> records = new ArrayList<>();
        Map<Integer, String[]> map = new HashMap<>();
        AtomicLong counter = new AtomicLong();
        
        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(", ");
                    records.add(Arrays.asList(values));
                    if(Integer.parseInt(values[2]) < Integer.parseInt(values[3]))
                        map.put((int)counter.incrementAndGet(), values);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        return map.values();
    }

    @Override
    public Object[] updateArticle() {
        List<List<String>> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(", ");
                records.add(Arrays.asList(values));
                if(Integer.parseInt(values[2]) < Integer.parseInt(values[3]))
                {
                    values[5] = "18/03/2022";
                    values[6] = "TRUE";
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records.toArray();
    }
}
