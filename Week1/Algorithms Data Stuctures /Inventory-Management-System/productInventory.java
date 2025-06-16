import java.util.HashMap;
public class productInventory {
    HashMap<Integer,Product> inventory =new HashMap<>();
    public void addProduct(Product product){
        inventory.put(product.Id, product);
    }
    public void updateProduct(int Id,Product newupdated){
        if (inventory.containsKey(Id)){
            inventory.put(Id,newupdated);
        }

    }
    public void deleteProduct(int Id){
        inventory.remove(Id);
    }
    public void printProduct(){
        for(Product p:inventory.values()){
            System.out.println(p);
        }
    }

}
