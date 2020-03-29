package com.seoyun.servletmvc;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents() {
		
		// 빈 리스트 만들기
		List<Student> students = new ArrayList<>();
		
		// 샘플 데이터 넣기
		students.add(new Student("Mary", "mary@email.com"));
		students.add(new Student("Tom", "Tom@email.com"));
		students.add(new Student("Jack", "Jack@email.com"));
		students.add(new Student("Robert", "Robert@email.com"));
		
		// 리턴하기
		return students;
	}
}
