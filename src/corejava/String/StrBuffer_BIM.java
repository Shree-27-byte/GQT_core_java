package corejava.String;
import java.util.Scanner;
public class StrBuffer_BIM {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		  StringBuffer sb1 = new StringBuffer("Rama");
        sb1.append(" Seetha");
        System.out.println( sb1);

        // .insert()
        StringBuffer sb2 = new StringBuffer("Rama");
        sb2.insert(4, " Hanuman");
        System.out.println(sb2);

        // .replace()
        StringBuffer sb3 = new StringBuffer("Rama Seetha");
        sb3.replace(4, 11, "hanuman");
        System.out.println( sb3);

        // . delete()
        StringBuffer sb4 = new StringBuffer("Rama Seetha");
        sb4.delete(4, 7);
        System.out.println( sb4);

        // .reverse()
        StringBuffer sb5 = new StringBuffer("Rama");
        sb5.reverse();
        System.out.println(sb5);

        // .capacity()
        StringBuffer sb6 = new StringBuffer("Rama");
        int s6= sb6.capacity();
        System.out.println(s6);

        // .ensureCapacity()
        StringBuffer sb7 = new StringBuffer();
        sb7.ensureCapacity(30);
        System.out.println(sb7.capacity());

        // .charAt()
        StringBuffer sb8 = new StringBuffer("Rama");
        char s1=sb8.charAt(1);
        System.out.println(s1);

        // .setCharAt()
        StringBuffer sb9 = new StringBuffer("Rama");
        sb9.setCharAt(1, 'a');
        System.out.println(sb9);

        // .length()
        StringBuffer sb10 = new StringBuffer("Rama");
        int s=sb10.length();
        System.out.println(s );

        // .setLength()
        StringBuffer sb11 = new StringBuffer("Rama seetha");
        sb11.setLength(7);
        System.out.println(sb11);

        //.substring()
        StringBuffer sb12 = new StringBuffer("Rama Seetha");
        String sub = sb12.substring(5);
        System.out.println( sub);

	}

}
