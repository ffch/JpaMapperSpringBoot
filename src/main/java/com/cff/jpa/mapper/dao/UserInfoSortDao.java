package com.cff.jpa.mapper.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cff.jpa.mapper.domain.UserInfo;

import cn.pomit.jpamapper.core.domain.page.Page;
import cn.pomit.jpamapper.core.domain.page.Pageable;
import cn.pomit.jpamapper.core.domain.page.Sort;
import cn.pomit.jpamapper.core.mapper.PagingAndSortingMapper;


@Mapper
public interface UserInfoSortDao extends PagingAndSortingMapper<UserInfo, String> {
	Page<UserInfo> pageByPasswd(String passwd, Pageable pageable);
	
	List<UserInfo> sortByPasswd(String passwd, Sort sort);
}