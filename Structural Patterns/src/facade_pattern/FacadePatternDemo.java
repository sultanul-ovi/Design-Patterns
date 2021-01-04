/**
 * 
 */
package facade_pattern;

/**
 * @author Ovi
 *
 */
public class FacadePatternDemo {
	   public static void main(String[] args) {
	      ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();		
	   }
	}
