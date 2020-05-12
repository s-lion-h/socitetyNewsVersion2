package com.slionh.societynews.mapper.dbAli;

import com.slionh.societynews.entity.Border;
import com.slionh.societynews.entity.BorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorderMapper {
    int countByExample(BorderExample example);

    int deleteByExample(BorderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Border record);

    int insertSelective(Border record);

    List<Border> selectByExample(BorderExample example);

    List<Border> selectCount(Integer count);

    Border selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Border record, @Param("example") BorderExample example);

    int updateByExample(@Param("record") Border record, @Param("example") BorderExample example);

    int updateByPrimaryKeySelective(Border record);

    int updateByPrimaryKey(Border record);
}