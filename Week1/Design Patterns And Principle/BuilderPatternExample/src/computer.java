public class computer {
    private final String ram;
    private final  String cpu;
    private final int storage;
    private final String graphicsCard;

    private computer(Builder builder){
        this.ram=builder.ram;
        this.cpu=builder.cpu;
        this.storage=builder.storage;
        this.graphicsCard=builder.graphicsCard;
    }
    @Override
    public String toString(){
        return "Ram:"+ram+"Cpu:"+cpu+"Storage:"+storage+"GraphicsCard:"+graphicsCard;}
public static class Builder{
    private  String ram;
    private  String cpu;
    private  int storage;
    private  String graphicsCard;


    public Builder(String ram,String cpu){
        this.ram=ram;
        this.cpu=cpu;sp
    }
    public Builder setStorage(int storage){
        this.storage=storage;
        return this;
    }
    public Builder setGraphics(String graphicsCard){
        this.graphicsCard=graphicsCard;
        return this;
    }
    public computer Build(){
        return new computer(this);
    }

}

}

