// This class determines the logarithm of a number
public class DebugTwelve1
{
  public static void main(String[] args)
  {
     double num = -8.8, result;
     try
     { result = Math.log(num);
        System.out.println("Result is " + result);
     }
     catch(ArithmeticException e)
     {
        System.out.println("Caught Exception: " + e);
     }
  }
}