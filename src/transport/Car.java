package transport;

public class Car extends Transport{

    private final String body;

    public Car(String brand, Integer productionYear, String model, String color,
               String productionCountry, String body, int maxSpeed){
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.body = body;
    }

    public String getBody() { return body; }



}