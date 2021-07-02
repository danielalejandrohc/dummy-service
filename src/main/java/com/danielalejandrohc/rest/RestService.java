package com.danielalejandrohc.rest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestService {


    @GetMapping(path = "/data")
    public List<String> findAll() {
        List<String> data = new ArrayList<>();
        data.add("Daniel");
        data.add("Alejandro");
        data.add("Hernandez");
        return data;
    }



}
