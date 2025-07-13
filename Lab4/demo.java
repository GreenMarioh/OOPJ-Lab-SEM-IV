import java.util.Scanner;
class box{
    int length,width,height;
    box(int l,int w,int h){
        length=l;
        width=w;
        height=h;
    }
    int volume(){
        return length*width*height;
    }
}
public class demo{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int y=input.nextInt();
		int z=input.nextInt();
		box mybox=new box(x,y,z);
		System.out.println("Volume="+mybox.volume());
	}
}
