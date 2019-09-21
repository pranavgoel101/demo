package collection;

import java.util.*;


public class TestAccount4 {
	
	public static void main(String[] args) {
		Map<String,Integer> tm=new TreeMap<String,Integer>();
		tm.put("bmw", 1000);
		tm.put("maruti", 500);
		tm.put("toyota", 750);
		
		System.out.println("treemap="+tm);
		
		tm.remove("toyota");
		System.out.println(tm.get("maruti"));
		System.out.println(tm.containsKey("bmw"));
		System.out.println(tm.containsValue(500));
		System.out.println("treemap="+tm);
		
		Set<String> set=tm.keySet();
		for(String s: set)
			System.out.println("key "+s+" value="+tm.get(s));
		
		Map<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("bmw", 1000);
		hm.put("maruti", 500);
		hm.put("toyota", 750);
		System.out.println("hashmap"+hm);
	}
		
	
}
