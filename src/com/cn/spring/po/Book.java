package com.cn.spring.po;

/**
 *@Book.java
 *@
 *@spring
 *@author lym
 *@2017年11月25日
 *@下午12:58:24
 *@TODO
 */

public class Book {
	private String id;
	private String name;
	private String author;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
}
