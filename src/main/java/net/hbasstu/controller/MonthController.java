package net.hbasstu.controller;

import net.hbasstu.entity.India_day;
import net.hbasstu.entity.India_month;
import net.hbasstu.service.DayService;
import net.hbasstu.service.MonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/month")
public class MonthController {

    @Autowired
    MonthService service;

    @GetMapping("/list")
    @ResponseBody
    public List<India_month> getList() {

        return service.getList();
    }
}
