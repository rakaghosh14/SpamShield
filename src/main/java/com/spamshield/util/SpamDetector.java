package com.spamshield.util;

public class SpamDetector {

	static String spamWords[] = {

			"free",
			"winner",
			"prize",
			"money",
			"click here",
			"urgent",
			"limited offer",
			"congratulations"

	};

	public static int calculateSpamScore(String subject, String body) {

		int score = 0;

		String text = (subject + " " + body).toLowerCase();

		for (String word : spamWords) {

			if (text.contains(word)) {

				score += 15;

			}

		}

		return score;

	}

	public static String getResult(int score) {

		if (score >= 50)

			return "SPAM";

		return "NOT SPAM";

	}

}