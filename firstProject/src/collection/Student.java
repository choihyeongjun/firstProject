package collection;

public class Student implements Comparable<Student>{
	private String name;
	private int mathScore;
	private int engScore;
	public Student(int index, String using, String use, String user) {
		
	}
	public Student(String name,int mathScore,int engScore) {
		this.name=name;
		this.mathScore=mathScore;
		this.engScore=engScore;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.mathScore-o.mathScore;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", mathScore=" + mathScore + ", engScore=" + engScore + "]";
	}
	public String getName() {
		return name;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
