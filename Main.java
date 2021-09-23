
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void Main (String [] args)
    {
        //Initilises all base fractions
        Fraction oneHalf = new Fraction(1,2);
        Fraction oneThird = new Fraction(1,3);
        Fraction oneFourth = new Fraction(1,4);
        Fraction oneEaighth = new Fraction(1,8);
        //Prints all base fractions
        oneHalf.printNumDem();
        oneThird.printNumDem();
        oneFourth.printNumDem();
        oneEaighth.printNumDem();
        //Runs all our functions
        (oneFourth.add(oneEaighth)).printNumDem();
        (oneEaighth.multiply(oneEaighth)).printNumDem();
        (oneEaighth.devide(oneEaighth)).printNumDem();
        (oneHalf.subtract(oneFourth)).printNumDem();
        System.out.println(oneFourth.convertToString());
    }
}
