package problem015;

public class LatticePaths {
	public static void main(String[] args) {
		int mapSize = 20;
		long[][] map = new long[mapSize+1][mapSize+1];
		
		for(int i = 0; i <= mapSize; i++) {
			map[0][i] = 1;
			map[i][0] = 1;
		}
		
		for(int i = 1; i < map.length; i++) {
			for(int j = 1; j < map[i].length; j++) {
				map[i][j] = map[i-1][j] + map[i][j-1];
			}
		}

		/*for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}*/
		
		System.out.println(map[mapSize][mapSize]);
	}
}
