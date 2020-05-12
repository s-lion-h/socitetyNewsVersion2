package com.slionh.societynews.service;

import com.slionh.societynews.entity.Newscount;
import com.slionh.societynews.entity.Requestlog;

import java.util.List;

public interface CountService {
    int insertNewsCount(Newscount newscount);

    int insertNewsCountList(List<Newscount> newscounts);

    int insertRequestlog(Requestlog requestlog);

    int insertRequestlogList(List<Requestlog> requestlogs);
}
