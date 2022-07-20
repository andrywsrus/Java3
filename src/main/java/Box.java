import java.util.ArrayList;
public class Box {
    private ArrayList<Fruit> product = new ArrayList<>();
    public Box() {
        ArrayList<Fruit> product = new ArrayList<>();
    }
    public double getWeight() {
        double weightProducts = 0.0f;
        for (Fruit e : product) {
            weightProducts += e.getWeight();
        }
        return weightProducts;
    }
    
    public ArrayList<Fruit> getFruit() {
        return product;
    }

    public void add(Fruit fruit) {
        if (product.size() > 1) {
            if (fruitCompare(fruit)) {
                throw new BoxException("Яблоки отдельно, апельсины отдельно");
            }
        }
        product.add(0, fruit);
    }

    public boolean compare(Box other) {
        return Math.abs(getWeight() - other.getWeight()) < 0.0001;
    }

    public void rotateFruit(Box box2) throws BoxException {
        if (fruitCompare(box2)) {
            throw new BoxException("Яблоки отдельно, апельсины отдельно");
        }
        for (int i = product.size() - 1; i >= 0; i--) {
            box2.getFruit().add(product.get(i));
            product.remove(i);
        }
    }
    public boolean fruitCompare(Box otherBox) {
        return product.get(0).getClass() != otherBox.getFruit().get(0).getClass();
    }

    public boolean fruitCompare(Fruit fruit) {
        return product.get(0).getClass() != fruit.getClass();
    }
}