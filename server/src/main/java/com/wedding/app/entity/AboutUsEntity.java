package com.wedding.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "about_us_master")
public class AboutUsEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8982671996695584342L;
	
	@Id
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="about_us_text", columnDefinition="text")
	private String text;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	

}
