package oops;

import java.util.Arrays;

class Student {
	String name;
	int id;
	Course courses[];

	public Student() {
		super();
	}

	public Student(String name, int id, Course[] courses) {
		super();
		this.name = name;
		this.id = id;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", courses=" + Arrays.toString(courses) + "]";
	}

}

class Course {
	int id;
	String courseName;
	Department department;

	public Course() {
		super();
	}

	public Course(int id, String courseName, Department department) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", department=" + department + "]";
	}

}

class Department {
	int deptNo;
	String deptName;

	public Department() {
		super();
	}

	public Department(int deptNo, String deptName) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}

}

public class ClassAndObject {

	public static void main(String[] args) {
		Department[] department = new Department[2];
		String[] dname = { "Computer Science", "Mechanical" };
		for (int i = 0; i < department.length; i++) {
			department[i] = new Department();
			department[i].setDeptNo(i + 1);
			department[i].setDeptName(dname[i]);
			System.out.println(department[i]);
		}

		Course[] course = new Course[5];
		String[] cname = { "Java", "Survey", "C++", "Pulleys", "Javascript" };
		for (int i = 0; i < course.length; i++) {
			course[i] = new Course();
			course[i].setId(i + 1);
			course[i].setCourseName(cname[i]);
			if (course[i].getCourseName().equals("Survey") || course[i].getCourseName().equals("Pulleys")) {
				course[i].setDepartment(department[1]);
			} else {
				course[i].setDepartment(department[0]);
			}
			System.out.println(course[i]);
		}

		Student[] student = new Student[3];
		String[] sname = { "Aditya", "Tejas", "Kanas" };
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
			student[i].setId(i + 1);
			student[i].setName(sname[i]);
			student[i].setCourses(course);
			System.out.println(student[i]);
		}

	}

}
