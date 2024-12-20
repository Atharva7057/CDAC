package dac.assignment1.TesterLayer;

import java.util.Scanner;

import dac.assignment1.DaoLayer.Dao;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Dao d = new Dao();
//		d.registerStudent(sc.next(),sc.nextInt(),sc.next(),sc.next());
//		d.viewStudents();
//		d.updateStudent("name", "ACP", 1);
//		d.deleteStudent(1);
		d.search("Atharva", "atharva@gmail");
		sc.close();
	}

}
