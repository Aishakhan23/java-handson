package seldemo;
import java.util.*;
public class Map {

	public static void main(String[] args) {
		// creating an object for my list
		List list1=new ArrayList<>();
		list1.add( 1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1.get(2));
		/* remove from the list*/
		System.out.println(list1.remove(1));
		// linked list//
		List num=new LinkedList<>();
		num.add( 1);
		num.add( 2);
		num.add( 3);
		System.out.println(num);
		System.out.println(num.get(1));
		// Array list//
			ArrayList<String> list2=new ArrayList<>();
			list2.add("java");
			list2.add("Computer");
			list2.add("python");
			list2.add("HTML");
			System.out.println(list2);
			Vector <String> num1= new Vector<>();
			num1.add("ui");
			num1.add("li");
			num1.add("mn");
			num1.add("jkl");
			System.out.println(num1);
			// Iterator//
			Iterator<String> it=num1.iterator();
			System.out.println("Elements");
			while(it.hasNext()) {
				System.out.println(it.next());
				// set//
				HashSet<String> set =new HashSet<String>();
				set.add("Aisha");
				set.add("Doracake");
				set.add( "Disney");
				set.add( "Jacks Sparrow");
				// Hash Map//
				java.util.Map<String,Integer> map= new HashMap<>();
				map.put("Aisha",20);
				map.put("Imza",30);
				map.put("AishaImz", 23);
				System.out.println(map.get( "Aisha"));
				System.out.println(map.keySet());
				System.out.println(map.entrySet());
				System.out.println(map.values());
				
				
			}

	}

}
