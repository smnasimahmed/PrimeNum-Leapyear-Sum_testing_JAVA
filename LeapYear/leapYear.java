import java.util.Scanner;

class leapChecking{
    boolean leapcheck (int year){
        boolean leap = false;
  
      // if the year is divided by 4
      if (year % 4 == 0) {

        // if the year is century
        if (year % 100 == 0) {
  
          // if year is divided by 400
          // then it is a leap year
          if (year % 400 == 0)
            leap = true;
          else
          leap = false;
        }
        
        // if the year is not century
        else
        leap = true;
      }
      
      else
      leap = false;


      return leap;
    }
}


public class leapYear{

    public static void main(String[] args) {
  
      // year to be checked
      int year;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the year - ");
      year = input.nextInt();
      input.close();

      leapChecking obj = new leapChecking();
      boolean flag = obj.leapcheck(year);
  
      if (!flag)
        System.out.println(year + " is not a leap year.");
      else
        System.out.println(year + " is  a leap year.");
    }
  }