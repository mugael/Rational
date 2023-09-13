import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
   /* @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }*/
    @Test
    public void testAdd(){
        Rational r = new Rational();
        r.numerator = 1;
        r.denominator = 2;
        Rational s = new Rational();
        s.numerator = 1;
        s.denominator =2;
        r.add(s);
       Assert.assertEquals(1,r.numerator);
       Assert.assertEquals(1,r.denominator);
    }

    @Test
    public void testSubstract() throws Rational.Illegal {
        Rational r = new Rational(3,4);
        Rational s = new Rational(2,4);
        r.subtract(s);
        Assert.assertEquals(1,r.numerator);
        Assert.assertEquals(4,r.denominator);
    }
    @Test
    public void testMultiply() throws Rational.Illegal {
        Rational r = new Rational(3,4);
        Rational s = new Rational(2,4);
        r.multiply(s);
        Assert.assertEquals(3,r.numerator);
        Assert.assertEquals(8,r.denominator);
    }

    @Test
    public void testDivide() throws Rational.Illegal{
        Rational r = new Rational(3,4);
        Rational s = new Rational(2,4);
        r.divide(s);
        Assert.assertEquals(3,r.numerator);
        Assert.assertEquals(2,r.denominator);
    }

    @Test
    public void testEquals() throws Rational.Illegal {
        Rational r = new Rational(1,2);
        Rational s = new Rational(2,4);
        Assert.assertTrue(r.equals(s));

    }

    @Test
    public void testCompareTo() throws Rational.Illegal {
        Rational r = new Rational(1,2);
        Rational s = new Rational(1,4);
        Assert.assertEquals(1,r.compareTo(s));
    }

    @Test
    public void testCompareTo2() throws Rational.Illegal {
        Rational r = new Rational(1,2);

        Assert.assertEquals(-1,r.compareTo("1/1"));
    }

    @Test
    public void testCompareTo3() throws Rational.Illegal {
        Rational r = new Rational(1,2);
        Assert.assertEquals(0,r.compareTo("1/2"));
    }
}
