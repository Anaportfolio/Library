package com.library.project.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estate")
public class Estate implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String edition;
	private Integer num_edition;
	private String author;
	private String bookcase;
	private String type;
	private Integer qtd_exemplary;
	
	public Estate() {
		
	}
	
	public Estate(Long id, String title, String edition, Integer num_edition, String author, String bookcase,
			String type, Integer qtd_exemplary) {
		super();
		this.id = id;
		this.title = title;
		this.edition = edition;
		this.num_edition = num_edition;
		this.author = author;
		this.bookcase = bookcase;
		this.type = type;
		this.qtd_exemplary = qtd_exemplary;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getEdition() {
		return edition;
	}


	public void setEdition(String edition) {
		this.edition = edition;
	}


	public Integer getNum_edition() {
		return num_edition;
	}


	public void setNum_edition(Integer num_edition) {
		this.num_edition = num_edition;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getBookcase() {
		return bookcase;
	}


	public void setBookcase(String bookcase) {
		this.bookcase = bookcase;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Integer getQtd_exemplary() {
		return qtd_exemplary;
	}


	public void setQtd_exemplary(Integer qtd_exemplary) {
		this.qtd_exemplary = qtd_exemplary;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estate other = (Estate) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
