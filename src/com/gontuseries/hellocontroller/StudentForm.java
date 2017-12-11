package com.gontuseries.hellocontroller;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class StudentForm {
	private Address studentAdress;

	@Past
	private Date sDate;

	@Pattern(regexp="[^0-9]*") @IsValidStudentName(listOfStudents="Mr.rabbb|Mr.robie|Mr.rabb")
	private String sName;

	@Max(2222)
	private int sNum;

	@Size(min = 2, max = 30) @IsValidCourse(listOfValidCourses="it|CS|JAVA|MVC")
	private String sCourse;
	
	private List<String> sSkills;

	public Date getsDate() {
		return sDate;
	}

	public void setsDate(Date sDate) {
		this.sDate = sDate;
	}

	public Address getStudentAdress() {
		return studentAdress;
	}

	public void setStudentAdress(Address studentAdress) {
		this.studentAdress = studentAdress;
	}

	public int getsNum() {
		return sNum;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsCourse() {
		return sCourse;
	}

	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}

	public List<String> getsSkills() {
		return sSkills;
	}

	public void setsSkills(List<String> sSkills) {
		this.sSkills = sSkills;
	}

}
