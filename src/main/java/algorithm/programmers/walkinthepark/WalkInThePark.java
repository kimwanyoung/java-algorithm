package algorithm.programmers.walkinthepark;

public class WalkInThePark {
	public int[] solution(String[] park, String[] routes) {
		int sy = 0;
		int sx = 0;

		int parkRowSize = park.length;
		int parkColumnSize = park[0].length();

		char[][] splitedPark = new char[parkRowSize][parkColumnSize];

		for (int i = 0; i < parkRowSize; i++) {
			splitedPark[i] = park[i].toCharArray();

			if (park[i].contains("S")) {
				sy = i;
				sx = park[i].indexOf("S");
			}
		}

		for (String st : routes) {
			String way = st.split(" ")[0];
			int len = Integer.parseInt(st.split(" ")[1]);

			int nx = sx;
			int ny = sy;

			for (int i = 0; i < len; i++) {
				if (way.equals("E")) {
					nx++;
				}
				if (way.equals("W")) {
					nx--;
				}
				if (way.equals("S")) {
					ny++;
				}
				if (way.equals("N")) {
					ny--;
				}
				if (nx >= 0 && ny >= 0 && ny < parkRowSize && nx < parkColumnSize) {
					if (splitedPark[ny][nx] == 'X') {
						break;
					}

					if (i == len - 1) {
						sx = nx;
						sy = ny;
					}
				}
			}
		}

		return new int[] {sy, sx};
	}
}
