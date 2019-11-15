package GameOfLife;

import java.awt.Point;
import java.util.List;

public class RulesOfLife {

	public static void computeSurvivors(boolean[][] board, List<Point> points, int surrounding, int i, int j) {
		if(board[i][j]&&surrounding == 0) {
		points.add(new Point(i + -1, j + 1));
		points.add(new Point(i + 0, j + -1));
		points.add(new Point(i + 0, j + 1));
		points.add(new Point(i + 1, j + 0));
		points.add(new Point(i + 1, j + 1));
		}
		
		if(board[i][j]&&surrounding == 2||board[i][j]&&surrounding == 3) {
		points.add(new Point(i + -1, j + -1));
		}
		
		if(!board[i][j]&&surrounding == 3) {
		points.add(new Point(i + -1, j + -1));
		}
	}

	public static void determineBeginPoints(List<Point> points) {
		points.add(new Point(1, 1));
		
	}

}
