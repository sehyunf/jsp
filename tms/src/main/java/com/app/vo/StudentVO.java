package com.app.vo;

import java.util.Objects;

public class StudentVO {
	private long id;
	private String studentName;
	private int eng;
	private int kor;
	private int math;
	
	public StudentVO() {;}

	public StudentVO(long id, String studentName, int eng, int kor, int math) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.eng = eng;
		this.kor = kor;
		this.math = math;
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

	@Override
	public String toString() {
		return "StudentVO [id=" + id + ", studentName=" + studentName + ", eng=" + eng + ", kor=" + kor + ", math="
				+ math + "]";
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
		StudentVO other = (StudentVO) obj;
		return id == other.id;
	}
	
	
}
