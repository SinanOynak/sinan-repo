package weekly1Homework;
import java.util.Scanner;

public class WeeklySalaryCalculation {
    public static void main(String [] args){
        System.out.println("Please enter base salary:");
        Scanner scanner = new Scanner(System.in);
        double baseSalary = scanner.nextDouble();
        System.out.println("Please enter total hours worked during the week :");
        double totalHourWeek = scanner.nextDouble();
        System.out.println("Please enter total hours worked on the weekend");
        double totalHourWeekend = scanner.nextDouble();
        scanner.close();

        double totalHour = totalHourWeek + totalHourWeekend;
        double amountWeekday=0.0;
        double amountWeekend=0.0;
        double totalSalary=0.0;
        int hourlyRate = 1000/40;

        if (baseSalary < 1000){
            System.out.println("Base salary must be at least 1000") ;
        }
        else{
            if(totalHour > 40){
                amountWeekday = (totalHourWeek * 1.5 * hourlyRate);
                if (totalHourWeekend > 10){
                    amountWeekend = 500+ (totalHourWeekend * 2 * hourlyRate);
                }
                else{
                    amountWeekend = (totalHourWeekend * 2 * hourlyRate);
                }
                totalSalary = amountWeekend + amountWeekday + baseSalary;
            }
            else if(totalHour < 40){
                totalSalary = baseSalary - (40 - totalHour) * hourlyRate;
            }
            else{
                totalSalary = baseSalary;
            }
        }
        System.out.println("Your TotalSalary is :"+ totalSalary);
    }
}
