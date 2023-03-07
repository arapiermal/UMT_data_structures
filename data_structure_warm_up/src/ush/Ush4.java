package ush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ush4 {

	public static void main(String[] args) {
		Integer[] numbers= {1, 3, 2, 4, 3, 5, 4, 6};

		List<Integer> lista=Arrays.asList(numbers);
		List<Integer> sublista=longestIncreasingSubsequence(lista);

		System.out.println(sublista);
	}
	public static List<Integer> longestIncreasingSubsequence(List<Integer> list){
		List<Integer> subsequence=new ArrayList<Integer>();
		Integer temp;
		int[] count=new int[list.size()];
		for(int i=0;i<list.size();i++) {
			count[i]=0;
			temp=list.get(i);
			for(int j=i;j<list.size();j++) {
				if(list.get(j)>temp) {
					count[i]++;
					temp=list.get(j);
				}
			}
		}
		int max=0;
		for(int i=1;i<list.size();i++) {
			if(count[i]>count[max])
				max=i;
		}
		temp=list.get(max);
		subsequence.add(list.get(max));
		for(int j=max;j<list.size();j++) {
			if(list.get(j)>temp) {
				subsequence.add(list.get(j));
				temp=list.get(j);
			}
		}
		return subsequence;
	}
	
	/*//This didn't work for all cases
	public static List<Integer> longestIncreasingSubsequence(List<Integer> list){
		List<Integer> subsequence=new ArrayList<Integer>();
		Integer currentBiggest=list.get(0);
		subsequence.add(currentBiggest);
		for(Integer a : list) {
			if(a>currentBiggest) {
				subsequence.add(a);
				currentBiggest=a;
			}
		}
		return subsequence;
	}*/
}
