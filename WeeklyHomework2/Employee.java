package weekly2Homework;

public class Employee {
    public int year;

    public void raise(){
        if(year < 1){
            System.out.println("No raise is made");
        }
        else if(year == 1){
            System.out.print("Raise 5% for 1 year");
        }
        else if(year == 2){
            System.out.print("Raise 10% for 2 year");
        }
        else if(year == 3){
            System.out.print("Raise 15% for 3 year");
        }
        else if(year == 4){
            System.out.print("Raise 20% for 4 year");
        }
        else{
            System.out.print("Raise 25% for 5+ year");
        }
    }
}
