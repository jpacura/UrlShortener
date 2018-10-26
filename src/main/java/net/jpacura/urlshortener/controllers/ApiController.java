package net.jpacura.urlshortener.controllers;

import net.jpacura.urlshortener.api.DatabaseAdapter;
import net.jpacura.urlshortener.api.TestApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    //@Autowired
    //private DatabaseAdapter database;

    @GetMapping("/api/test")
    public TestApiResponse index() {
        return new TestApiResponse("asdf");
    }


}
