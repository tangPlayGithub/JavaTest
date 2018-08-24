package com.my.java.thinking4.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();

	private static String[] typeNames = { "com.my.java.thinking4.typeinfo.pets.Mutt",
			"com.my.java.thinking4.typeinfo.pets.Pug", "com.my.java.thinking4.typeinfo.pets.EgyptianMau",
			"com.my.java.thinking4.typeinfo.pets.Manx", "com.my.java.thinking4.typeinfo.pets.Cymric",
			"com.my.java.thinking4.typeinfo.pets.Rat", "com.my.java.thinking4.typeinfo.pets.Mouse",
			"com.my.java.thinking4.typeinfo.pets.Hamster" };

	@SuppressWarnings({ "unchecked" })
	private static void loader() {
		try {
			for (String name : typeNames) {
				types.add((Class<? extends Pet>) Class.forName(name));
			}
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	static {
		loader();
	}

	public List<Class<? extends Pet>> types() {
		return types;
	}
}
