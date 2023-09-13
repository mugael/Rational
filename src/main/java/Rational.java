class Rational { 
    long numerator,denominator; 

    class Illegal extends Exception { 
        String reason;
        Illegal (String reason) { 
            this.reason = reason; 
        } 
    } 

    Rational() {
        // to be completed
    }

    Rational(long numerator, long denominator) throws Illegal {
        this.numerator = numerator;
        this.denominator = denominator;
        // to be completed
    } 

    // find the reduce form 
    private void simplestForm() { 
        long computeGCD; 
        computeGCD = GCD(Math.abs(numerator), denominator); 
        numerator /= computeGCD; 
        denominator /= computeGCD; 
    } 

    // find the greatest common denominator 
    private long GCD(long a, long b) { 
        if (a%b ==0) return b; 
        else return GCD(b,a%b); 
    }

    /***
     * Compute an addition of the current rational number to another given rational number
     * @param x the rational number to be added to the current rational number
     */
    public void add(Rational x) { 
        numerator = (numerator * x.denominator) + (x.numerator * denominator);
        denominator = (denominator * x.denominator); 
        simplestForm(); 
    }

    /***
     * Compute a subtraction of the current rational number to another given rational number
     * @param x the rational number to be subtracted from the current rational number
     */
    public void subtract(Rational x) {
        numerator = (numerator * x.denominator) - (x.numerator * denominator);
        denominator = (denominator * x.denominator);
        simplestForm();
        // to be completed
    }

    /***
     * Compute a multiplication of the current rational number to another given rational number
     * @param x the rational number to be multiplied to the current rational number
     */
    public void multiply(Rational x) {
        numerator = (numerator * x.numerator);
        denominator = (denominator * x.denominator);
        simplestForm();
        // to be completed
    }

    /***
     * Compute a division of the current rational number to another given rational number
     * @param x the rational number to be divided by the current rational number
     */
    public void divide(Rational x) {
        numerator = (numerator * x.denominator);
        denominator = (denominator * x.numerator);
        simplestForm();
        // to be completed
    }

    /***
     * Check if the given rational number equals to the current rational number
     * @param x the rational number to be compared to the current rational number
     * @return true if the given rational number equals to the current, false otherwise
     */
    public boolean equals(Object x) {
        // to be completed
    if(x instanceof String){
        Rational r = null;
        String[] str = ((String) x).split("/");
        long number = Long.parseLong(str[0]);
        long number2 = Long.parseLong(str[1]);
        try {
            r = new Rational(number,number2);
        } catch (Illegal e) {
            throw new RuntimeException(e);
        }
        this.simplestForm();
        r.simplestForm();
        if((this.numerator == r.numerator) && (this.denominator == r.denominator)){
            return true;
        }else 
            return false;
    } if(x instanceof Rational ){
        this.simplestForm();
        ((Rational) x).simplestForm();
            if((this.numerator == ((Rational) x).numerator) && (this.denominator == ((Rational) x).denominator)){
                return true;
            }else
                return false;
    }
        return false; // TODO: This needs to be modified.
    }

    /***
     * Compare the current rational number to the current rational number
     * @param x the rational number to be compared to the current rational number
     * @return -1 if the current rational number is less than the given number, 0 if they're equal, 1 if the current
     * rational number is larger than the given number
     */
    public long compareTo(Object x) {
        // to be completed
        if(x instanceof String){
            Rational r = null;
            String[] str = ((String) x).split("/");
            long number = Long.parseLong(str[0]);
            long number2 = Long.parseLong(str[1]);
            try {
                r = new Rational(number,number2);
            } catch (Illegal e) {
                throw new RuntimeException(e);
            }
            this.simplestForm();
            r.simplestForm();
            double num = (double) this.numerator /this.denominator;
            double num2 = (double) r.numerator /r.denominator;
            return Double.compare(num, num2);
        }
        if(x instanceof Rational ){
            this.simplestForm();
            ((Rational) x).simplestForm();
            double num = (double) this.numerator /this.denominator;
            double num2 = (double) ((Rational) x).numerator /((Rational) x).denominator;
            if(num > num2){
                return 1;
            } else if (num == num2) {
                return 0;
            }else
            {
                return  -1;
            }
        }
        return -1; // TODO: this needs to be modified.
    }

    /***
     * Give the formatted string of the rational number
     * @return the string representation of the rational number. For example, "1/2", "3/4".
     */
    public String toString() { 
        // to be completed
        return this.numerator + "/" + this.denominator; // TODO: This needs to be modified.
    }

    public static void main(String[] args) {
        System.out.println("This is Rational class.");
    }
}