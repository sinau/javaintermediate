package javaintermediate.session1;

import java.util.HashSet;
import java.util.Set;

public class CobaSet {
	public static void main(String[] args) {
		Set<String> books = new HashSet<String>();
		books.add("java");
		books.add("C++");
		books.add("python");
		
		// mereplace "java" yang atas ke dalam set karena sama
		books.add("java");
		
		for(String book : books) {
			System.out.println("Buku: " + book);
		}
	}
}
