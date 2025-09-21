package Collection;
import java.util.ArrayList;
public class Arraylist_code {
		public static void main(String[] args) {
			ArrayList al=new ArrayList();
			// inserting data
			al.add(100);
			al.add(20);
			al.add(50);
			al.add(59);  System.out.println(al);
			al.add("shree");
			al.add(20.99f);
			al.add('d');
			al.add(true);  System.out.println(al);
			al.add(2,3333);   System.out.println(al);
		}
}
