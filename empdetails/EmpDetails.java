package empdetails;

import java.util.Scanner;

public class EmpDetails {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        Emp e1 = new Emp("sahiti");
        Emp e2 = new Emp("abc");

        System.out.println("Please provide details for employee name " +e1.name);
        System.out.println("enter age for " +e1.name);
        e1.age = s.nextInt();
        System.out.println("enter salary requirements for " +e1.name);
        e1.sal = s.nextInt();
        System.out.println("enter city for "+e1.name);
        e1.city = s.next();
        e1.printEmp();

        System.out.println("Please provide details for employee name " +e2.name);
        System.out.println("enter age for " +e2.name);
        e2.age = s.nextInt();
        System.out.println("enter salary requirements for " +e2.name);
        e2.sal = s.nextInt();
        System.out.println("city ");
        e2.city = s.next();
        e2.printEmp();
    }
}
