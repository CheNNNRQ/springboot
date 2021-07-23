package com.diodi.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/** 文件上传
 * @author diodi
 * @create 2021-06-04-16:23
 */
@Slf4j
@Controller
public class FormTextController {
    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }
    @PostMapping("/upload")
    public String upload(@RequestParam("username") String username,
                         @RequestParam("email") String email,
                         @RequestPart("headerImage")MultipartFile headerImage,
                         @RequestPart("photos") MultipartFile[] photos) throws IOException {
        log.info("上传的信息：email={}，username={}，headerImg={}，photos={}",
                email,username,headerImage.getSize(),photos.length);
        if(!headerImage.isEmpty()) {
            //项目中保存到文件服务器 如阿里oss
            String originalFilename = headerImage.getOriginalFilename();
            headerImage.transferTo(new File("F:\\code\\"+originalFilename));
        }
        if(photos.length>0) {
            for(MultipartFile photo : photos){
                if(!photo.isEmpty()){
                    String originalFilename = photo.getOriginalFilename();
                    photo.transferTo(new File("F:\\code\\"+originalFilename));
                }
            }
        }
        return "form/form_layouts";
    }
}
