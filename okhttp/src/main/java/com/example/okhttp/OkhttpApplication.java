package com.example.okhttp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OkhttpApplication {

    //跳转到上传文件的页面
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String goUploadImg() {
//        return "hello_okhttp";
        String str  = OkHttpUtil.get("http://localhost:5002/hello", null);

        if(StringUtils.isEmpty(str)){
            return "ok http resutn empty";
        }else {
            return str;
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(OkhttpApplication.class, args);
    }

}

