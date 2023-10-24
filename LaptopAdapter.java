package adapterPattern;

public class LaptopAdapter implements PowerOutlet {
    private Laptop lapTop;

    public LaptopAdapter(Laptop lapTop){
        this.lapTop = lapTop;
    }

    @Override
    public String plugIN() {
        return lapTop.charge();
    }

    @Override
    public String plugOUT() {
        return lapTop.unplug();
    }


}
