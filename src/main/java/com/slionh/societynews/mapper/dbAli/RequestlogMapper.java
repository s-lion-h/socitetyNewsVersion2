package com.slionh.societynews.mapper.dbAli;

import com.slionh.societynews.entity.Requestlog;
import com.slionh.societynews.entity.RequestlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RequestlogMapper {
    int countByExample(RequestlogExample example);

    int deleteByExample(RequestlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Requestlog record);

    int insertList(List<Requestlog> records);

    int insertSelective(Requestlog record);

    List<Requestlog> selectByExample(RequestlogExample example);

    Requestlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Requestlog record, @Param("example") RequestlogExample example);

    int updateByExample(@Param("record") Requestlog record, @Param("example") RequestlogExample example);

    int updateByPrimaryKeySelective(Requestlog record);

    int updateByPrimaryKey(Requestlog record);
}