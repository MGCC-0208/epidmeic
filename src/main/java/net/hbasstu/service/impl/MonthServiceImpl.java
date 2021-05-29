package net.hbasstu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.hbasstu.entity.India_day;
import net.hbasstu.entity.India_month;
import net.hbasstu.mapper.DayMapper;
import net.hbasstu.mapper.MonthMapper;
import net.hbasstu.service.DayService;
import net.hbasstu.service.MonthService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonthServiceImpl extends ServiceImpl<MonthMapper, India_month> implements MonthService {

    @Override
    public List<India_month> getList() {
        List<India_month> datas = baseMapper.selectList(null);

        return datas;
    }
}
