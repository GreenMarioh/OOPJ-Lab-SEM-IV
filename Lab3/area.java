import java.util.Scanner;

public class area {
    double  area(int b,int h)
    {
        return 0.5*b*b;
    }
    int area(int s)
    {
        return s*s;
    }
    double area(double r)
    {
        return 3.144*r*r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice 1. circle 2. triangle  3.square");
        int ch=sc.nextInt();
        area a=new area();
        if(ch==1){
              System.out.println("Enter radius");
              double r=sc.nextDouble();
                System.out.println("area = "+a.area(r));

        }
        else if(ch==2)
        {
              System.out.println("Enter heigth and base");
              int h=sc.nextInt();
              int b=sc.nextInt();
              
              System.out.println("area = "+a.area(b,h));
        }
        else 
        {
            
            System.out.println("Enter side");
            int s=sc.nextInt();
            System.out.println("area = "+a.area(s));
        }
        sc.close();
    }
}