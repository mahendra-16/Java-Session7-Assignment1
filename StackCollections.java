package Session7;

import java.util.*;

public class StackCollections {

	public static void main(String[] args) {

		Stack<String> city = new Stack<String>();
		city.push("Paris");
		city.push("Perth");
		city.push("New York");
		city.push("Mumbai");
		city.push("Tokyo");

		System.out.println(city);
		// System.out.println("Pop -> " + city.pop());

		try {

			while (city.peek() != null) {
				System.out.println("Pop -> " + city.pop());
				System.out.println("Stack -> " + city);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block

			System.out.println("Empty Stack.");
		}

		System.out.println("Null Stack == " + city.isEmpty());

	}

}
