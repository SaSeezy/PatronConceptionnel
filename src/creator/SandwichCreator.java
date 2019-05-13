package creator;

import iPizza.IProduct;

import iSandwich.SandwichArab;
import iSandwich.SandwichChine;
import iSandwich.SandwichSen;

public class SandwichCreator extends AbstCreator{


    @Override
    IProduct factoryMethod(String sandwichtype) {
        // TODO Auto-generated method stub
        switch(sandwichtype) {
        
            case "sen": 
                product = new SandwichSen(); break;
            case "arabe":
                product = new SandwichArab(); break;
            case "italie":
                product = new SandwichChine(); break;
            default:
                product = new SandwichSen();
 
        }
        return product;
    }

}
