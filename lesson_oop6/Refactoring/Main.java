package lesson_oop6.Refactoring;

import lesson_oop6.User;

/**
 * Main
 */
public class Main {

    public static void main(String[] args){
		Note user = new Note("Bob");
		user.report();
		user.save();
	}
}