package com.slionh.societynews.mapper.dbAli;

import com.slionh.societynews.entity.Newscount;
import com.slionh.societynews.entity.NewscountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewscountMapper {
    int countByExample(NewscountExample example);

    int deleteByExample(NewscountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Newscount record);

    int insertList(List<Newscount> record);

    int insertSelective(Newscount record);

    List<Newscount> selectByExample(NewscountExample example);

    Newscount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Newscount record, @Param("example") NewscountExample example);

    int updateByExample(@Param("record") Newscount record, @Param("example") NewscountExample example);

    int updateByPrimaryKeySelective(Newscount record);

    int updateByPrimaryKey(Newscount record);
}