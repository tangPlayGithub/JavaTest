package com.my.java.thinking4.typeinfo;

import static net.mindview.util.Print.print;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
	private static String usage = "usage:\n" + "ShowMethods qualified.class.name\n"
			+ "To show all methods in class or:\n" + "ShowMethods qualified.class.name word\n"
			+ "To search for methods involving 'word'";
	private static Pattern p = Pattern.compile("\\w+\\.");

	public static void main(String[] args) {
		if (args.length < 1) {
			print(usage);
			System.exit(0);
		}
		int lines = 0;
		try {
			Class<?> c = Class.forName(args[0]);
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
			if(args.length == 1) {
				for(Method method : methods) {
					print(p.matcher(method.toString()).replaceAll(""));
				}
				for(Constructor ctor : ctors) {
					print(p.matcher(ctor.toString()).replaceAll(""));
				}
				lines = methods.length + ctors.length;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
