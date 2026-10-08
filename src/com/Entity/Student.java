package com.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;

	@Column(unique = true, nullable = false)
	private String uname;

	private String upassword;

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	private String uaddress;

	@CreationTimestamp
	private LocalDateTime registeredDate;

	private int uage;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public LocalDateTime getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(LocalDateTime registeredDate) {
		this.registeredDate = registeredDate;
	}

	public int getAge() {
		return uage;
	}

	public void setAge(int age) {
		this.uage = age;
	}

	@Override
	public String toString() {
		return "Student [uid=" + uid + ", uname=" + uname + ", upassword=" + upassword + ", uaddress=" + uaddress
				+ ", registeredDate=" + registeredDate + ", age=" + uage + "]";
	}

}
