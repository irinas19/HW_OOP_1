import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    
        List<HotDrink> listHDrinks = new ArrayList<>(

                Arrays.asList(
                        new HotDrink("coffee", 80.0, 0.3, 10.0),
                        new HotDrink("tea", 90.0, 0.4, 9.5),
                        new HotDrink("cacao", 95.0, 0.5, 8.5)

                ));


        MachineOfHotDrink Drinks = new MachineOfHotDrink(listHDrinks);
        String keyHotDrink = "cacao";
        System.out.println(Drinks.getProduct(keyHotDrink, 0.4, 9.5));
    }
