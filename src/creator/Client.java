package creator;

import iPizza.IProduct;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        //Pour les pizza
         PizzaCreator creator = new PizzaCreator();
         
         IProduct pizza = creator.factoryMethod("sen");
         pizza.service();
         pizza = creator.factoryMethod("amer");
         pizza.service();
         pizza = creator.factoryMethod("italie");
         pizza.service();
         
         //Pour les Sandwich
         SandwichCreator createur = new SandwichCreator();
         
         IProduct sandwich = createur.factoryMethod("sen");
         sandwich.service();
         sandwich = createur.factoryMethod("amer");
         sandwich.service();
         sandwich = createur.factoryMethod("italie");
         sandwich.service();
         
    }

}
