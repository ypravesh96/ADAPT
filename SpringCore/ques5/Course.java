package beans;

import javax.annotation.Resource;

public class Course {
	private int courseCode;
	private String courseName;
	
	@Resource(name="Student")
	private Student student;
	
	public int getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

    public void toStrings() {
        System.out.println("Student [" + student.toString() + ", Course Code=" + this.getCourseCode() +", Course Name="+this.getCourseName()+ "]");
    }
}
