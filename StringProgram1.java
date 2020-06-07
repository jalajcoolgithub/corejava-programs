package com.producer.consumer;

class StringProgram1 {
	public static void main(String[] args) {
		String st = "aaaaaaabaabbbccccc";
		char[] ch = st.toCharArray();
		char[] newCh = new char[st.length()];
		System.out.println("Actual String: " + new String(ch));
		int k = 0;
		char counter = 50;
		for (int i = 0; i < st.length(); i++) {
			if (checkTwoCharIsSame(ch[i], i, ch)) {
				if (checkTwoCharIsSame(ch[i], i - 1, ch)) {
					newCh[k - 1] = (char) (newCh[k - 1] + 1);
				} else {
					newCh[k++] = 50;
				}
			} else {
				newCh[k++] = ch[i];
			}
		}
		System.out.println("New String: " + new String(newCh));
	}

	private static boolean checkTwoCharIsSame(char ch, int i, char[] ch2) {

		if (i > 0 && ch == ch2[i - 1]) {
			return true;
		}
		return false;

	}
}
