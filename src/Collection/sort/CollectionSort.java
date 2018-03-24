package Collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Collection.bean.Student;

public class CollectionSort {

	public static void main(String[] args) {
		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(new Student(5, "BBBB", 12, "Da Nang"));
		listStudent.add(new Student(2, "CCCC", 12, "Da Nang"));
		listStudent.add(new Student(3, "AAAA", 12, "Da Nang"));
		listStudent.add(new Student(4, "DDDD", 12, "Da Nang"));
		listStudent.add(new Student(1, "EEEE", 12, "Da Nang"));
		
		Collections.sort(listStudent, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		for (int i = 0; i < listStudent.size(); i++) {
			System.out.println(listStudent.get(i));
		}
	}
	

	
}
