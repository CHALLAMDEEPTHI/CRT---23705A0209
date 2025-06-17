public class Main{
    public static void main(String[] args){
        int num = 4521;
        int evencount = 0;
        int oddcount = 0;
        while(num>0){
            if((num%10)%2 == 0){
                evencount = evencount+1;
                
            }else{
                oddcount = oddcount+1;
            }
            num = num/10;
        }
        int count = evencount+oddcount;
        if(count == evencount||count == oddcount){
            System.out.println("good number");
        }else{
            System.out.println("bad number");
        }
    }
}