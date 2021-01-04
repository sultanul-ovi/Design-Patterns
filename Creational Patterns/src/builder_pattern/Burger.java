/**
 * 
 */
package builder_pattern;

/**
 * @author Ovi
 *
 */
public abstract class Burger implements Item {

	   @Override
	   public Packing packing() {
	      return new Wrapper();
	   }

	   @Override
	   public abstract float price();
}
