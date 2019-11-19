package GameOfLife;

import java.awt.Point;
import java.util.List;

public class RulesOfLife {

	public static void computeSurvivors(boolean[][] board, List<Point> points, int surrounding, int i, int j) {
		if(board[i][j]&&surrounding == 2||board[i][j]&&surrounding == 3) {
		points.add(new Point(i + -1, j + -1));
		}
		
		if(!board[i][j]&&surrounding == 3) {
		points.add(new Point(i + -1, j + -1));
		}
	}

	public static void determineBeginPoints(List<Point> points) {
		points.add(new Point(0, 4));
		points.add(new Point(0, 5));
		points.add(new Point(1, 4));
		points.add(new Point(1, 5));
		points.add(new Point(10, 4));
		points.add(new Point(10, 5));
		points.add(new Point(10, 6));
		points.add(new Point(11, 3));
		points.add(new Point(11, 7));
		points.add(new Point(12, 2));
		points.add(new Point(12, 8));
		points.add(new Point(13, 2));
		points.add(new Point(13, 8));
		points.add(new Point(14, 5));
		points.add(new Point(15, 3));
		points.add(new Point(15, 7));
		points.add(new Point(16, 4));
		points.add(new Point(16, 5));
		points.add(new Point(16, 6));
		points.add(new Point(17, 5));
		points.add(new Point(20, 2));
		points.add(new Point(20, 3));
		points.add(new Point(20, 4));
		points.add(new Point(21, 2));
		points.add(new Point(21, 3));
		points.add(new Point(21, 4));
		points.add(new Point(22, 1));
		points.add(new Point(22, 5));
		points.add(new Point(24, 0));
		points.add(new Point(24, 1));
		points.add(new Point(24, 5));
		points.add(new Point(24, 6));
		points.add(new Point(34, 2));
		points.add(new Point(34, 3));
		points.add(new Point(35, 2));
		points.add(new Point(35, 3));
		
	}

}
