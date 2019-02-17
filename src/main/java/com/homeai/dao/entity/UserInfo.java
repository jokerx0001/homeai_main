package com.homeai.dao.entity;

import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_info database table.
 *
 */
@Entity
@Table(name="user_info")
@NamedQuery(name="UserInfo.findAll", query="SELECT u FROM UserInfo u")
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACCOUT_HA")
	private String accoutHa;

	@Column(name="AGE_HA")
	private int ageHa;

	@Column(name="NAME_HA")
	private String nameHa;

	@Column(name="PASSWORD_HA")
	private String passwordHa;

	@Column(name="SEX")
	private String sex;

	@Column(name="SYS_LV")
	private int sysLv;

	public UserInfo() {
	}

	public String getAccoutHa() {
		return this.accoutHa;
	}

	public void setAccoutHa(String accoutHa) {
		this.accoutHa = accoutHa;
	}

	public int getAgeHa() {
		return this.ageHa;
	}

	public void setAgeHa(int ageHa) {
		this.ageHa = ageHa;
	}

	public String getNameHa() {
		return this.nameHa;
	}

	public void setNameHa(String nameHa) {
		this.nameHa = nameHa;
	}

	public String getPasswordHa() {
		return this.passwordHa;
	}

	public void setPasswordHa(String passwordHa) {
		this.passwordHa = passwordHa;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getSysLv() {
		return this.sysLv;
	}

	public void setSysLv(int sysLv) {
		this.sysLv = sysLv;
	}

}