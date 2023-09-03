package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boj2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int length = Integer.parseInt(br.readLine());
		List<Integer> numbers = new ArrayList<>();

		for(int i = 0; i < length; i++) {
			numbers.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(numbers);

		for(int n : numbers) {
			sb.append(n).append('\n');
		}

		System.out.print(sb);
	}
}
