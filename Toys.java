public class Toys{               // класс игрушки
    
    private int toy_id;          // id игрушки
    private String toy_name;     // текстовое название
    private int toy_quantity;    // количество
    private double toy_mass;     // масса/вес игрушки

    public Toys(int toy_id, String toy_name, int toy_quantity, double toy_mass) {
        this.toy_id = toy_id;
        this.toy_name = toy_name;
        this.toy_quantity = toy_quantity;
        this.toy_mass = toy_mass;
    }

    public int getToy_id() {
        return toy_id;
    }

    /*public void setToy_id(int toy_id) {
        this.toy_id = toy_id;
    }*/

    public String getToy_name() {
        return toy_name;
    }

    /*public void setToy_name(String toy_name) {
        this.toy_name = toy_name;
    }*/

    public int getToy_quantity() {
        return toy_quantity;
    }

    public void setToy_quantity(int toy_quantity) {
        this.toy_quantity = toy_quantity;
    }

    public double getToy_mass() {
        return toy_mass;
    }

    public void setToy_mass(double toy_mass) {
        this.toy_mass = toy_mass;
    }

}
