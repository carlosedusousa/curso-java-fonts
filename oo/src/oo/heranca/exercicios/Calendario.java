package oo.heranca.exercicios;

import java.util.Calendar;

public class Calendario {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.add(2, 1);
		
		System.out.println(c.after(c));
	}
}
