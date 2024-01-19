import java.util.*;

interface compute{
    double pi = 3.14;
    public double compute();
}

class Circle implements compute {
    int rad;
    Circle(){ rad = 0;}
    Circle(int x){ rad = x;}
    public double compute(){return pi*rad*rad;}
}

class Rect implements compute{
    int len,bre;
    Rect(){len=0;bre=0;}
    Rect(int x, int y){len=x;bre=y;}
    public double compute(){return(len*bre);}
}

public class interfacedemo {
    public static void main(String[] ans){
        Scanner s = new Scanner(System.in);
        int ch;
        compute p; //----------     reference of the interface
        Circle c = new Circle(9);
        Rect r = new Rect(18,27);


        System.out.println("Enter 1 for rectangle and any other value for circle:");
        ch = s.nextInt();
        if(ch==1)p=r; else p=c;

        double d = p.compute(); //------------  dynamic dispatch of method`
        System.out.println("The area = "+d);

    }
}
