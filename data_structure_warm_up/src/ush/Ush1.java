package ush;

import java.util.*;

public class Ush1 {

	public static void main(String[] args) {
		List<String> test=new LinkedList<String>();
		test.add("Eri");
		test.add("Mali");
		test.add("Eri");
		test.add("Djali");
		System.out.println(test+"\nUnike: ");
		List<String> trying=findUnique(test);
		System.out.println(trying);
		List<String> trying2=findUnique2(test);
		System.out.println("Me set "+trying2);
	}
	public static List<String> findUnique(List<String> myList){
		List<String> unique=new LinkedList<String>();
		for(String a : myList)
			if(!unique.contains(a))
				unique.add(a);
		return unique;
	}
	public static List<String> findUnique2(List<String> myList){
		Set<String> set=new LinkedHashSet<>();
		for(String elem : myList)
			set.add(elem);
		return new ArrayList<>(set);
		}
}
