package adapterPattern;

public class SmartPhoneChargerAdapter implements PowerOutlet {
    private SmartPhoneCharger spc;
    public SmartPhoneChargerAdapter(SmartPhoneCharger spc){
        this.spc = spc;
    }

    @Override
    public String plugIN() {
        return spc.chargePhone();
    }

    @Override
    public String plugOUT() {
        return spc.turnOff();
    }

}
