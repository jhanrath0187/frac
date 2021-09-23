
/**
 * defines and instantiates new Fraction objects, prints all the Fraction
 * objects, as well as runs custom methods.
 *
 */
public class Main
{
    public static void Main (String [] args)
    {
        //Initilises all base fractions
        Fraction def = new Fraction();
        Fraction oneHalf = new Fraction(1,2);
        Fraction oneThird = new Fraction(1,3);
        Fraction oneFourth = new Fraction(1,4);
        Fraction oneEighth = new Fraction(1,8);
        //Prints all base fractions
        def.printNumDem();
        oneHalf.printNumDem();
        oneThird.printNumDem();
        oneFourth.printNumDem();
        oneEighth.printNumDem();
        //Runs all functions
        (oneFourth.add(oneEighth)).printNumDem();
        (oneEighth.mult(oneEighth)).printNumDem();
        (oneEighth.div(oneEighth)).printNumDem();
        (oneHalf.subtr(oneFourth)).printNumDem();
        System.out.println(oneFourth.convertToString());
    }
}
