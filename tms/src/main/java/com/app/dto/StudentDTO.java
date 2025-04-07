package com.app.dto;

import java.util.Objects;

public class StudentDTO {
	private long id;
	private String studentName;
	private int eng;
	private int kor;
	private int math;
	private double average;
	private int total;
	
	public StudentDTO() {;}

	public StudentDTO(long id, String studentName, int eng, int kor, int math, double average, int total) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.eng = eng;
		this.kor = kor;
		this.math = math;
		this.average = average;
		this.total = total;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", studentName=" + studentName + ", eng=" + eng + ", kor=" + kor + ", math="
				+ math + ", average=" + average + ", total=" + total + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDTO other = (StudentDTO) obj;
		return id == other.id;
	}
}
