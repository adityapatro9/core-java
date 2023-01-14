package Collections;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapPrac {

	public static void main(String[] args) {
		EnumMap<type,Integer> e=new EnumMap<type, Integer>(type.class);
		
		e.put(type.ELECTRIC, 1);
		e.put(type.FIRE, 2);
		e.put(type.GRASS, 3);
		
		for(Map.Entry<type, Integer> it:e.entrySet()) {
			System.out.println(it.getKey()+" "+it.getValue());
		}

	}

}
