package edu.eci.arsw.blueprints.model;

 /**
 * ---------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------
 * 													CLASE: Point
 * ---------------------------------------------------------------------------------------------------------------------------
 * 
 * ---------------------------------------------------------------------------------------------------------------------------
 * @author Santiago Buitrago
 * @author Steven Garzon
 * @version 1.0
 * ---------------------------------------------------------------------------------------------------------------------------
 */
/**
 *
 * @author hcadavid
 */
 
public class Point {
   
    private int x;
    private int y;
	
	/**
	*/
	@Override
    public boolean equals(Object obj) {
        boolean equals;
        if(!obj.getClass().getSimpleName().equals("Point")){
            equals = false;
        }
        else{
            Point point = (Point) obj;
            equals = point.getX()==x && point.getY()==y;
        }
        return equals;
    }  
	
	/**
	*/
	@Override
    public String toString() {
        return "( "+x+" "+y+" )";
    }
	
	/**
	*/
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
	
	/**
	*/
    public Point() {
    }    
    
	/**
	*/
    public int getX() {
        return x;
    }

	/**
	*/
    public void setX(int x) {
        this.x = x;
    }
	
	/**
	*/
    public int getY() {
        return y;
    }

	/**
	*/
    public void setY(int y) {
        this.y = y;
    }   
}