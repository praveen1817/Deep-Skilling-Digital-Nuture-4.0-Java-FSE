public class testBuilder {
    public static void main(String[] args) {

        computer testBuilder =new computer.Builder("16","Dual Core")
                .setGraphics("4050RTX").setStorage(512).Build();
        System.out.println(testBuilder);

    }
}