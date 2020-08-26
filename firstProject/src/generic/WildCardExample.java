package generic;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		
	}
	public static void registerCourseStudent(Course<? extends Student>course) {
		
	}
	public static void registerCourseWorker(Course<? super Worker>course) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course<Person>crsPerson=new Course<>("일반인과정",5);
		Course<Worker>crsworker=new Course<>("직장인과정",5);
		Course<Student>crsStudent=new Course<>("학생과정",5);
		Course<HighStudent>crsHighStudent=new Course<>("고등학생과정",5);
		
		//일반인등록가능.
		registerCourse(crsPerson);
		registerCourse(crsworker);
		registerCourse(crsStudent);
		registerCourse(crsHighStudent);
		//직장인등록가능.
		registerCourseWorker(crsPerson);
		registerCourseWorker(crsworker);
		//registerCourseWorker(crsStudent);
		//registerCourseWorker(crsHighStudent);
		//학생등록가능.
		//registerCourseStudent(crsPerson);
		//registerCourseStudent(crsworker);
		registerCourseStudent(crsStudent);
		registerCourseStudent(crsHighStudent);
		//고등학생가능.
		registerCourse(crsPerson);
		registerCourse(crsworker);
		registerCourse(crsStudent);
		registerCourse(crsHighStudent);
	}

}
