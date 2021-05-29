package net.hbasstu.controller;

import net.hbasstu.entity.India_day;
import net.hbasstu.service.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/day")
public class DayController {

    @Autowired
    DayService service;

    @GetMapping("/list")
    @ResponseBody
    public List<India_day> getList() {

        return service.getList();
    }

    @GetMapping("/lt")
    @ResponseBody
    public List<Integer> getLt() {
        List<India_day> lt = service.getLt();

        System.out.println(lt);
        List<Integer> list=new ArrayList<>();
        for (India_day day:lt){
            list.add(day.getDeaths_count());
        }
        System.out.println(list);
        return list;
    }
}
