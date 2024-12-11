public class Operations 
{
//Addition
public double add(double a, double b)
{
    return a + b;
}

//Subtraction
public double subtract(double a, double b)
{
    return a - b;
}

//Multiplictaion
public double multiply(double a, double b)
{
    return a * b;
}

//Division
public double divide(double a, double b)
{
    if (b == 0)
    {
    System.out.println("Don't you dare divide by 0");
    }
    return a / b;
}

//Sq Root
public double squareRoot(double a)
{
    if (a < 0)
    {
    System.out.println("You can't square root a negative number");
    }
    return Math.sqrt(a);
}

//Power
public double power(double a, double b)
{
    return Math.pow(a, b);
}

//Logarithm
public double log(double a)
{
    if (a <= 0)
    {
    System.out.println("number must be positive");
    }
    return Math.log(a);
}


}
