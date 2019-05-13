package creator;


import iPizza.IProduct;
import iPizza.PizzaAmer;
import iPizza.PizzaItalie;
import iPizza.PizzaSen;

public class PizzaCreator extends AbstCreator{


    @Override
    IProduct factoryMethod(String pizzatype) {
        // TODO Auto-generated method stub
        switch(pizzatype) {
        
        case "sen": 
            product = new PizzaSen(); break;
        case "amer":
            product = new PizzaAmer(); break;
        case "italie":
            product = new PizzaItalie(); break;
        default:
            product = new PizzaSen();
 
        }
        return product;
    }

}
