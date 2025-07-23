package main3;

public class Main_2 {
	public static void main(String[] args) {
		
		ItemService<String> fruits = new ItemService<String>();
		fruits.add("Alma");
		fruits.add("Armud");
		fruits.add("Nar");
		
		System.out.println(fruits.getAll());
		
		
		
		ItemService<Integer> numbers = new ItemService<Integer>();
		
		Integer[] arr = {10, 20, 30, 40, 50};
		
		for (Integer number : arr) {
			numbers.add(number);
		}
		
		System.out.println(numbers.getAll());
	}
}
