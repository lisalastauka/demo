package com.example.controllers;

import com.example.entities.HotelBooking;
import com.example.repositories.BookingRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {

        return "index";
    }
}
