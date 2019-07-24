package com.cff.jpa.mapper.dao;

import org.apache.ibatis.annotations.Mapper;

import com.cff.jpa.mapper.domain.UserInfoHis;

import cn.pomit.jpamapper.core.mapper.SimpleShardingMapper;

@Mapper
public interface UserInfoHisDao extends SimpleShardingMapper<UserInfoHis, String> {
	
}