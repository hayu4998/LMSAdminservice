package com.gcit.lms.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BCPrimaryKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6858043228105103046L;

	Integer bookId;
	
	Integer branchId;

	
	public BCPrimaryKey() {
		
	}
	
	public BCPrimaryKey(Integer bookId, Integer branchId, Integer cardNo) {
		this.bookId = bookId;
		this.branchId =branchId;
		
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		result = prime * result + ((branchId == null) ? 0 : branchId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BCPrimaryKey other = (BCPrimaryKey) obj;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		} else if (!bookId.equals(other.bookId))
			return false;
		if (branchId == null) {
			if (other.branchId != null)
				return false;
		} else if (!branchId.equals(other.branchId))
			return false;
		
		return true;
	}
	
	
}