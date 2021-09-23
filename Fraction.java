
/**
 * Write a description of class Fraction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fraction
{
    // instance variables - replace the example below with your own
    private int numerator;
    private int denominator;

    /**
     * Constructor for objects of class FractionLJ
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
    public void printNumDem()
    {
        // put your code here
        System.out.println(numerator+"/"+denominator);
    }
    //returns the numerator
    public int getNum()
    {
        // put your code here
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
    public Fraction multiply(Fraction fraction)
    {
        int newNum = numerator*fraction.numerator;
        int newDom = denominator*fraction.denominator;
        Fraction Multiplied = new Fraction(newNum,newDom);
        return Multiplied;
        
    }
    //divides 2 fractions
    public Fraction devide(Fraction fraction)
    {
        int newNum = numerator*fraction.denominator;
        int newDom = denominator*fraction.numerator;
        Fraction Devided = new Fraction(newNum,newDom);
        return Devided;
        
        
    }
    //subtracts 2 fractions
    public Fraction subtract(Fraction fraction)
    {
        int newNum = numerator*fraction.denominator;
        int newNum2 = fraction.numerator*denominator;
        int newDom = denominator*fraction.denominator;
        Fraction Added = new Fraction(newNum+newNum2,newDom);
        return Added;

    }
    public String convertToString()
    {
        return (Integer.toString(numerator)+"/"+Integer.toString(denominator));
    }
}
