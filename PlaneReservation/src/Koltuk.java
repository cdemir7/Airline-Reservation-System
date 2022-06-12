
public class Koltuk {
	static int koltuklar[][] = new int[10][2];

	public static void olustur() {
		for (int i = 0; i < koltuklar.length; i++) {
			for (int j = 0; j < koltuklar[i].length; j++) {
				if (j == 0) {
					koltuklar[i][j] = i;
				} else {
					koltuklar[i][j] = 0;
				}
			}
		}
	}

}
