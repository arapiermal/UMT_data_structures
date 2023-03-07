package ush;
import java.util.*;
public class Ush2 {

	public static void main(String[] args) {
		Integer[] l= {1,4,5,3,2,6,7};
		List<Integer> a=Arrays.asList(l);
		System.out.println(a);

		List<Integer> test=findEven(a);
		System.out.println(test);
	}
	public static List<Integer> findEven(List<Integer> list){
		List<Integer> even=new ArrayList<Integer>();
		for(Integer a:list) {
			if(a%2==0)
				even.add(a);
		}
		return even;
	}
}
