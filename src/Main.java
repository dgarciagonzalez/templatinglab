interface Ingredient{
    String getName();
    double getQuantity();

}
class SolidIngredient implements Ingredient{
    private String _name;
    private double _quantity;
    public SolidIngredient(){
        _name = "";
        _quantity = 0.0;
    }
    public SolidIngredient(String n, double q){
        _name = n;
        _quantity = q;
    }
    @Override
    public String getName(){
        return _name;
    }
    @Override
    public double getQuantity(){
        return _quantity;
    }
}
class LiquidIngredient implements Ingredient{
    private String _name2;
    private double _quantity2;
    public LiquidIngredient(){
        _name2 = "";
        _quantity2 = 0.0;
    }
    public LiquidIngredient(String n2, double q2){
        _name2 = n2;
        _quantity2 = q2;
    }

    @Override
    public String getName() {return _name2;}
    public double getQuantity(){return _quantity2;}
}
class Recipe<T extends Ingredient>{
    
}


public class Main {
    public static void main(String[] args) {

    }
}