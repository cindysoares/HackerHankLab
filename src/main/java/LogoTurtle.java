
public class LogoTurtle {
	
	static final int NORTH = 0;
	static final int EAST= 1;
	static final int SOUTH = 2;
	static final int WEST = 3;
	
	public int solution(int[] A) {
		int N = A.length;
		int numberOfLines = N/2+1;
		int[][] verticalLines = new int[numberOfLines][3];
		int[][] horizontalLines = new int[numberOfLines][3];
		int[] position = {0,0};
		int direction = 0, v=0, h=0;
		int prePosition = 0;
		for (int i=0; i < N; i++) {
			int movements = A[i];
			switch (direction) {
			case NORTH:
				prePosition = position[1];
				position[1]+=movements;
				verticalLines[v] = new int[] {prePosition, position[1], position[0]};
				for (int j = 0; j < verticalLines.length; j++) {
					if( horizontalLines[j][0] < position[0] && position[0] < horizontalLines[j][1]) {
						return i+1;
					}
				}				
				v++;
				direction = EAST;
				break;
			case EAST:
				prePosition = position[0];
				position[0]+=movements;
				horizontalLines[h] = new int[] {prePosition, position[0], position[1]};
				for (int j = 0; j < verticalLines.length; j++) {
					if( verticalLines[j][0] < position[1] && position[1] < verticalLines[j][1]) {
						return i+1;
					}
				}
				h++;
				direction = SOUTH;
				break;
			case SOUTH:
				prePosition = position[1];
				position[1]-=movements;
				verticalLines[v] = new int[] {position[1], prePosition, position[0]};
				for (int j = 0; j < verticalLines.length; j++) {
					if( horizontalLines[j][0] < position[0] && position[0] < horizontalLines[j][1]) {
						return i+1;
					}
				}
				v++;
				direction = WEST;
				break;
			case WEST:
				prePosition = position[0];
				position[0]-=movements;
				horizontalLines[h] = new int[] {position[0], prePosition, position[1]};
				for (int j = 0; j < verticalLines.length; j++) {
					if( verticalLines[j][0] < position[1] && position[1] < verticalLines[j][1]) {
						return i+1;
					}
				}				
				h++;
				direction = NORTH;
				break;
			default:
				break;
			}
		}
		
		return 0;
	}

}
