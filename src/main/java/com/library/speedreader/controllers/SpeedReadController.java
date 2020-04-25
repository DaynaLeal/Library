package com.library.speedreader.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpeedReadController {

    @GetMapping("/speedreader")
    public String viewSpeedReaderPage(){
        return "/speedreader/speedreader";
    }

    @PostMapping("/speedreader")
    public String doSpeedReading(){
        return "redirect:/home";
    }
}
