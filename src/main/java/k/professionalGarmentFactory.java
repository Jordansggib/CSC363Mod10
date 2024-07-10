package k;

public class professionalGarmentFactory implements garmentFactory{
    @Override
    public Pants createPants(){
        return new proPants();
    }
    @Override
    public Shoes createShoes(){
        return new porShoes();
    }
    @Override
    public Top createTop(){
        return new porTop();
    }
}


