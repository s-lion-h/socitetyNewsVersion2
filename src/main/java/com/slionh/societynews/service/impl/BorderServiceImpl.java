package com.slionh.societynews.service.impl;

import com.slionh.societynews.entity.Border;
import com.slionh.societynews.mapper.dbAli.BorderMapper;
import com.slionh.societynews.service.BorderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BorderServiceImpl implements BorderService {
    @Resource
    private BorderMapper mapper;

    public BorderServiceImpl() {
    }

    public List<Border> listBorder(Integer count) {
        return this.mapper.selectCount(count);
    }

    public int addBorder(Border border) {
        return this.mapper.insert(border);
    }
}
