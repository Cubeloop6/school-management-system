import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher mellisa = new Teacher(2, "Mellisa", 700);
		Teacher venderhorn = new Teacher(3, "Venderhorn", 600);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(venderhorn);
		
		Student tamasha = new Student(1, "Tamasha", 4);
		Student rakshith = new Student(2, "Rakshith Vasudev", 12);
		Student rabbi = new Student(3, "Rabbi", 5);
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(tamasha);
		studentList.add(rakshith);
		studentList.add(rabbi);
		
		
		
		School ghs = new School(teacherList, studentList);
	
	
		tamasha.payFees(5000);
		System.out.println("GHS has earned " + ghs.getTotalMoneyEarned());
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println(lizzy.getName() + ghs.getTotalMoneyEarned());
	
		venderhorn.receiveSalary(venderhorn.getSalary());
		System.out.println(venderhorn.getName() + ghs.getTotalMoneyEarned());
		
		System.out.println(rakshith);
		System.out.println(mellisa);
	}
	
}
