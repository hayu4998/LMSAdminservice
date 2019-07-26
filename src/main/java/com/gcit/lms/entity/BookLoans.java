package com.gcit.lms.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbl_book_loans",catalog = "library")
//@IdClass(BKPrimaryKey.class)
public class BookLoans{
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Basic
//	@Column(name = "bookId")
//	private Integer bookId;
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Integer cardNo;
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Integer branchId;
	
	@EmbeddedId
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private BLPrimaryKey blpk;
	
	
	@ManyToOne
	@JsonIgnoreProperties(value = {"bookLoans", "bookCopies","authors","genres"})
	@JoinColumn(name = "bookId", referencedColumnName = "bookId", insertable=false, updatable=false)
	private Book book;
	
	@ManyToOne
	@JsonIgnoreProperties(value = {"bookLoans", "branch", "bookCopies"})
	@JoinColumn(name = "branchId", referencedColumnName = "branchId", insertable=false, updatable=false)
	private LibraryBranch branch;
	
	@ManyToOne
	@JsonIgnoreProperties("bookLoans")
	@JoinColumn(name = "cardNo",referencedColumnName = "cardNo", insertable=false, updatable=false)
	private Borrower borrower;
	
	
	private String dateOut;
	private String dateIn;
	private String dueDate;
	
	/**
	 * @return the bkpk
	 */
	public BLPrimaryKey getBlpk() {
		return blpk;
	}
	/**
	 * @param bkpk the bkpk to set
	 */
	public void setBlpk(BLPrimaryKey bkpk) {
		this.blpk = bkpk;
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
	 * @return the borrower
	 */
	public Borrower getBorrower() {
		return borrower;
	}
	/**
	 * @param borrower the borrower to set
	 */
	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}
	/**
	 * @return the dateOut
	 */
	public String getDateOut() {
		return dateOut;
	}
	/**
	 * @param dateOut the dateOut to set
	 */
	public void setDateOut(String dateOut) {
		this.dateOut = dateOut;
	}
	/**
	 * @return the dateIn
	 */
	public String getDateIn() {
		return dateIn;
	}
	/**
	 * @param dateIn the dateIn to set
	 */
	public void setDateIn(String dateIn) {
		this.dateIn = dateIn;
	}
	/**
	 * @return the dueDate
	 */
	public String getDueDate() {
		return dueDate;
	}
	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
}