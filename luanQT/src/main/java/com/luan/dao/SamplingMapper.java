package com.luan.dao;

import com.luan.model.Sampling;

public interface SamplingMapper {
    int deleteByPrimaryKey(String id);

    int insert(Sampling record);

    int insertSelective(Sampling record);

    Sampling selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Sampling record);

    int updateByPrimaryKey(Sampling record);
}