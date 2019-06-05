package com.xworkz.maven;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="lodging")

public class LoadgDTO implements Serializable {

	@Id
	@GenericGenerator(name="id",strategy="increment")
	@GeneratedValue(generator="id")
	@Column(name="ROOM_ID")
	private int roomNo;
	@Column(name="LODGE_NAME")
	private String lname;
	@Column(name="LOCATION")
	private String location;
	@Column(name="PX")
	private int px;
	@Column(name="NO_OF_DAYS")
	private int noOfPersons;

	public LoadgDTO() {
		System.out.println("Created /t:" + this.getClass().getName());
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPx() {
		return px;
	}

	public void setPx(int px) {
		this.px = px;
	}

	public int getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	@Override
	public String toString() {
		return "LoadgDTO [roomNo=" + roomNo + ", lname=" + lname + ", location=" + location + ", px=" + px
				+ ", noOfPersons=" + noOfPersons + "]";
	}

}
