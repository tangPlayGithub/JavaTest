package com.my.java.thinking4.typeinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.my.java.thinking4.typeinfo.factory.Factory;

class Part {
	public String toString() {
		return getClass().getSimpleName();
	}

	static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();
	static {
		// Collections.addAll() gives an "unchecked generic
		// array creation ... for varargs parameter" warning.
		partFactories.add(new FuelFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		/*
		 * partFactories.add(new CabinAirFilter.Factory()); partFactories.add(new
		 * OilFilter.Factory()); partFactories.add(new FanBelt.Factory());
		 * partFactories.add(new PowerSteeringBelt.Factory()); partFactories.add(new
		 * GeneratorBelt.Factory());
		 */
	}
	private static Random rand = new Random(47);

	public static Part createRandom() {
		int n = rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
}

class Filter extends Part {
}

class FuelFilter extends Filter {
	// Create a Class Factory for each specific type:
	public static class Factory implements com.my.java.thinking4.typeinfo.factory.Factory<FuelFilter> {
		@Override
		public FuelFilter create() {
			// TODO Auto-generated method stub
			return new FuelFilter();
		}
	}
}

class AirFilter extends Filter {
	public static class Factory implements com.my.java.thinking4.typeinfo.factory.Factory<AirFilter> {
		public AirFilter create() {
			return new AirFilter();
		}
	}
}

public class RegisteredFactories {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Part.createRandom());
		}
	}
}
