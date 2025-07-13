import java.util.Scanner;
class rectangle {
    int length;
    int breadth;
   public void read()
    {
        System.out.println("Enter length and breadth ");
        Scanner sc=new Scanner(System.in);
        length=sc.nextInt();
        breadth=sc.nextInt();
        sc.close();
    }    
   public int calculate()
    {
       int perimeter=2*(length+breadth);
       return perimeter;
    }
  public  void display(int perimeter)
    {
        System.out.println("The perimeter is "+perimeter);
    }
    public static void main(String[] args) {
        
    
    rectangle Rec= new rectangle();
    Rec.read();
    int perimeter=Rec.calculate();
     Rec.display(perimeter);
    }
}