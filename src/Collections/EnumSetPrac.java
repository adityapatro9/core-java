package Collections;

import java.util.EnumSet;
import java.util.Set;

enum type{
	GRASS,
	FIRE,
	WATER,
	ELECTRIC,
	ROCK,
	GROUND,
	FLYING,
	GHOST
}

public class EnumSetPrac {

	public static void main(String[] args) {
		Set<type> s=EnumSet.allOf(type.class);
		Set<type> t=EnumSet.noneOf(type.class);
		Set<type> r=EnumSet.of(type.ELECTRIC,type.FIRE,type.FLYING);
		
		System.out.println(s);
		System.out.println(t);
		System.out.println(r);
	}

}
