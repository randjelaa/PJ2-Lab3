//package org.unibl.etf.pj2.main;

//import org.unibl.etf.pj2.integer.PJ2Integer;
//import org.unibl.etf.pj2.util.Util;
//import org.unibl.etf.pj2.student.Student;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student("Marko", "Markovic", 4);
        Student s2 = new Student("Petar", "Petrovic", 6);

        System.out.println(s1.getFullNameReverse());
        System.out.println(s2.getFullNameReverse());

        System.out.println();

        s1.setIme("Luka");
        System.out.println(s1.getIme());
        s1.setPrezime("Lukic");
        System.out.println(s1.getPrezime());

        System.out.println();

        s2.setIme("Ivan");
        System.out.println(s2.getIme());
        s2.setPrezime("Ivanic");
        System.out.println(s2.getPrezime());

        System.out.println();

        System.out.println(Util.reverse(s1.getBrispita(), s2.getBrispita()));
        System.out.println(PJ2Integer.toBinaryString(s1.getBrispita()) + " " + PJ2Integer.toBinaryString(s2.getBrispita()));
    }
}
