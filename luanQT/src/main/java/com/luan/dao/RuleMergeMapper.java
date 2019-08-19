package com.luan.dao;

import com.luan.model.RuleMerge;

public interface RuleMergeMapper {
    int deleteByPrimaryKey(String id);

    int insert(RuleMerge record);

    int insertSelective(RuleMerge record);

    RuleMerge selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RuleMerge record);

    int updateByPrimaryKey(RuleMerge record);
}