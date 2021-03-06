package io.altar.examples;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class listExample {
	
	/*E − Element, and is mainly used by Java Collections framework.

	K − Key, and is mainly used to represent parameter type of key of a map.

	V − Value, and is mainly used to represent parameter type of value of a map.

	N − Number, and is mainly used to represent numbers.

	T − Type, and is mainly used to represent first generic type parameter.

	S − Type, and is mainly used to represent second generic type parameter.

	U − Type, and is mainly used to represent third generic type parameter.

	V − Type, and is mainly used to represent fourth generic type parameter.*/

	public static void main(String[] args) {
		List<String> listStrings = new ArrayList<>();
		listStrings.add("ze carlos");
		listStrings.add("ze manel");
		
		Iterator<String> it = listStrings.iterator();
		
		while(it.hasNext()){
			String element = it.next();
			System.out.println(element);
		}
		

		//System.out.println(listStrings);

	}

}
