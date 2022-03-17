package com.JavaAPI.API.Controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.JavaAPI.API.Service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/articles", method = RequestMethod.GET)
    public ResponseEntity<Object> getData() throws FileNotFoundException, IOException{
        return new ResponseEntity<>(articleService.getData(), HttpStatus.OK);
    }

    /*@RequestMapping(value ="/articles/update", method = RequestMethod.GET)
    public ResponseEntity<Object> updateArticle() throws FileNotFoundException, IOException{
        return new ResponseEntity<>(articleService.updateArticle(), HttpStatus.OK);
    }*/
}
