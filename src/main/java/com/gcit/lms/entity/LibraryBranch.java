
package com.gcit.lms.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "tbl_library_branch", catalog = "library")
public class LibraryBranch {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer branchId;
	
	private String branchName;
	private String branchAddress;
	
	@OneToMany(mappedBy = "branch")
	@JsonIgnoreProperties("branch")
	private Set<BookLoans> bookLoans;
	
	@OneToMany(mappedBy = "branch")
	@JsonIgnoreProperties("branch")
	private Set<BookCopies> bookCopies;

	
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
	 * @return the branchId
	 */
	public Integer getBranchId() {
		return branchId;
	}

	/**
	 * @param branchId the branchId to set
	 */
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}

	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	/**
	 * @return the branchAddress
	 */
	public String getBranchAddress() {
		return branchAddress;
	}

	/**
	 * @param branchAddress the branchAddress to set
	 */
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
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

//	private List<BookCopies> bookCopies;
	
	
	
}
