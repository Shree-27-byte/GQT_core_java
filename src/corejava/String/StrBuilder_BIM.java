package corejava.String;
import java.util.Scanner;
public class StrBuilder_BIM {

	public static void main(String[] args) {
				Scanner scanner=new Scanner(System.in);
				  StringBuilder sb1 = new StringBuilder("krishna ");
		        sb1.append("Radha");
		        System.out.println( sb1);

		        // .insert()
		        StringBuilder sb2 = new StringBuilder("Krishna");
		        sb2.insert(4, " Arjuna");
		        System.out.println(sb2);

		        // .replace()
		        StringBuilder sb3 = new StringBuilder("Krishna Radha ");
		        sb3.replace(5, 9, "Rukmini");
		        System.out.println( sb3);

		        // . delete()
		        StringBuilder sb4 = new StringBuilder("Krishna radha");
		        sb4.delete(4, 7);
		        System.out.println( sb4);

		        // .reverse()
		        StringBuilder sb5 = new StringBuilder("Krishna");
		        sb5.reverse();
		        System.out.println(sb5);

		        // .capacity()
		        StringBuilder sb6 = new StringBuilder("Krishna");
		        int s6= sb6.capacity();
		        System.out.println(s6);

		        // .ensureCapacity()
		        StringBuilder sb7 = new StringBuilder();
		        sb7.ensureCapacity(30);
		        System.out.println(sb7.capacity());

		        // .charAt()
		        StringBuilder sb8 = new StringBuilder("Krishna");
		        char s1=sb8.charAt(1);
		        System.out.println(s1);

		        // .setCharAt()
		        StringBuilder sb9 = new StringBuilder("Krrishna");
		        sb9.setCharAt(1, 'a');
		        System.out.println(sb9);

		        // .length()
		        StringBuilder sb10 = new StringBuilder("Ramayana");
		        int s=sb10.length();
		        System.out.println(s );

		        // .setLength()
		        StringBuilder sb11 = new StringBuilder("Ramayanaaa");
		        sb11.setLength(7);
		        System.out.println(sb11);

		        //.substring()
		        StringBuilder sb12 = new StringBuilder("ramaKrishna");
		        String sub = sb12.substring(5);
		        System.out.println( sub);

			}

		}
