package com.seoyun.servletmvc;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents() {
		
		// �� ����Ʈ �����
		List<Student> students = new ArrayList<>();
		
		// ���� ������ �ֱ�
		students.add(new Student("Mary", "mary@email.com"));
		students.add(new Student("Tom", "Tom@email.com"));
		students.add(new Student("Jack", "Jack@email.com"));
		students.add(new Student("Robert", "Robert@email.com"));
		
		// �����ϱ�
		return students;
	}
}
