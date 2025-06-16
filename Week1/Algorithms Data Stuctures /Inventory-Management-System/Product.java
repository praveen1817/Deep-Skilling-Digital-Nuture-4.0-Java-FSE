public class Product
{
    int Id;
    String productName;
    int quantity;
    float price;
    public Product(int Id,String productName,int quantity,float price){
        this.Id=Id;
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
    }
@Override
    public String toString(){
           return "Product Id:  "+Id+"/nProduct Name:  "
            +productName+"Quantity:  "+quantity+"Price:  "+price;}


    }

