package com.simonbaars.generator

import com.simonbaars.goLDSL.DSL

class JavaGenerator {
def static toJava(DSL dsl)'''
package GameOfLife;

import java.awt.Point;
import java.util.ArrayList;

public class RulesOfLife {

	public static void computeSurvivors(boolean[][] gameBoard, List<Point> survivingCells, int surrounding) {
		// TODO Auto-generated method stub
		
	}

	public static void determineBeginPoints(List<Point> point) {
		// TODO Auto-generated method stub
		
	}

}
'''
}