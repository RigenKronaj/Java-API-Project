package com.JavaAPI.API.Service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

public interface ArticleService {
    public abstract Object[] updateArticle();
    public abstract Collection<String[]> getData() throws FileNotFoundException, IOException;
}
