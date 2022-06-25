import java.util.Scanner;
public class test2
{
    public static void main(String[] args)
    {
        int i=0,sum=0,number;
        Scanner my=new Scanner(System.in);
        System.out.println("enter the values of numbers");
        do{
            number=my.nextInt();
             if(number<0)
            {
                break;
              
            }
            
            if(number==5)
            {
                number=0;
               //continue; writing this is the altenative way instead of writing number==5
            }
            sum=sum+number;
        }
        while(i>=0); 
        System.out.printf("the sum is%d",sum);
    }
}