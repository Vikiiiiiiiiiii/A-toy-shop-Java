public class Main {
    public static void main(String[] args) {
   
        Toys bear = new Toys(1, "Misha", 10, 20);
        Toys doll = new Toys(2, "Nina", 200, 40);
        Toys cubes = new Toys(3, "Rubik's_cube", 50, 30);      
        Toys doctors_kit = new Toys(4, "Aibolit", 200, 90);  // набор доктора
        Toys car = new Toys(5, "Tractor", 10, 10);

        Raffle toy_raffle = new Raffle();
        toy_raffle.addToy(bear);
        toy_raffle.addToy(doll);
        toy_raffle.addToy(cubes);
        toy_raffle.addToy(doctors_kit);
        toy_raffle.addToy(car);

        toy_raffle.changeToyMass(1, 30);

        toy_raffle.organizeRaffle();

        Toys prizeToy = toy_raffle.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выигрышная игрушка: " + prizeToy.getToy_name());
        }
    }
}