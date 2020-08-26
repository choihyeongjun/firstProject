package generic;

public class Course<T> {
	private String CourseName;
	private T[] students;
	public Course(String CourseName,int capacity) {
		this.CourseName=CourseName;
		this.students=(T[]) new Object[capacity];
	}
	public String getCourseName() {
		return CourseName;
	}
	public T[] getStudents() {
		return students;
	}
	public void add(T t) {
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				students[i]=t;
				break;
			}
		}
	}
	
}
