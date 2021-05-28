package com.qualiprobdd.e2etests.util;

import java.security.SecureRandom;
import java.util.Random;

public class RandomValue {

	static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static SecureRandom rnd = new SecureRandom();

	public static String randomString(int len) {
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}
public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}


	public static int randomInt(int len) {
		Random rand = new Random();

		// nextInt as provided by Random is exclusive of the top value so you need to add 1 

		int randomNum = rand.nextInt(len);
		return randomNum;
	}

}
