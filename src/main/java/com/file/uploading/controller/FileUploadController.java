package com.file.uploading.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileUploadController {

    @PostMapping("/upload-file")
    public ResponseEntity<String> UploadFile(){
        return ResponseEntity.ok("working");

    }

}
