/**
 * 
 */
package com.gcit.lms.entity;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbl_book_copies", catalog = "library")
public class BookCopies{
	
	@EmbeddedId
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private BCPrimaryKey bcpk;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JoinColumn(name = "bookId", referencedColumnName = "bookId", insertable=false, updatable=false)
	@JsonIgnoreProperties(value = {"bookLoans", "bookCopies"})
	private Book book;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JoinColumn(name = "branchId", referencedColumnName = "branchId", insertable=false, updatable=false)
	@JsonIgnoreProperties(value = {"bookLoans", "bookCopies"})
	private LibraryBranch branch;
	
	private Integer noOfCopies;

	/**
	 * @return the bcpk
	 */
	public BCPrimaryKey getBcpk() {
		return bcpk;
	}

	/**
	 * @param bcpk the bcpk to set
	 */
	public void setBcpk(BCPrimaryKey bcpk) {
		this.bcpk = bcpk;
	}

	/**
	 * @return the book
	 */
	public Book getBook() {
		return book;
	}

	/**
	 * @param book the book to set
	 */
	public void setBook(Book book) {
		this.book = book;
	}

	/**
	 * @return the branch
	 */
	public LibraryBranch getBranch() {
		return branch;
	}

	/**
	 * @param branch the branch to set
	 */
	public void setBranch(LibraryBranch branch) {
		this.branch = branch;
	}

	/**
	 * @return the noOfCopies
	 */
	public Integer getNoOfCopies() {
		return noOfCopies;
	}

	/**
	 * @param noOfCopies the noOfCopies to set
	 */
	public void setNoOfCopies(Integer noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	

}
