package pantryvisualizer;

import java.util.ArrayList;
import java.awt.Point;
import java.util.Arrays;

import pantryvisualizer.math.Translation2d;

/**
 * A path generation tool for Pure Persuit. Given some coordinates, this program 
 * will interpolate and smooth the path, and display the generated path as well as the robot's bumpers
 * on the field. 
 */
public class Visualizer{
  public static void main(String[] args) {
    System.out.println("Hello there!");
  }
  ArrayList<Integer> topLeft = new ArrayList<Integer>(Arrays.asList(217,40));
  ArrayList<Integer> bottomRight = new ArrayList<Integer>(Arrays.asList(1372, 615));
  ArrayList<Integer> fieldSize = new ArrayList<Integer>(Arrays.asList(54, 27));
  ArrayList<Integer> fieldSizeInPixels = new ArrayList<Integer>(Arrays.asList((bottomRight.get(0)-topLeft.get(0)), (bottomRight.get(1)-topLeft.get(1))));
  ArrayList<Integer> imageSize = new ArrayList<Integer>(Arrays.asList(1592, 676));

  ArrayList<Translation2d> waypoints = new ArrayList<Translation2d>(Array.;
  Point spacing;

  // public double[][] getSmoothPath(){}
  
  /**
   * Convert a x,y double in field coordinates into pixels on the field image
   * @param 
   */
  public Point convertToPixels(Point feet) {
    Point imageCoordinates = new Point(feet.getX() / fieldSize.get(0) * fieldSizeInPixels.get(0) + topLeft.get(0), feet.getY() / fieldSize.get(1) * fieldSizeInPixels.get(1) + topLeft.get(1));
    return new Point(x,y);
  }

  public ArrayList<Point> injectPoints(ArrayList<Point> waypoints, int numPoints) {
    ArrayList<Point> linePoints = new ArrayList<Point>();
    for (int point : waypoints){
      tx = (waypoints.get(point).getX() - waypoints.get(point-1).getX());
      ty = (waypoints.get(point).getY() - waypoints.get(point-1).getY());

      linePoints.add(waypoints.get(point));
      numPoints--;
      spacing = new Point(Math.abs(tx/numPoints),Math.abs(ty/numPoints));

      for (int lp; lp<=numPoints-1; lp++){
        linePoints.add(new Point((linePoints.get(0).getX() + spacing.getX()*(lp+1)),(linePoints.get(0).getY()+spacing.getY()*(lp+1))));
      }
      if(waypoints.get(point)==waypoints.get(waypoints.length()-1)){
        linePoints.add(waypoints.get(point));
      }
    }
  return linepoints;
  }


    public double[][] smoother(double[][] path, double weightData, double weightSmooth, double tolerance)
    {
  
      //copy array
      ArrayList<Point> newPath = doubleArrayCopy(path);
  
      double change = tolerance;
      while(change >= tolerance)
      {
        change = 0.0;
        for(int i=1; i<path.length-1; i++)
          for(int j=0; j<path[i].length; j++)
          {
            double aux = newPath[i][j];
            newPath[i][j] += weightData * (path[i][j] - newPath[i][j]) + weightSmooth * (newPath[i-1][j] + newPath[i+1][j] - (2.0 * newPath[i][j]));
            change += Math.abs(aux - newPath[i][j]);	
          }					
      }
  
      return newPath;
  }

  // public Point distanceBetweenPoints ()
  // Distances Between Points
  // distance at point i = distance at point (i − 1) + distance_f ormula(point i, point (i − 1))

}