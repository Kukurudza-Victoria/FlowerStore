package flower.store;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
    public Flower(Flower other){
        this.color = other.color;
        this.flowerType = other.flowerType;
        this.sepalLength = other.sepalLength;
        this.price = other.price;
    }
}
