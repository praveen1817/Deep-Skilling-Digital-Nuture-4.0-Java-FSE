import java.util.Comparator;
import java.util.Arrays;
public class Product {
    String productName;
    int productId;
    String category;
    public Product(String productName,int productId,String category){
        this.productName=productName;
        this.productId=productId;
        this.category=category;

    }
    public Product linearSearch(Product[] products,String searchProduct){
        for(Product p:products){
            if (p.productName==searchProduct){
                return p;
            }
        }
        return null;
    }
    public Product binearySearch(Product[] products,String searchProduct){
        Arrays.sort(products,Comparator.comparing(p -> p.productName));
        int left=0;
        int right=products.length;
        while(left<=right){
            int mid=(left+right)/2;
            int value=products[mid].productName.compareToIgnoreCase(searchProduct);
            if (value==0) return products[mid];
            else if(value<0) left=mid+1;
            else right=mid-1;

        }
        return null;
    }
}
