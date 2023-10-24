package adapterPattern;

public class ApplianceApp {

    public static void main(String[] args){



        Laptop lapTop = new Laptop();
        PowerOutlet lappy = new LaptopAdapter(lapTop);

        Refrigirator ref = new Refrigirator();
        PowerOutlet fridge = new RefrigiratorAdapter(ref);

        SmartPhoneCharger spc = new SmartPhoneCharger();
        PowerOutlet spcharger = new SmartPhoneChargerAdapter(spc);



        //Plugin

        System.out.println(lappy.plugIN());
        System.out.println();
        System.out.println(fridge.plugIN());
        System.out.println();
        System.out.println(spcharger.plugIN());




    }
}
