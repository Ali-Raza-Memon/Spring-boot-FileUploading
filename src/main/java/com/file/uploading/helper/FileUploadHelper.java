//package com.file.uploading.helper;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.File;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//
//@Component
//public class FileUploadHelper {
//
//    public String UPLOAD_DIR="D:\\Backend Development\\file-uploading\\uploading\\src\\main\\resources\\static\\images";
//
//    private boolean f = false;
//    public boolean uploadFile(MultipartFile multipartFile){
//
//
//
//        try{
//
//            Files.copy(multipartFile.getInputStream(), Paths.get(UPLOAD_DIR+ File.separator+multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
//            f = true;
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        return f;
//    }
//
//
//
//
//
//
//
//
//
//
//
//}
