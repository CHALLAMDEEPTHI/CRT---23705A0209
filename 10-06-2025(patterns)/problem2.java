import java.util.Scanner;
class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=4){
            if(n%2 == 0){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }else{
            System.out.println(n-1);
        }
        
    }
}