package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Position=" + Position + "]";
	}
	@Id
	@GeneratedValue
	@Column(name="Std_Id")
	private int Id;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="Position")
	private String Position;
	
	public Student() {
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	

}
