import java.util.ArrayList;
import java.util.List;

public class MachineOfHotDrink extends Machine{

    private List<HotDrink> hotDrinks;
    public MachineOfHotDrink(List<HotDrink> list) {
        super();
        this.hotDrinks = list;
    }

    public List<HotDrink> getHotDrinks() {
        return hotDrinks;
    }

    public Product getProduct (String name, Double temperature, Double volume) {
        for (HotDrink item: hotDrinks) {

            if (name.equals(item.getName()) && temperature.equals(item.getTemperature()) && volume.equals(item.getVolume())){
                return item;
            }
        }
        return null;
    }
}