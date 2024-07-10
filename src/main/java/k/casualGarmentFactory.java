package k;

public class casualGarmentFactory implements garmentFactory{
    @Override
    public Pants createPants(){
        return new casPants();
    }
    @Override
    public Shoes createShoes(){
        return new casShoes();
    }
    @Override
    public Top createTop(){
        return new casTop();
    }
}
