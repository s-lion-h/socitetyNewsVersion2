package com.slionh.societynews.service.impl;

import com.slionh.societynews.entity.Newscount;
import com.slionh.societynews.entity.Requestlog;
import com.slionh.societynews.mapper.dbAli.NewscountMapper;
import com.slionh.societynews.mapper.dbAli.RequestlogMapper;
import com.slionh.societynews.service.CountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CountServiceImpl implements CountService {
    @Resource
    private NewscountMapper newscountMapper;
    @Resource
    private RequestlogMapper requestlogMapper;

    public CountServiceImpl() {
    }

    public int insertNewsCount(Newscount newscount) {
        return this.newscountMapper.insert(newscount);
    }

    public int insertNewsCountList(List<Newscount> newscounts) {
        return this.newscountMapper.insertList(newscounts);
    }

    public int insertRequestlog(Requestlog requestlog) {
        return this.requestlogMapper.insert(requestlog);
    }

    public int insertRequestlogList(List<Requestlog> requestlogs) {
        return this.requestlogMapper.insertList(requestlogs);
    }
}