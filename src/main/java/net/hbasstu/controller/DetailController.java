package net.hbasstu.controller;
import com.alibaba.fastjson.JSON;
import net.hbasstu.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/detail")
public class DetailController {

    @Autowired
    DetailService service;

    @GetMapping("/list")
    @ResponseBody
    public String getList() {
       String data = JSON.toJSONString(service.getList());
        return data;
    }

    @GetMapping("/lt")
    @ResponseBody
    public  List<TotalData> getListByDate() throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2021-05-16");
        System.out.println(date);
        List<TotalData> detailByDate = service.getDetailByDate(date);
        //String data = JSON.toJSONString(detailByDate);
//        Map<String, Integer> detiles = (Map<String, Integer>) JSON.parse(data);
//        System.out.println(data);
        return detailByDate;
    }
    @GetMapping("/allConfirm")
    @ResponseBody
    public Integer getAllConfirmByDate() throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2021-05-16");
        Integer allConfirm = service.getAllConfirm(date);
        return allConfirm;
    }
    @GetMapping("/allDead")
    @ResponseBody
    public Integer getAllDeadByDate() throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2021-05-16");
        Integer allDead = service.getAllDead(date);
        return allDead;
    }
    @GetMapping("/allCured")
    @ResponseBody
    public Integer getAllCuredByDate() throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2021-05-16");
        Integer allCured = service.getAllCured(date);
        return allCured;
    }
    @GetMapping("/lastConfirm")
    @ResponseBody
    public Integer getLastByDate() throws ParseException {
        int lastConfirm = 0;
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2021-05-16");
        Integer allDead = service.getAllDead(date);
        Integer allConfirm = service.getAllConfirm(date);
        Integer allCured = service.getAllCured(date);
        lastConfirm = allConfirm-allDead-allCured;
        return lastConfirm;
    }
}
