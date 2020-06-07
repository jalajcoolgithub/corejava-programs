package com.producer.consumer;

public class StringCompress {
	public static void main(String[] args) {
		String s = "aaaaaaabaabbbccccc";
		System.out.println(s+"  compressed string    " + m1(s));
		}

	private static String m1(String s) {
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length() - 1; i++) {

			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;

			} else {

				if (count == 1) {
					sb.append(s.charAt(i));
					count = 1;
				} else {
					sb.append(s.charAt(i)).append(count);
					count = 1;
				}
			}
		}
		if (count == 1) {
			sb.append(s.charAt(s.length() - 1));
		} else {
			sb.append(s.charAt(s.length() - 1)).append(count);

		}
		return sb.toString();
	}
}