package CWH;

/**
 * this is method_tags class and i am just checking it
 */
public class method_Tags {
    /**
     *
     * @param args these r the arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println(" this is main method ");
    }

    /**
     * hello this is the method and this the most beutiful method in class
     * @param a this is first no.
     * @param b this is second no.
     * @return sum of two numbers as an integer
     * @throws Exception if a is 0
     * @deprecated this method is depricated plz use other method
     */

    public int add(int a , int b ) throws Exception
    {
        if(a==0)
        {
            throw new Exception();
        }
        int c = a+b;
        return c;
    }

    //  /* he fkt program madhe comments sathi ahe
    // ani /** double star wale method tags generate krnyasathi doc madhe

}

