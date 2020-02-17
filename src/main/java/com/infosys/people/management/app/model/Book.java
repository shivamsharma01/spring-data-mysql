package com.infosys.people.management.app.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Table(name = "book_table")
@Entity
public class Book {
	@Id
	private int id;
	private String bookName;
	private String authorName;
	
}
