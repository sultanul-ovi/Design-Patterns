/**
 * 
 */
package prototype_pattern;

/**
 * @author Ovi
 *
 */
public class Rectangle extends Shape {

	   public Rectangle(){
	     type = "Rectangle";
	   }

	   @Override
	   public void draw() {
	      System.out.println("Inside Rectangle::draw() method.");
	   }
	}
