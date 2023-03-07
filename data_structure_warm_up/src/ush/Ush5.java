package ush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ush5 {
	public static void main(String[] args) {
		Integer[] numbers= {3, 2, 3, 5, 4, 8, 9, 10};

		List<Integer> lista=Arrays.asList(numbers);
		List<Integer> sublista=longestConsecutiveSubsequence(lista);

		System.out.println(sublista);
	}
	public static List<Integer> longestConsecutiveSubsequence(List<Integer> list) {
	    List<Integer> subsequence = new ArrayList<>();
	    int max = 0;
	    int current = 1; //length of current longest consecutive subsequence
	    int endIndex = 0;
	    for(int i=0;i<list.size()-1;i++) {
	        if(list.get(i)==list.get(i+1)-1) {
	            current++;
	        } 
	        else{ // it is broken
	            if(current>max) {
	                max=current;
	                endIndex=i-1; //the end of the subsequence is the index before this iteration
	            }
	            current=1;
	        }
	    }
	    //if the else doesn't ever happen , it would mean the whole list is consecutive
	    if(current>max) {
	        max=current;
	        endIndex=list.size()-1;
	    }
	    for(int i=endIndex-max+1;i<=endIndex;i++) {
	        subsequence.add(list.get(i));
	    }
	    return subsequence;
	}
}
