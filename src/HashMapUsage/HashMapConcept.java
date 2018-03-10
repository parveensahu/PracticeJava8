package HashMapUsage;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {
	
	public static void main(String args[]) {
		//HashMap is a class implements Map Interface
		//HasMap extends AbstractMap Class
		//Stores in key, values pair
		//It has unique keys but can have duplicate values
		//It can have one null key and multiple null values
		//It maintain no order
		//HashMap is non-synchronized -- not thread safe (It is fast)
		//Concurrent modification exception -- Fail Fast Condition -- This is the biggest problem
		
		Map<Integer, String > map = new HashMap<Integer, String>();
		map.put(1, "Selenium");
		map.put(2,"QTP");
		map.put(null, "");
		
		System.out.println(map.get(1));
		
		//That's how iterate the HashMap
		for(Entry m:map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		} 
		
		map.remove(3);
		System.out.println(map);
	
	HashMap<Integer, Employee> map1 = new HashMap<Integer, Employee>();
	
	Employee e1 = new Employee(21, "Shankar", "Music");
	Employee e2 = new Employee(22, "Eshan", "Compose");
	Employee e3 = new Employee(23, "Roy", "Voice");
	
		map1.put(1, e1);
		map1.put(2, e2);
		map1.put(3, e3);
		
		//Traversing the HashMap
		for(Entry<Integer, Employee> m: map1.entrySet()  ) {
		int key = m.getKey();
		Employee e = m.getValue();
		System.out.println(key + " Info");
		
		System.out.println(e.id + " " + e.name + " " + e.dept);
	}
}
}
