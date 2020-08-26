package com.course;
import java.util.*;

public class Course {
		public TreeMap<Student,String>einfo=new TreeMap<>();
		private String course;
		
		public void addCourse(Student st,String course) {
			this.einfo.put(st,course);
			
		}
		
		public TreeMap<Student,String> getInfo() {
			return einfo;
		}
		public void setInfo(TreeMap<Student,String> einfo) {
			this.einfo = einfo;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		
		
		
}
