package com.cff.jpa.mapper.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cff.jpa.mapper.domain.UserInfoUnion;

import cn.pomit.jpamapper.core.mapper.CrudMapper;

@Mapper
public interface UserInfoUnionDao extends CrudMapper<UserInfoUnion, String> {
	List<UserInfoUnion> findByMobile(String mobile);
}