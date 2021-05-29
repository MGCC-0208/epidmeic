package net.hbasstu.controller;

import net.hbasstu.entity.India_month;
import net.hbasstu.entity.India_year;
import net.hbasstu.service.MonthService;
import net.hbasstu.service.YearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/year")
public class YearController {

    @Autowired
    YearService service;

    @GetMapping("/list")
    @ResponseBody
    public List<India_year> getList() {

        return service.getList();
    }


}
