public class Sum {

    public static void main(String[] args){
    System.out.println("Sum Ans :" + calculate(10, 10));

    }
   
    static float calculate (int a,int b)
    {
       
        float sum = 0;
        float c = (float) 0.2;
        float sumR = (float) 0.2;

        sum = a+b/c;

         float ans = (float) Math.pow(sum, sumR);
        return ans;
        
    }

}