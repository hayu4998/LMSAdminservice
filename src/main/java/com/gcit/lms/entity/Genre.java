/**
 * 
 */
package com.gcit.lms.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "tbl_genre", catalog = "library")
public class Genre {
	
	@Id
	private Integer genre_id;
	
	private String genre_name;
	
	@ManyToMany(mappedBy = "genres")
	@JsonIgnoreProperties("genres")
	private List<Book> books;
	
	
	

	/**
	 * @return the genre_id
	 */
	public Integer getGenre_id() {
		return genre_id;
	}
	/**
	 * @param genre_id the genre_id to set
	 */
	public void setGenre_id(Integer genre_id) {
		this.genre_id = genre_id;
	}
	/**
	 * @return the genre_name
	 */
	public String getGenre_name() {
		return genre_name;
	}
	/**
	 * @param genre_name the genre_name to set
	 */
	public void setGenre_name(String genre_name) {
		this.genre_name = genre_name;
	}
	/**
	 * @return the books
	 */
	public List<Book> getBooks() {
		return books;
	}
	/**
	 * @param books the books to set
	 */
	public void setBooks(List<Book> books) {
		this.books = books;
	}


}
