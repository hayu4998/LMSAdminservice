/**
 * 
 */
package com.gcit.lms.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbl_book")

public class Book{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bookId;
	private String title;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinTable(name = "tbl_book_authors", joinColumns = { @JoinColumn(name = "bookId") }, inverseJoinColumns = { @JoinColumn(name = "authorId") })
	@JsonIgnoreProperties("books")
	private Set<Author> authors = new HashSet<>();
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinTable(name = "tbl_book_genres", joinColumns = { @JoinColumn(name = "bookId") }, inverseJoinColumns = { @JoinColumn(name = "genre_id") })
	@JsonIgnoreProperties("books")
	private Set<Genre> genres = new HashSet<>();
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JoinColumn(name = "pubId", referencedColumnName = "publisherId")
	@JsonIgnoreProperties("books")
	private Publisher publisher;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL }, mappedBy = "book")
	@JsonIgnoreProperties(value = {"book", "branch"})
	private Set<BookCopies> bookCopies = new HashSet<>();
	
	
	@OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL }, mappedBy = "book")
	@JsonIgnoreProperties(value = {"book", "branch"})
	private Set<BookLoans> bookLoans = new HashSet<>(); 

		
	/**
	 * @return the bookCopies
	 */
	public Set<BookCopies> getBookCopies() {
		return bookCopies;
	}
	/**
	 * @param bookCopies the bookCopies to set
	 */
	public void setBookCopies(Set<BookCopies> bookCopies) {
		this.bookCopies = bookCopies;
	}
	/**
	 * @return the bookId
	 */
	public Integer getBookId() {
		return bookId;
	}
	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the authors
	 */
	public Set<Author> getAuthors() {
		return authors;
	}
	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	/**
	 * @return the publisher
	 */
	public Publisher getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the genres
	 */
	public Set<Genre> getGenres() {
		return genres;
	}
	/**
	 * @param genres the genres to set
	 */
	public void setGenres(Set<Genre> genres) {
		this.genres = genres;
	}
	/**
	 * @return the bookLoans
	 */
	public Set<BookLoans> getBookLoans() {
		return bookLoans;
	}
	/**
	 * @param bookLoans the bookLoans to set
	 */
	public void setBookLoans(Set<BookLoans> bookLoans) {
		this.bookLoans = bookLoans;
	}

	
}
