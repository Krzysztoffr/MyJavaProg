package MJP1;

import java.util.TreeMap;
public class KosztyTransp {
    public static void main(String[] args) {
        // Tworzenie mapy za pomocą klasy TreeMap
        TreeMap<Integer, Shop> map = new TreeMap<>();

        // Dodawanie elementów do mapy
        map.put(4, new Shop("Shop 4", "Lodz", 65, 550));
        map.put(1, new Shop("Shop 1", "Plock", 50, 500));
        map.put(2, new Shop("Shop 2", "Warszawa", 100, 1000));
        map.put(3, new Shop("Shop 3", "Kraków", 200, 2000));

        // Pobieranie pierwszego i ostatniego klucza w mapie
        int firstKey = map.firstKey();
        int lastKey = map.lastKey();

        // Tworzenie obiektu do sformatowania liczb jako kwoty pieniężne
        //NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        // Pętla wypisująca wszystkie elementy mapy
        for (int i = firstKey; i <= lastKey; i++) {
            Shop shop = map.get(i);

            // Obliczenie kosztu transportu za kilometr
            //Math.round(shop.getCostPerKilometer());

            // Sformatowanie kosztu transportu za kilometr jako kwoty pieniężnej
            //String costPerKilometerString = currencyFormat.format(costPerKilometer);


            System.out.println(shop.getName() + ", " + shop.getCity() + ", " + shop.getDistance()
                    + " km, " + shop.getCost() + " zł\n" + shop.getCostPerKilometer() + " zł/km");
        }
    }

    static class Shop {
        private final String name;
        private final String city;
        private final int distance;
        private final int cost;

        Shop(String name, String city, int distance, int cost) {
            this.name = name;
            this.city = city;
            this.distance = distance;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public String getCity() {
            return city;
        }

        public int getDistance() {
            return distance;
        }

        public int getCost() {
            return cost;
        }

        // Nowa metoda zwracająca koszt transportu za kilometr
        public double getCostPerKilometer() {
            double a = cost / distance;
            if (distance > 0) {
                return a;

            } else {
                return 0.0;
            }
        }
    }
}

