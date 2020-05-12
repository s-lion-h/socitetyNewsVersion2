package com.slionh.societynews.service.impl;

import com.slionh.societynews.entity.Carousel;
import com.slionh.societynews.entity.News;
import com.slionh.societynews.mapper.DbTencent.NewsMapper;
import com.slionh.societynews.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * Create by s lion h on 2020-01-01
 */

@Service
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsMapper newsMapper;
//    @Resource
//    private CarouselMapper carouselMapper;

    @Override
    public News getNewsDetail(Integer id) {
        News news = newsMapper.selectByPrimaryKey(id);
//        news.setContent(news.getContent().replace(" 　　","&lt;br/&gt;"));
        return news;
    }

    @Override
    public List<News> listLatestNews(Integer count) {
        return newsMapper.listLatestNews(count);
    }

    @Override
    public List<News> listLatestClassificationNews(String classification, Integer count) {
        return newsMapper.listLatestClassificationNews(classification,count);
    }
    @Override
    public List<News> selectByLikeTitleKey(String key) {
        return newsMapper.selectByLikeTitleKey("%"+key+"%");
    }

//    @Override
//    public Carousel getCarousel(Integer id) {
//        return carouselMapper.selectByPrimaryKey(id);
//    }
}
