package k;

public class partyGarmentFactory implements garmentFactory {    @Override
public Pants createPants(){
    return new parPants();
}
    @Override
    public Shoes createShoes(){
        return new parShoes();
    }
    @Override
    public Top createTop(){
        return new parTop();
    }


}
