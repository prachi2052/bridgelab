import java.util.scanner;
public class Calculator{
    public void add(int a , int b)
    {
        int valueA=a;
        int valueB=b;
        int result=a+b;
        System.out.println(result);
    }
    public void sub(int a , int b )
    {
        int valueA=a;
        int valueB=b;
        int result=a-b;
        System.out.println(result);
        
    }
        public void multiply(int a,int b)
    {
        int valueA=a;
        int valueB=b;
        int result=a*b;
        System.out.println(result);
    
    }
        public void div(int a,int b)
    {
        int valueA=a;
        int valueB=b;
        int result=a%b;
        System.out.println(result);
    
    }
    public static void main (String[]args)
    {
        Scanner sc=new Scanner (System.in);
        Systeem.out.println("Enter first value ");
        int valueA =sc.nextInt();
        System.out.println("Enter second value");
        int valueB=sc.nextInt();
        Calculator obj =new Calculator();
        obj.add(valueA,valueB);
        obj.sub(valueA,valueB);
        obj.multiply(valueA,valueB);
        obj.div(valueA,valueB);
    }






    }
}