package javalib;

import java.util.HashMap;
import java.util.Map;

public class MapIterationDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "ramu");
		hm.put(2, "ramesh");
		hm.put(3, "ram");
		for(Map.Entry<Integer, String> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
			
	}
}
