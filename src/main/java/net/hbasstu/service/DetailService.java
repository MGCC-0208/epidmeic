package net.hbasstu.service;

import net.hbasstu.controller.TotalData;
import net.hbasstu.entity.India_detail;

import java.util.Date;
import java.util.List;


public interface DetailService {
    public List<India_detail> getList();
    public List<TotalData> getDetailByDate(Date date);
    public Integer getAllConfirm(Date date);
    public Integer getAllDead(Date date);
    public Integer getAllCured(Date date);
}
