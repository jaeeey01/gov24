package com.exam.gov24.Controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
public class Controller {

    @GetMapping("/")
    public void index(){

    }
}
