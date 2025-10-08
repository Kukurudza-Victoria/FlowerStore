package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Flower> flowers = new ArrayList<>();
    
    public void includeFlower(Flower flower) {
        flowers.add(flower);
    }

    public List<Flower> findFlowers(Flower template) {
        List<Flower> found = new ArrayList<>();
        for (Flower current : flowers) {
            if (checkMatch(template, current)) {
                found.add(current);
            }
        }
        return found;
    }

    private boolean checkMatch(Flower pattern, Flower candidate) {
        if (pattern.getFlowerType() != null && 
            !pattern.getFlowerType().equals(candidate.getFlowerType())) {
            return false;
        }
        if (pattern.getColor() != null && 
            !pattern.getColor().equals(candidate.getColor())) {
            return false;
        }
        if (pattern.getSepalLength() != 0 && 
            pattern.getSepalLength() != candidate.getSepalLength()) {
            return false;
        }
        if (pattern.getPrice() != 0 && 
            pattern.getPrice() != candidate.getPrice()) {
            return false;
        }
        return true;
    }
}



