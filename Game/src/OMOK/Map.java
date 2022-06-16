package OMOK;

public class Map {
	private short[][] map;// 맵의 배열 1일때 흑,-1일때 백,0일때 돌이 안놓여짐
	private final short BLACK = 1;
	private final short WHITE = 1;
	private boolean checkBNW = true;// 흑백 차례 확인.

	public Map(MapSize ms) {
		map = new short[ms.getSize()][];
		for (int i = 0; i < map.length; i++) {
			map[i] = new short[ms.getSize()];
		}
	}

	public short getBlack() {
		return BLACK;
	}

	public short getWhite() {
		return WHITE;
	}

	public short getXY(int y, int x) {
		return map[y][x];
	}

	public boolean getCheck() {
		return checkBNW;
	}

	public void changeCheck() {
		if (checkBNW) {
			checkBNW = false;
		} else {
			checkBNW = true;
		}
	}

	public void setMap(int y, int x) {
		// checkBNW를 확인해 true일때 map에 BLACK,false일때 WHITE저장
		if (checkBNW) {
			map[y][x] = BLACK;
		} else {
			map[y][x] = WHITE;
		}
	}

	// 승리확인
	public boolean winCheck(int x, int y) {
		if (winCheckL(x, y) || winCheckLD(x, y) || winCheckLU(x, y) || winCheckR(x, y) || winCheckRD(x, y)
				|| winCheckRU(x, y) || winCheckUp(x, y) || winCheckDown(x, y) || winCheckOneDown(x, y)
				|| winCheckOneL(x, y) || winCheckOneLD(x, y) || winCheckIneLU(x, y) || winCheckOneR(x, y)
				|| winCheckOneRD(x, y) || winCheckOneUp(x, y) || winCheckOneRU(x, y) || winCheckCenterLU(x, y)
				|| winCheckCenterRL(x, y) || winCheckCenterRU(x, y) || winCheckCenterUD(x, y)) {
			return true;
		} else {

			return false;
		}
	}

//위쪽
	public boolean winCheckUp(int x, int y) {
		try {
			for (int i = y; i < y + 5; i++) {
				if (map[y][x] != map[i][x])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) { 
			return false;
		}
		return true;
	}

	public boolean winCheckDown(int x, int y) {
		try {
			for (int i = y; i < y - 5; i++) {
				if (map[y][x] != map[i][x])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
		return true;
	}

	public boolean winCheckRU(int x, int y) {
		try {
			for (int i = y, z = x; i > y - 5; i--, z++) {
				if (map[y][x] != map[i][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
		return false;
	}

	public boolean winCheckLU(int x, int y) {
		try {
			for (int i = y, z = x; i > y - 5; i--, z--) {
				if (map[y][x] != map[i][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
		return true;
	}

	public boolean winCheckR(int x, int y) {
		try {
			for (int z = x; z < x + 5; z++) {
				if (map[y][x] != map[y][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
		return true;
	}

	public boolean winCheckL(int x, int y) {
		try {
			for (int i = y, z = x; z > x - 5; z--) {
				if (map[y][x] != map[i][z] || i > 19 || z > 19 || i < 0 || z < 0)
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
		return true;
	}

	public boolean winCheckRD(int x, int y) {
		try {
			for (int i = y, z = x; i < y + 5; i++, z++) {
				if (map[y][x] != map[i][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
		return true;
	}

	public boolean winCheckLD(int x, int y) {
		try {
			for (int i = y, z = x; i < y + 5; i++, z--) {
				if (map[y][x] != map[i][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
		return true;
	}
//한쪽 위쪽
	public boolean winCheckOneUp(int x,int y) {
		try {
			for(int i=y-1;i<y+4;i++) {
				if(map[y][x] != map[i][x])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
		return true;
	}
	//한칸 아래쪽
	public boolean winCheckOneDown(int x,int y) {
		try {
			for(int i=y+1;i>y-4;i--) {
				if(map[y][x] !=map[i][x]) {
					return false;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
		return false;
		}
		return true;
	}
	//한칸 오른쪽 위 대각선
	public boolean winCheckOneRU(int x, int y) {
		try {
			for (int i=y+1,z=x-1;i>y-4;i--,z++) {
				if(map[y][x] != map[i][z]) 
				return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
		return false;
		}
		return true;
	}
	//한칸 왼쪽 위 대각선
	public boolean winCheckOneLU(int x, int y) {
		try {
			for(int i=y+1,z=x+1;i>y;i--,z--) {
				if(map[y][x] !=map[i][z])
					return false;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
		return false;
		}
		return true;
	}
	public static void main(String[] args) {

	}

}
