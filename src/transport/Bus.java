package transport;

public class Bus extends Transport{

    private final String body;

    public Bus(String brand, String model, Integer productionYear, String color,
               String productionCountry, String body, int maxSpeed){
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.body = body;
    }

    public String getBody() { return body; }

}
