/**
 * 
 */
package bridge_pattern;

/**
 * @author Ovi
 *
 */
public abstract class Shape {
	   protected DrawAPI drawAPI;
	   
	   protected Shape(DrawAPI drawAPI){
	      this.drawAPI = drawAPI;
	   }
	   public abstract void draw();	
	}
