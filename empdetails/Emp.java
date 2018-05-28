package empdetails;

public class Emp {

    String name, city;
    int age, sal;
    public Emp(String name){
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void salary(int sal){
        this.sal= sal;
    }
    public void setCity()
    {
        this.city = city;
    }
    public String getCity()
    {
        return city;
    }
    public void printEmp(){
        System.out.println("The name of the employee is "+name);
        System.out.println("The age of the employee is "+age);
        System.out.println("The salary of the employee is "+sal);
        System.out.println("The Address of the employee is "+city);
    }
}
