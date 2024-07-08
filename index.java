import java.util.*;
class shapes
{
    int l,b,side,base;
    float height,radius;
    void area(int l, int b)
    {
        int area = l*b;
        System.out.println("Area of rectangle"+area);
    }
    void area(int side)
    {
        int area=side*side*side;
        System.out.println("Area of cube"+area);
    }
    void area(float r)
    {
        float area =r*r;
        System.out.println("Area of circle"+area*3.14);
    }
    void area(int base, float height)
    {
        float area = (base*height)/2;
        System.out.println("Area of triangle"+area);
    }
}
public class index
{
    public static void main(String[] args)
    {
     Scanner s = new Scanner(System.in);
     shapes sh= new shapes();
     System.out.println("Enter the lenght and breadth");
     int len=s.nextInt();
     int br=s.nextInt();   
     System.out.println("Enter the radius");
     float r=s.nextFloat();
     System.out.println("Enter the side");
     int side=s.nextInt();
     System.out.println("Enter the base and height");
     int base=s.nextInt();
     float h=s.nextFloat();   
    sh.area(r);
    sh.area(base, h);
    sh.area(len, br);
    sh.area(side);
    }
}