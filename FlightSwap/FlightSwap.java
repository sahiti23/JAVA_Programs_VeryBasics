package sampleprograms;

//Sample program to Swap the flight numbers

public class FlightSwap {

    String flightNumber=null;

    //accessor and mutator
    public String getFlightNumber(){return flightNumber;}
    public void setFlightNumber(String flightNumber){ this.flightNumber = flightNumber;}

    public FlightSwap(String flightNumber)
    {
        this.flightNumber = flightNumber;
    }

    public static void main(String args[]){
        FlightSwap value1 = new FlightSwap("F109");
        FlightSwap value2 = new FlightSwap("F12324");
        System.out.println("Flight 1 is "+value1.getFlightNumber());
        System.out.println("Flight 2 is  "+value2.getFlightNumber());
        swap(value1,value2);
    }

    private static void swap(FlightSwap value1, FlightSwap value2) {
        FlightSwap k = value1;
        value1 = value2;
        value2 = k;
        System.out.println("Flight 1 is changed to "+value1.getFlightNumber());
        System.out.println("Flight 2 is changed to "+value2.getFlightNumber());
    }


}
