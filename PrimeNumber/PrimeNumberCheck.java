import java.util.Scanner;


class primeCheckFunc{
    //String pncheck(double number)

    boolean pncheck(double number){
        boolean flag = false;

        if(number == 0 || number == 1){
            return false;
        }

        for (int i = 2; i<= number/2; ++i){
            //condition for nonPrime Number
            if (number % i == 0){
                flag = true;
                break;
            }
        }
        return flag;
    }
}


public class PrimeNumberCheck {
    public static void main(String[] args) {
        double nmbr;
        //String str = "Invalid Variable";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number - ");
        nmbr = input.nextDouble();
        input.close();
        
        primeCheckFunc obj = new primeCheckFunc();
        boolean flag = obj.pncheck(nmbr);

        if(!flag){
             System.out.print(nmbr + " is a Prime Number.");
          }
                
         else{
           System.out.print(nmbr + " is not a Prime Number.");
        }
        
    }
}