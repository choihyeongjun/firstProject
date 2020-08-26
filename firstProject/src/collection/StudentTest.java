package collection;
import java.util.*;
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Student st=new Student();
		Student[] sta=new Student[100];
		
		Scanner scn=new Scanner(System.in);
		String name="";
		int math=0;
		int eng=0;
		boolean run=true;
		List<Student>list=new ArrayList<>();
		while (run) {
			System.out.println("번호입력");
			int seno=scn.nextInt();
			if (seno == 1) {
				System.out.println("사람입력");
				for (int i = 0; i < 3; i++) {
					name = scn.next();
					math = scn.nextInt();
					eng = scn.nextInt();scn.nextLine();
					
					Student st1 = new Student(name, math, eng);
					list.add(st1);
				}
				
			} else if (seno == 2) {
				int engsum = 0;
				int mathsum = 0;
				for (int i = 0; i < 3; i++) {
					engsum += list.get(i).getEngScore();
					mathsum += list.get(i).getMathScore();
				}
				System.out.println("영어 평균=" + engsum / 3);
				System.out.println("수학 평균=" + mathsum / 3);
			} else if (seno == 3) {
				int max = 0;
				int maxin = 0;
				for (int i = 0; i < 3; i++) {
					if (max < list.get(i).getMathScore()) {
						maxin = i;
						max=list.get(i).getMathScore();
					}
					else
						continue;
				}
				System.out.println("이름:" + list.get(maxin).getName() + ", " + "점수:" + list.get(maxin).getMathScore());
			} else if (seno == 9) {
				run = false;
			}
		}
		System.out.println("프로그램이 종료되었습니다");
		
		
		
	}

}
