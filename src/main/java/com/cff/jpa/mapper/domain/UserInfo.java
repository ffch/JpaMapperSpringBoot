package com.cff.jpa.mapper.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the user_info database table.
 * 
 */
@Table(name="user_info")
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_name")
	private String userName;

	@Column()
	private String mobile;

	@Column()
	private String name;

	@Column()
	private String passwd;

	@Column()
	private String valid;

	public UserInfo() {
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobile() {
		return this.mobile;
	}
	
	public String[] getTables() {
		if(this.mobile.startsWith("1")){
			return new String[]{"user_info", "user_info_copy1", "user_info_copy2"};
		}else if(this.mobile.startsWith("2")){
			return new String[]{"user_info_copy1", "user_info_copy2"};
		}
		return new String[]{"user_info", "user_info_copy1", "user_info_copy2"};
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getValid() {
		return this.valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	@Override
	public String toString() {
		return "UserInfo [userName=" + userName + ", mobile=" + mobile + ", name=" + name + ", passwd=" + passwd
				+ ", valid=" + valid + "]";
	}
}