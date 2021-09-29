
/**
 * defines and instantiates new Fraction objects, prints all the Fraction
 * objects, as well as runs custom methods.
 *
 */
public class main
{
    public static void main (String [] args)
    {
        //Initilises all base fractions
        Fraction def = new Fraction();
        Fraction oneHalf = new Fraction(1,2);
        Fraction oneThird = new Fraction(1,3);
        Fraction oneFourth = new Fraction(1,4);
        Fraction oneEighth = new Fraction(1,8);
        //Prints all base fractions
        System.out.println(def.toString());
        System.out.println(oneHalf.toString());
        System.out.println(oneThird.toString());
        System.out.println(oneFourth.toString());
        System.out.println(oneEighth.toString());
        //Runs all functions
        System.out.println((oneFourth.add(oneEighth)).toString());
        System.out.println((oneEighth.mult(oneEighth)).toString());
        System.out.println((oneEighth.div(oneEighth)).toString());
        System.out.println((oneHalf.subtr(oneFourth)).toString());
        System.out.println(oneFourth.toString());
    }
}
