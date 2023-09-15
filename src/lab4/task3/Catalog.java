package lab4.task3;
import java.util.ArrayList;
import java.util.List;
public class Catalog {
    private CatalogType type;
    private ArrayList<Product>products;

    public Catalog(CatalogType type, ArrayList<Product> products) {
        this.type = type;
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public ArrayList<Product> getProducts(){
        return products;
    }

    public CatalogType getType(){
        return type;
    }
}