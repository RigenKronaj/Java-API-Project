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

    
    /** 
     * @return Collection<String[]>
     * </br>
     * The purpose of this method is to return only the list of articles that fill the criteria.</br>
     * In this case, the criteria is: the article's current stock must be below the minimum stock amount.
     */
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

    
    /** 
     * @return Object[]
     * </br>
     * This method returns all articles inside the data.csv file, however, it modifies the values of</br>
     * all articles that filled the criteria of the previous method. This time, their date is updated</br>
     * and their order status is set to true.
     * </br>
     * I chose to not directly modify the data.csv file for demonstration purposes;</br>
     * For the purposes of this exercise, we want to retrieve the same result every time the API call is made.</br>
     * As such, if the data.csv file itself was updated, the API call would only fulfill its purpose once.
     */
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
