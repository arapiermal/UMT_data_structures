package ush;
import java.util.*;
public class Ush3 {

	public static void main(String[] args) {
		Integer[] numbers= {8,4,5,3,2,6,9,7};
		List<Integer> a=Arrays.asList(numbers);
		System.out.println(a);
		Scanner scan=new Scanner(System.in);
		System.out.print("Give k: ");
		int k=scan.nextInt();
		System.out.println(k+"th smallest is "+findKthSmallest(a,k));
	}
	public static int findKthSmallest(List<Integer> list,int k) {
		if(k>list.size()||k<=0) //checking
			return 0; 
		Collections.sort(list);
		System.out.println("Sorted list from smallest\n"+list);
		return list.get(k-1);
	}
}
