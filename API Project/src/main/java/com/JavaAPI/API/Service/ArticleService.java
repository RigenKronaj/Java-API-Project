package com.JavaAPI.API.Service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

//import org.json.simple.JSONObject;

public interface ArticleService {
    //public abstract void updateArticle();
    //public abstract JSONObject readData();
    public abstract Collection<String[]> getData() throws FileNotFoundException, IOException;
}
