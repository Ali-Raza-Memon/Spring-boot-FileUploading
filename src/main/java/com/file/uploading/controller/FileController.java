package com.file.uploading.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    @GetMapping("/")
    public String Hello(){
        return "HEllo Mr. Ali Raza";
    }

}
