package k;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private Pants pants;
    private Shoes shoes;
    private Top top;

    public Main(garmentFactory factory){
        pants = factory.createPants();
        shoes = factory.createShoes();
        top = factory.createTop();
    }
    void curOutfit(){
        pants.wear();
        shoes.wear();
        top.wear();
    }



    public static void main(String[] args) {

        garmentFactory party = new partyGarmentFactory();
        Main partyOutfit = new Main(party);
        System.out.println("Party outfit" );
        partyOutfit.curOutfit();

        garmentFactory professional = new professionalGarmentFactory();
        Main professionalOutfit = new Main(professional);
        System.out.println("Professional outfit" );
        professionalOutfit.curOutfit();

        garmentFactory casual = new casualGarmentFactory();
        Main casualOutfit = new Main(casual);
        System.out.println("Casual outfit" );
        casualOutfit.curOutfit();
    }
}