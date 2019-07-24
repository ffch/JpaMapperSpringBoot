package com.cff.jpa.mapper.dao;


import java.util.Collection;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cff.jpa.mapper.domain.UserInfo;

import cn.pomit.jpamapper.core.mapper.CrudMapper;

@Mapper
public interface UserInfoDao extends CrudMapper<UserInfo, String> {

	List<UserInfo> findByMobile(String mobile);
	
	int saveAllWithId(@Param("list") Collection<UserInfo> entities);
	
	@Insert({"<script> ",
	"INSERT INTO user_info",
	"( ",
	"<if test='_parameter.userName != null'> userName , </if>  ",
	"<if test='_parameter.mobile != null'> mobile , </if>  ",
	"<if test='_parameter.name != null'> name , </if>  ",
	"<if test='_parameter.passwd != null'> passwd , </if> ",
	 "<if test='_parameter.valid != null'> valid </if> ",
	 ") ",
	" values ",
	 "( ",
	 "<if test='_parameter.userName != null'>  #{_parameter.userName}, </if>  ",
	 "<if test='_parameter.mobile != null'>  #{_parameter.mobile}, </if>  ",
	 "<if test='_parameter.name != null'>  #{_parameter.name}, </if>  ",
	 "<if test='_parameter.passwd != null'>  #{_parameter.passwd}, </if>  ",
	" <if test='_parameter.valid != null'>  #{_parameter.valid} </if> ",
	" ) ",
	 "</script>"})
	int saveTest(UserInfo entity);

	int deleteByUserName(String userName);
	
	List<UserInfo> findByNameAndMobile(String name, String mobile);
	
	int deleteByNameAndMobile(String name, String mobile);
}