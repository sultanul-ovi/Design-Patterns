/**
 * 
 */
package composite_pattern_example;

/**
 * @author Ovi
 *
 */
public class AgeOfVillagers {
    public static void main(String[] args) {
    	
    	BaseShape GreenSmallCircle = new BaseShape("Circle","Small","Green");
    	BaseShape GreenLargeRectangle = new BaseShape("Rectangle","Large","Green");
    	
    	BaseShape BlueMediumRectangle = new BaseShape("Rectangle","Medium","Blue");
    	BaseShape BlueSmallTriangle = new BaseShape("Triangle","Small","Blue");
    	
    	BaseShape RedLargeTriangle = new BaseShape("Triangle","Large","Red");
    	BaseShape RedMediumCircle = new BaseShape("Circle","Medium","Red");
    	
    	
    	
    	BaseShape Tree = new BaseShape("Tree","Small","Green & Blue");
        Tree.add(GreenSmallCircle);
        Tree.add(BlueSmallTriangle);
        
        
    	BaseShape House = new BaseShape("House","Medium","Red & Blue");
        House.add(BlueMediumRectangle);
        House.add(RedMediumCircle);

        
    	BaseShape WaterSource = new BaseShape("WaterSource","Large","Red & Green");
    	WaterSource.add(GreenLargeRectangle);
    	WaterSource.add(RedLargeTriangle);
        
        

        BaseShape Village = new BaseShape("Village","small","Random");
        Village.add(House);
        Village.add(Tree);
        Village.add(WaterSource);

        
        
        System.out.println(Village);
        Village.printContains();

        System.out.println(House);
        House.printContains();
        
        System.out.println(Tree);
        Tree.printContains();

        System.out.println(WaterSource);
        WaterSource.printContains();
    }
}
