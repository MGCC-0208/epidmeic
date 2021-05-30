package net.hbasstu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.hbasstu.entity.India_year;
import net.hbasstu.mapper.YearMapper;
import net.hbasstu.service.YearService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YearServiceImpl extends ServiceImpl<YearMapper, India_year> implements YearService {

    @Override
    public List<India_year> getList() {
        List<India_year> datas = baseMapper.selectList(null);

        return datas;
    }
}
