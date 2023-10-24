package adapterPattern;

public class RefrigiratorAdapter implements PowerOutlet {
    private Refrigirator ref;

    public RefrigiratorAdapter(Refrigirator ref){
        this.ref = ref;
    }

    @Override
    public String plugIN() {
        return ref.startCooling();
    }

    @Override
    public String plugOUT() {
        return ref.turnOff();
    }


}
