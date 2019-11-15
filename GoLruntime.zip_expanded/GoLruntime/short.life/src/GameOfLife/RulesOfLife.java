package GameOfLife;

import java.awt.Point;
import java.util.List;

public class RulesOfLife {

	public static void computeSurvivors(boolean[][] gameBoard, List<Point> survivingCells, int surrounding) {
	}

	public static void determineBeginPoints(List<Point> points) {
		points.add(new Point(36, 30));points.add(new Point(35, 27));
		points.add(new Point(36, 25));
		points.add(new Point(36, 27));
		points.add(new Point(37, 26));
		points.add(new Point(37, 27));
		points.add(new Point(41, 30));points.add(new Point(40, 27));
		points.add(new Point(41, 25));
		points.add(new Point(41, 27));
		points.add(new Point(42, 26));
		points.add(new Point(42, 27));
		points.add(new Point(36, 35));points.add(new Point(35, 32));
		points.add(new Point(36, 30));
		points.add(new Point(36, 32));
		points.add(new Point(37, 31));
		points.add(new Point(37, 32));
		points.add(new Point(41, 35));points.add(new Point(40, 32));
		points.add(new Point(41, 30));
		points.add(new Point(41, 32));
		points.add(new Point(42, 31));
		points.add(new Point(42, 32));
		points.add(new Point(17, 21));
		points.add(new Point(18, 17));
		points.add(new Point(18, 18));
		points.add(new Point(18, 22));
		points.add(new Point(19, 22));
		points.add(new Point(20, 22));
		points.add(new Point(21, 22));
		points.add(new Point(22, 17));
		points.add(new Point(22, 18));
		points.add(new Point(22, 22));
		points.add(new Point(23, 21));points.add(new Point(1, 4));
		points.add(new Point(5, 6));points.add(new Point(1, 5));points.add(new Point(0, 0));
		points.add(new Point(0, 6));
		points.add(new Point(1, 0));
		points.add(new Point(1, 1));
		points.add(new Point(1, 5));
		points.add(new Point(1, 6));
		points.add(new Point(2, 0));
		points.add(new Point(2, 1));
		points.add(new Point(2, 2));
		points.add(new Point(2, 4));
		points.add(new Point(2, 5));
		points.add(new Point(2, 6));
		points.add(new Point(3, 1));
		points.add(new Point(3, 2));
		points.add(new Point(3, 3));
		points.add(new Point(3, 4));
		points.add(new Point(3, 5));
		points.add(new Point(4, 2));
		points.add(new Point(4, 3));
		points.add(new Point(4, 4));
		points.add(new Point(5, 3));
	}

}
