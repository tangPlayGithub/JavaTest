package com.my.java.thinking4.innerclasses;

public class TestParcel {
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("Tasmania");
		// Illegal -- can't access private class:
		// ! Parcel4.PContents pc = p.new PContents();
	}
}

class Parcel4 {
	//私有内部类，除了Parcel4，没人能访问它
	private class PContents implements Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	protected class PDestination implements Destination {
		private String label;

		private PDestination(String whereTo) {
			label = whereTo;
		}

		public String readLabel() {
			return label;
		}
	}

	public Destination destination(String s) {
		return new PDestination(s);
	}

	public Contents contents() {
		return new PContents();
	}
}