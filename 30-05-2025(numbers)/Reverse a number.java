public class Main{
    public static void main(String[] args){
        int num = 4521;
        int copy = num;
        int rev = 0;
        while(copy>0){
            int digit = copy%10;
            rev = (rev*10)+digit;
            copy = copy/10;
        }
        System.out.println("Reverse of"+ num+" = " +rev );
    }
       
}