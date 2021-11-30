package com.exam.gov24.Controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/board")
@Log4j2
public class BoardController {


    @GetMapping(value={"/list","/list/{boNo}"})
    public void list(@PathVariable int boNo){
        log.info(boNo);

    }
}
