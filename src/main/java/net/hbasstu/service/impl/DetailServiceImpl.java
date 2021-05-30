package net.hbasstu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.hbasstu.controller.TotalData;
import net.hbasstu.entity.India_detail;
import net.hbasstu.mapper.DetailMapper;
import net.hbasstu.service.DetailService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service

public class DetailServiceImpl extends ServiceImpl<DetailMapper, India_detail> implements DetailService {
    @Override
    public List<India_detail> getList() {
        List<India_detail> datas = baseMapper.selectList(null);
        return datas;
    }

    @Override
    public List<TotalData> getDetailByDate(Date date) {
        QueryWrapper<India_detail> wrapper = new QueryWrapper<>();
        wrapper.eq("date",new SimpleDateFormat("yyyy-MM-dd").format(date));
        List<India_detail> details = baseMapper.selectList(wrapper);
        List<TotalData> retData=new ArrayList<>();
        for (India_detail detail: details) {
            TotalData data=new TotalData(detail.getState(),detail.getConfirmed());
            retData.add(data);
        }

        return retData;
    }



    @Override
    public Integer getAllDead(Date date) {
        QueryWrapper<India_detail> wrapper = new QueryWrapper<>();
        wrapper.eq("date",new SimpleDateFormat("yyyy-MM-dd")
                .format(date))
                .select("deaths");
        List<India_detail> allDead = baseMapper.selectList(wrapper);
        int  allD = 0;
        for (India_detail i:allDead
             ) {
            allD +=i.getDeaths();
        }
        return allD;
    }

    @Override
    public Integer getAllCured(Date date) {
        QueryWrapper<India_detail> wrapper = new QueryWrapper<>();
        wrapper.eq("date",new SimpleDateFormat("yyyy-MM-dd").format(date)).select("cured");
        List<India_detail> allCured = baseMapper.selectList(wrapper);
        int cured=0;
        for (India_detail i:allCured) {
            cured+=i.getCured();
        }
//        System.out.println(cured);
        return cured;
    }

    @Override
    public List<India_detail> getByState(String state) {
        QueryWrapper<India_detail> wrapper = new QueryWrapper<>();
        wrapper.eq("state",state).orderByDesc("date");
        List<India_detail> dataByState = baseMapper.selectList(wrapper);
        if (dataByState.size()==0)
        {
            dataByState=null;
        }
        return dataByState;
    }

    @Override
    public Integer getAllConfirm(Date date) {
        QueryWrapper<India_detail> wrapper = new QueryWrapper<>();
        wrapper.eq("date",new SimpleDateFormat("yyyy-MM-dd").format(date)).select("confirmed");
        List<India_detail> allConfirm = baseMapper.selectList(wrapper);
        int allConfirmed=0;
        for (India_detail i:allConfirm) {
            allConfirmed+=i.getConfirmed();
        }
        System.out.println(allConfirmed);

        return allConfirmed;
    }
}
