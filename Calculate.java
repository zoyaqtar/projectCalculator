// Java Program to implement
// Direct Addition to Add two Numbers
import java.io.*;
 
// Driver Class
class addition {
    public  float sum(float num1, float num2)
    {
        return num1+num2;
    }

    public  float sub(float num1, float num2)
    {
        return num1-num2;
    }
     
     
      // main function
    public static void main(String[] args)
    {
        float num1 = 10, num2 = 20, res = 0;
        addition ob = new addition();
        res = ob.sum(num1, num2);
        System.out.println(res);

        res = ob.sub(num1, num2);
        System.out.println(res);
    }
}