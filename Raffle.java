import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Raffle {    // розыгрыш игрушек

    private ArrayList<Toys> toys;
    private ArrayList<Toys> prizeToys;
    private String prizeFilePath;

    public Raffle() {
        toys = new ArrayList<Toys>();
        prizeToys = new ArrayList<Toys>();
        prizeFilePath = "prize.txt";
    }

    public void addToy(Toys toy) {
        toys.add(toy);
    }

    public void changeToyMass(int toy_id, double toy_mass) {
        for (Toys toy : toys) {
            if (toy.getToy_id() == toy_id) {
                toy.setToy_mass(toy_mass);
            }
        }
    }

    public void organizeRaffle() {
        prizeToys.clear();

        for (Toys toy : toys) {
            double random = Math.random() * 100;
            if (random < toy.getToy_mass()) {
                prizeToys.add(toy);
            }
        }
    }

    public Toys getPrizeToy() {
        if (!prizeToys.isEmpty()) {
            Toys prizeToy = prizeToys.remove(0);
            prizeToy.setToy_quantity(prizeToy.getToy_quantity() - 1);

            try {
                FileWriter writer = new FileWriter(prizeFilePath, true);
                writer.write(prizeToy.getToy_name() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка");
            }

            return prizeToy;
        } else {
            System.out.println("Игрушек больше нет!");
            return null;
        }
    }
}