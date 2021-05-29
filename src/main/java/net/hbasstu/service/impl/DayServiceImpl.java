package net.hbasstu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.hbasstu.entity.India_day;
import net.hbasstu.mapper.DayMapper;
import net.hbasstu.service.DayService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DayServiceImpl extends ServiceImpl<DayMapper, India_day> implements DayService {

    @Override
    public List<India_day> getList() {
        List<India_day> products = baseMapper.selectList(null);

        return products;
    }

    @Override
    public List<India_day> getLt() {
        QueryWrapper<India_day> wrapper=new QueryWrapper<>();
        wrapper.gt("sno",466);
        List<India_day> products = baseMapper.selectList(wrapper);
        return products;
    }
}
