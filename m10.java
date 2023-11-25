public class m10 {
    private String name;
    private int number0fPetals;
    private float price;

    public m10(String name, int number0fPetals, float price){
        this.name = name;
        this.number0fPetals=number0fPetals;
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNumber0fPetals(int number0fPetals){
        this.number0fPetals=number0fPetals;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getNumber0fPetals(){
        return number0fPetals;
    }

    public float getPrice() {
        return price;
    }
}
