package com.slionh.societynews.mapper.DbTencent;

import com.slionh.societynews.entity.News;
import com.slionh.societynews.entity.NewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
    int countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int deleteByPrimaryKey(Integer idnews);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByLikeTitleKey(@Param("key") String key);

    List<News> selectByExample(NewsExample example);

    List<News> listLatestClassificationNews(@Param("classification") String classification, @Param("count") Integer count);

    List<News> listLatestNews(Integer count);

    News selectByPrimaryKey(Integer idnews);

    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
}