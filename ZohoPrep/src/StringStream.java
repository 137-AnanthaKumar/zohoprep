package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		executeSteam1();
		executeSteam2();
		executeSteam3();
		executeSteam4();
		executeSteam5();
		executeSteam6();
		executeSteam7();
		executeSteam8();
		executeSteam9();
		executeSteam10();


	

		
		
		String add="mumbai";
		Map<Character,Long> out=add.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(s->s ,Collectors.counting()));
		System.out.println(out);
		
		

		
		
	    

	}

	private static void executeSteam10() {
		//Calculate freequency of number
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
		Map<Integer, Long> out=numbers.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println(out);
		
	}

	private static void executeSteam9() {
		List<String> ss=Arrays.asList("AKILA","CAN","NOT","FORGET");
		
		String out=ss.stream().max(Comparator.comparingInt(String::length)).orElse("no");
		System.out.println(out);
		
	}

	private static void executeSteam8() {
		//find distict and sort
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
		List<Integer> sorted=numbers.stream().distinct().sorted().collect(Collectors.toList());
System.out.println(sorted);
		
	}

	private static void executeSteam7() {
		// Find first non repeating charector
	 String input="swiss";
	 Character cc=input.chars()
             .mapToObj(c -> (char) c)
             .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
             .entrySet()
             .stream()
             .filter(entry -> entry.getValue() == 1)
             .map(Map.Entry::getKey)
             .findFirst()
             .orElse(null);
	 System.out.println(cc);
	
		
	}

	private static void executeSteam6() {
		//  All number is possitive?
		int [] a= {1,2,3,-4};
		boolean out=Arrays.stream(a).allMatch(b->b>0);
		System.out.println(out);
		
	}

	private static void executeSteam5() {
		// colculat squer
		
		int [] a= {1,2,3,4};
		int out=Arrays.stream(a).map(s->s*s).sum();
		System.out.println(out);

		
	}

	private static void executeSteam4() {
		//Group element by length
		List<String> ss=Arrays.asList("AKILA","CAN","NOT","FORGET");
		
		Map<Integer,List<String>> out=ss.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(out);
		
	}

	private static void executeSteam3() {
		// concate string 
		List<String> ss=Arrays.asList("AKILA","CAN","NOT","FORGET");
		String output=ss.stream().collect(Collectors.joining(" "));
		System.out.println(output);
		
	}

	private static void executeSteam2() {
		// filter and collect even numbers
		int [] a= {1,2,3,4,5,6,7,8,9,10};
		
		List<Integer> evenNumbers=Arrays.stream(a).filter(s->s%2==0)
				.boxed().collect(Collectors.toList());
System.out.println(evenNumbers);		
	}

	private static void executeSteam1() {
		int [] a= {1,2,3,4,5,6,7,8,9,10};
		int b=Arrays.stream(a).filter(s->s%2==0).sum();
		System.out.println(b);
		
	}

}
