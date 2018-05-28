import java.util.Scanner;
public class Flight {
    int passengers;
    int seats;

    public boolean hasRoom(Flight f2)
    {
        int total = this.passengers+f2.passengers;
        return seats>total;
    }
    public Flight createNewFlight(Flight f2)
    {
        Flight newF = new Flight();
        newF.seats = seats;
        newF.passengers = passengers+f2.passengers;
        return newF;
    }
    public static void main(String args[]){
        Flight f1 = new Flight();
        Scanner s = new Scanner(System.in);
        System.out.println("enter first flight passengers");
        f1.passengers =s.nextInt();
        System.out.println("enter first flight seats");
        f1.seats = s.nextInt();

        Flight f2 = new Flight();
        System.out.println("enter second flight's passengers count");
        f2.passengers =s.nextInt();
        Flight f3 = null;

       if(f1.hasRoom(f2))
        {
            f3 = f1.createNewFlight(f2);
            System.out.println("Flight "+f3+" can take passengers from the second flight as well.");
            System.out.print("with new passengers count as "+f3.passengers);
            System.out.println(" with "+ f3.seats + " seats");
        }
        else
       {
           System.out.println("This flight cannot accommodate all the passengers from both the flights.");
       }
    }
}
