package creator;

import iPizza.IProduct;

abstract class AbstCreator {

    IProduct product;
    
    abstract IProduct factoryMethod(String type) ;
    
}