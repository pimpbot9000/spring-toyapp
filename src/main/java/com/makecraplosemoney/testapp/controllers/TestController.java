package com.makecraplosemoney.testapp.controllers;

import com.makecraplosemoney.testapp.Beans.MyBeanBean;
import com.makecraplosemoney.testapp.DTOs.TestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    private MyBeanBean bean;

    public TestController(MyBeanBean myBean){
        this.bean = myBean;
    }

    @GetMapping("/path/{id}")
    public ResponseEntity<?> getResponse(@RequestBody TestBody body, @PathVariable String id){
        return new ResponseEntity<>(body.getHelloThere(), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<?> getResponse(){
        return new ResponseEntity<>("I'm healthy", HttpStatus.OK);
    }
}
