package com.study.springbootgradle.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private Integer age;
	private LocalDateTime dateHournow;
	
	public Person(String id, String name, Integer age, LocalDateTime dateHournow) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.dateHournow= dateHournow;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public LocalDateTime getDateHournow() {
		return dateHournow;
	}
	
	public void setDateHournow(LocalDateTime dateHournow) {
		this.dateHournow = dateHournow;
	}
}
