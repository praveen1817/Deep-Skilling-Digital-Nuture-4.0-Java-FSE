//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product prd1=new Product(101,"RasberyPi",5,140000);
        productInventory Inventory =new productInventory();
        Inventory.addProduct(prd1);
        Product prd2=new Product(102,"SSD",3,10000);
        Inventory.addProduct(prd2);
        Product update =new Product(102,"SSD",3,13000);
        Inventory.updateProduct(102,update);
        Inventory.printProduct();




    }
    }
