import java.util.Scanner;

public class ConvertDays {
    public static void main(String[] args){
        int Days_to_Convert, month, year, days;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Days: ");
        try{
            Days_to_Convert = sc.nextInt();
            if(Days_to_Convert>0){
                year = Days_to_Convert/365;
                month = (Days_to_Convert - year*365)/30;
                days = (Days_to_Convert - year*365-month*30);
                System.out.println("Year: "+year);
                System.out.println("Month: "+month);
                System.out.println("Days: "+days);
            }
        }
        catch (NumberFormatException e){
            System.out.println("Invalid input");
        }

    }
}
