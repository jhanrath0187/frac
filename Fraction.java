
/**
 * Write a description of class FractionLJ here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fraction
{
    // instance variables - replace the example below with your own
    private int numerator;
    private int denomiter;

    /**
     * Constructor for objects of class FractionLJ
     */
    //Constructs the fraction with perameters
    public Fraction(int num, int dem)
    {
        // initialise instance variables
        numerator = num;
        denomiter = dem;
    }
    //constructs the base fraction
    public Fraction()
    {
        // initialise instance variables
        numerator = 0;
        denomiter = 0;
    }
    //prints the fraction
    public void printNumDem()
    {
        // put your code here
        System.out.println(numerator+"/"+denomiter);
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
        return denomiter;
    }
    //adds 2 fractions
    public Fraction add(Fraction fraction)
    {
        int newNum = numerator*fraction.denomiter;
        int newNum2 = fraction.numerator*denomiter;
        int newDom = denomiter*fraction.denomiter;
        System.out.println(newNum+newNum2+"/"+newDom);
        Fraction Added = new Fraction(newNum+newNum2,newDom);
        return Added;
    }
    //multiplys 2 fractions
    public void multiply(Fraction fraction)
    {
        int newNum = numerator*fraction.numerator;
        int newDom = denomiter*fraction.denomiter;
        System.out.println(newNum+"/"+newDom);
        
    }
    //devides 2 fractions
    public void devide(Fraction fraction)
    {
        int newNum = numerator*fraction.denomiter;
        int newDom = denomiter*fraction.numerator;
        System.out.println(newNum+"/"+newDom);
        
    }
    //subtracts 2 fractions
    public Fraction subtract(Fraction fraction)
    {
        int newNum = numerator*fraction.denomiter;
        int newNum2 = fraction.numerator*denomiter;
        int newDom = denomiter*fraction.denomiter;
        System.out.println(newNum-newNum2+"/"+newDom);
        Fraction Added = new Fraction(newNum+newNum2,newDom);
        return Added;

    }
}
