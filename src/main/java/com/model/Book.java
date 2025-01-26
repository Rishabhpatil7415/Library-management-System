package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int bookid;
    @Column
	private String bookname;
    @Column
	private Integer year;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bookid, String bookname, Integer year) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.year = year;
	}

	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", year=" + year + "]";
	}
	
	
	
	
}
