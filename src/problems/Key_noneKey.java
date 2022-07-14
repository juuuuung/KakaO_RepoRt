package problems;

//암호화 복호화 프로그램 완전 기본.... 효율을 생각하지 않음
public class Key_noneKey {

	public static void main(String[] args) {
		String k = "b1";
		String M = "HELLO WORLD";
		int[] array_string = new int[M.length()];
		char[] just_string = new char[array_string.length];
		int int_k = k_int(k);

		array_string = encryption(M, int_k);
		for (int i = 0; i < array_string.length; i++) {
			System.out.println((char) array_string[i]);
		}

		just_string = decryption(array_string, int_k);
		for(int i = 0; i < just_string.length; i++) {
			System.out.printf("%c", just_string[i]);
		}
	}

// 		복호화 받아온 값에 다시 키값을 빼줌

	public static char[] decryption(int[] array_string, int int_k) {
		char[] just_string = new char[array_string.length];
		for (int i = 0; i < array_string.length; i++) {
			array_string[i] -= int_k;
		}
//		빼준 숫자 배열에 문자로 바꿔서 넣어준다
		for (int i = 0; i < array_string.length; i++) {
			just_string[i] = (char) array_string[i];
		}
		return just_string;
	}

//		암호화
	public static int[] encryption(String M, int int_k) {
		int[] alpha_k = new int[M.length()];
		for (int i = 0; i < M.length(); i++) {
//			 평문을 숫자 아스키 코드로 바꿈
			alpha_k[i] = (int) M.charAt(i);
		}

//		숫자로 바꾼 값에 키값을 더해줌
		for (int i = 0; i < alpha_k.length; i++) {
			alpha_k[i] += int_k;
		}

		return alpha_k;
	}

//		암호키 k의 뒷 숫자를 자르고 더하기
	public static int k_int(String a) {
		String k = a.substring(a.length() - 1, a.length());
//		문자값을 숫자로 변경해줌
		int int_k = Integer.parseInt(k);
		return int_k;
	}

}
