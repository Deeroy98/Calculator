package calculator;

public class Calculator 
{
    public static void main(String[] args) 
    {
       add(5,6);
       subtract(5,6);
       divide(5,6);
       multiply(5,6);
    }  
   // add was made static which means it can move
    public static int add(int x, int y)
    {
        int total = x + y;
        System.out.println(total);
        return total;
    }
    public static int subtract(int x, int y)
    {
        int total = x - y;
        System.out.println(total);
        return total;
    }
    public static int divide(int x, int y)
    {
        int total = x / y;
        System.out.println(total);
        return total;
    }
    public static int multiply(int x, int y)
    {
        int total = x x y;
        System.out.println(total);
        return total;
    }
}
