
/**
 * adds, multiplies, divides, and subtracts fractions. Converts to string
 *
 */
public class Fraction
{
    // instance variables - replace the example below with your own
    private int numerator;
    private int denominator;

    /**
     * Constructor for objects of class Fraction
     */
    //Constructs the fraction with perameters
    public Fraction(int num, int dem)
    {
        // initialise instance variables
        numerator = num;
        denominator = dem;
    }
    //constructs the base fraction
    public Fraction()
    {
        // initialise instance variables
        numerator = 0;
        denominator = 0;
    }
    //prints the fraction
    public String toString()
    {
        // put your code here
        return(numerator+"/"+denominator);
    }
    //returns the numerator
    public int getNum()
    {
        return numerator;
    }
    //returns the denomitor
    public int getDen()
    {
        // put your code here
        return denominator;
    }
    //adds 2 fractions
    public Fraction add(Fraction fraction)
    {
        int newNum = numerator*fraction.denominator;
        int newNum2 = fraction.numerator*denominator;
        int newDom = denominator*fraction.denominator;
        Fraction Added = new Fraction(newNum+newNum2,newDom);
        return Added;
    }
    //multiplies 2 fractions
    public Fraction mult(Fraction fraction)
    {
        int newNum = numerator*fraction.numerator;
        int newDom = denominator*fraction.denominator;
        Fraction Multiplied = new Fraction(newNum,newDom);
        return Multiplied;
        
    }
    //divides 2 fractions
    public Fraction div(Fraction fraction)
    {
        int newNum = numerator*fraction.denominator;
        int newDom = denominator*fraction.numerator;
        Fraction Divided = new Fraction(newNum,newDom);
        return Divided;
        
        
    }
    //subtracts 2 fractions
    public Fraction subtr(Fraction fraction)
    {
        int newNum = numerator*fraction.denominator;
        int newNum2 = fraction.numerator*denominator;
        int newDom = denominator*fraction.denominator;
        Fraction Added = new Fraction(newNum+newNum2,newDom);
        return Added;
        

    }
    
}
