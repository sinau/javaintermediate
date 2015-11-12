package javaintermediate.session1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListMahasiswa {
	public static void main(String[] args) {
		List<Mahasiswa> students = new ArrayList<Mahasiswa>();
		
		Mahasiswa m1 = new Mahasiswa();
		m1.setNim(987);
		m1.setNama("Budi");
		
		Mahasiswa m2 = new Mahasiswa();
		m2.setNim(123);
		m2.setNama("Joni");
		
		Mahasiswa m3 = new Mahasiswa();
		m3.setNim(163);
		m3.setNama("Johan");
		
		students.add(m1);
		students.add(m2);
		students.add(m3);
		
		System.out.println("Sebelum disorting");
		for(Mahasiswa m : students) {
			System.out.println(m.getNim() + " " + m.getNama());
		}
		
		Collections.sort(students, Collections.reverseOrder());
		System.out.println("Setelah disorting");
		for(Mahasiswa m : students) {
			System.out.println(m.getNim() + " " + m.getNama());
		}
	}
}
