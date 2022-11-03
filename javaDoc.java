package CWH;

/**
 * this class is to demonstrate what javadocs is and how it is used in the java industry
 * <i> hello </i>
 * <p> this is a paragraph </p>
 * @author Ashutosh Birajdara
 * @version 0.1
 * @since 2002
 * @see <a href="https://www.gitasupersite.iitk.ac.in/srimad?show_mool=1&htrskd=1&httyn=1&htshg=1&scsh=1&hcchi=1&scram=1&scmad=1&scms=1&etsiva=1&etpurohit=1&etassa=1&choose=1&&language=dv&field_chapter_value=2&field_nsutra_value=38">JavaDocs</a>
 */

public class javaDoc {
    static void add( int a , int b )
    {
        System.out.println(" the sum is : "+(a+b));
    }

    public static void main(String[] args) {
        System.out.println(" this is my main methosd !");
        add(10,30);
    }
}

