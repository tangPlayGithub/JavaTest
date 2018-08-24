package com.my.java.thinking4.typeinfo;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

import java.util.HashMap;

import com.my.java.thinking4.typeinfo.pets.Dog;
import com.my.java.thinking4.typeinfo.pets.ForNameCreator;
import com.my.java.thinking4.typeinfo.pets.Mutt;
import com.my.java.thinking4.typeinfo.pets.Pet;
import com.my.java.thinking4.typeinfo.pets.PetCreator;
import com.my.java.thinking4.typeinfo.pets.Pug;

public class PetCount {
	@SuppressWarnings("serial")
	static class PetCounter extends HashMap<String, Integer> {
		public void count(String type) {
			Integer quantity = get(type);
			if (quantity == null) {
				put(type, 1);
			} else {
				put(type, quantity + 1);
			}
		}
	}

	public static void countPets(PetCreator creator) {
		PetCounter counter = new PetCounter();
		for (Pet pet : creator.createArray(20)) {
			// List each individual pet:
			printnb(pet.getClass().getSimpleName() + " ");
			if (pet instanceof Pet)
				counter.count("Pet");
			if (pet instanceof Dog)
				counter.count("Dog");
			if (pet instanceof Mutt)
				counter.count("Mutt");
			if (pet instanceof Pug)
				counter.count("Pug");
		}
		// Show the counts:
		print();
		print(counter);
	}

	public static void main(String[] args) {
		countPets(new ForNameCreator());
	}
}
