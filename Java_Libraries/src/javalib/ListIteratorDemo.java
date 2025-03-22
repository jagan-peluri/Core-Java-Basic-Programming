package javalib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>(Arrays.asList("ram","raman","ramesh"));
		ListIterator<String> li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}
}
