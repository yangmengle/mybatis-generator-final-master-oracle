package com.data.mapper;

import com.data.bean.conParam;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface conParamMapper {
    int deleteByPrimaryKey(Long id);

    int insert(conParam record);

    int insertSelective(conParam record);

    conParam selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(conParam record);

    int updateByPrimaryKey(conParam record);
}