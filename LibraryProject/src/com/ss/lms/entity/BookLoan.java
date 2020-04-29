/**
 * 
 */
package com.ss.lms.entity;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author seandarsie
 *
 */
public class BookLoan {
	Integer branchId;
	Integer bookId;
	Integer cardNo;
	LocalDateTime dateOut;
	LocalDateTime dateDue;
	LocalDateTime dateIn;
	
	/**
	 * 
	 * @param branchId
	 * @param bookId
	 * @param cardNo
	 * @param dateOut
	 * @param dateDue
	 * @param dateIn
	 */
	public BookLoan(Integer branchId, Integer bookId, Integer cardNo, LocalDateTime dateOut, LocalDateTime dateDue, LocalDateTime dateIn) {
		super();
		this.branchId = branchId;
		this.bookId = bookId;
		this.cardNo = cardNo;
		this.dateOut = dateOut;//Date.ofInstant((dateOut.toInstant()),ZoneId.systemDefault());
		this.dateDue = dateDue;//Date.ofInstant((dateDue.toInstant()),ZoneId.systemDefault());
		this.dateIn = dateIn;//Date.ofInstant((dateIn.toInstant()),ZoneId.systemDefault());
	}
	@Override
	public int hashCode() {
		final Integer prime = 31;
		Integer result = 1;
		result = prime * result + bookId;
		result = prime * result + branchId;
		result = prime * result + cardNo;
		result = prime * result + ((dateDue == null) ? 0 : dateDue.hashCode());
		result = prime * result + ((dateIn == null) ? 0 : dateIn.hashCode());
		result = prime * result + ((dateOut == null) ? 0 : dateOut.hashCode());
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
		BookLoan other = (BookLoan) obj;
		if (bookId != other.bookId)
			return false;
		if (branchId != other.branchId)
			return false;
		if (cardNo != other.cardNo)
			return false;
		if (dateDue == null) {
			if (other.dateDue != null)
				return false;
		} else if (!dateDue.equals(other.dateDue))
			return false;
		if (dateIn == null) {
			if (other.dateIn != null)
				return false;
		} else if (!dateIn.equals(other.dateIn))
			return false;
		if (dateOut == null) {
			if (other.dateOut != null)
				return false;
		} else if (!dateOut.equals(other.dateOut))
			return false;
		return true;
	}
	public Integer getBranchId() {
		return branchId;
	}
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Integer getCardNo() {
		return cardNo;
	}
	public void setCardNo(Integer cardNo) {
		this.cardNo = cardNo;
	}
	public LocalDateTime getDateOut() {
		return dateOut;
	}
	public void setDateOut(LocalDateTime dateOut) {
		this.dateOut = dateOut;
	}
	public LocalDateTime getDateDue() {
		return dateDue;
	}
	public void setDateDue(LocalDateTime dateDue) {
		this.dateDue = dateDue;
	}
	public LocalDateTime getDateIn() {
		return dateIn;
	}
	public void setDateIn(LocalDateTime dateIn) {
		this.dateIn = dateIn;
	}
}
