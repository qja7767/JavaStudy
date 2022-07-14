package com.arang.signup;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String userId;
	private String passwd;
	private String Name;
	private String koreanName;
	private String englishName;
	private String gender;
	private String acaBackGround;
	private String career;
	private String soloExhi;
	private String groupExhi;
	private String ssn;
	private String email;	
	private String addr;
	private List<User> userList;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getKoreanName() {
		return koreanName;
	}

	public void setKoreanName(String koreanName) {
		this.koreanName = koreanName;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAcaBackGround() {
		return acaBackGround;
	}

	public void setAcaBackGround(String acaBackGround) {
		this.acaBackGround = acaBackGround;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getSoloExhi() {
		return soloExhi;
	}

	public void setSoloExhi(String soloExhi) {
		this.soloExhi = soloExhi;
	}

	public String getGroupExhi() {
		return groupExhi;
	}

	public void setGroupExhi(String groupExhi) {
		this.groupExhi = groupExhi;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public User() {
		
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
