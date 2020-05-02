package com.library.speedreader.controllers;

import com.library.speedreader.models.InputString;
import com.library.speedreader.repositories.InputStringRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.thymeleaf.util.StringUtils.split;

@Controller
public class SpeedReadController {

    private InputStringRepo inputStringDao;

    public SpeedReadController(InputStringRepo inputStringDao){
        this.inputStringDao = inputStringDao;
    }

    @GetMapping("/speedreader")
    public String viewSpeedReaderPage(Model view){
        InputString introString = inputStringDao.findInputStringById(1);
        //string to list
//        List<String> intro = new ArrayList<String>(Arrays.asList(split(introString, " ")));

        view.addAttribute("introString", introString);
        return "speedreader/speedreader";
    }

//    @PostMapping("/speedreader")
//    public String doSpeedReading(){
//        return "redirect:/home";
//    }
}
