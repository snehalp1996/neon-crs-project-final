package com.neon.bean;

public class FeePayment {
	private int paymentid;
	private int studentId;
	private String courseName;
	private int coursePrice;
	private String paymentMode;
	private int totalAmount;

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseId(String courseName) {
		this.courseName = courseName;
	}

	public int getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	/**
	 * @return the paymentid
	 */
	public int getPaymentid() {
		return paymentid;
	}

	/**
	 * @param paymentid the paymentid to set
	 */
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}

	public FeePayment() {
		super();
	}

	@Override
	public String toString() {
		return "FeePayment [paymentid=" + paymentid + ", studentId=" + studentId + ", courseName=" + courseName
				+ ", coursePrice=" + coursePrice + ", paymentMode=" + paymentMode + ", totalAmount=" + totalAmount
				+ "]";
	}

	/**
	 * @param paymentid
	 * @param studentId
	 * @param courseName
	 * @param coursePrice
	 * @param paymentMode
	 * @param totalAmount
	 */
	public FeePayment(int paymentid, int studentId, String courseName, int coursePrice, String paymentMode,
			int totalAmount) {
		super();
		this.paymentid = paymentid;
		this.studentId = studentId;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.paymentMode = paymentMode;
		this.totalAmount = totalAmount;
	}

}
