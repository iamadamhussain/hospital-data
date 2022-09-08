package dao;

import java.io.Serializable;


public class HospitalDto implements Serializable {

	private int id;
	private String  paitentName;
	private String  paitentAddress;
	private String  age;
	private String  gender;
	private String  doctorName;
	private String  phoneNumber;
	private String  hosiptalName;
	private String  hosiptalAddress;
	private String  roomno;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the paitentName
	 */
	public String getPaitentName() {
		return paitentName;
	}
	/**
	 * @param paitentName the paitentName to set
	 */
	public void setPaitentName(String paitentName) {
		this.paitentName = paitentName;
	}
	/**
	 * @return the paitentAddress
	 */
	public String getPaitentAddress() {
		return paitentAddress;
	}
	/**
	 * @param paitentAddress the paitentAddress to set
	 */
	public void setPaitentAddress(String paitentAddress) {
		this.paitentAddress = paitentAddress;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}
	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the hosiptalName
	 */
	public String getHosiptalName() {
		return hosiptalName;
	}
	/**
	 * @param hosiptalName the hosiptalName to set
	 */
	public void setHosiptalName(String hosiptalName) {
		this.hosiptalName = hosiptalName;
	}
	/**
	 * @return the hosiptalAddress
	 */
	public String getHosiptalAddress() {
		return hosiptalAddress;
	}
	/**
	 * @param hosiptalAddress the hosiptalAddress to set
	 */
	public void setHosiptalAddress(String hosiptalAddress) {
		this.hosiptalAddress = hosiptalAddress;
	}
	/**
	 * @return the roomno
	 */
	public String getRoomno() {
		return roomno;
	}
	/**
	 * @param roomno the roomno to set
	 */
	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}
	@Override
	public String toString() {
		return "HospitalDto [id=" + id + ", paitentName=" + paitentName + ", paitentAddress=" + paitentAddress
				+ ", age=" + age + ", gender=" + gender + ", doctorName=" + doctorName + ", phoneNumber=" + phoneNumber
				+ ", hosiptalName=" + hosiptalName + ", hosiptalAddress=" + hosiptalAddress + ", roomno=" + roomno
				+ "]";
	}








}
