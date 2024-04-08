package by.bsu.pattern.builder;

public class MainBuilder {
    public static void main(String[] args) {
        Item.Builder itemBuilder = Item.newBuilder()
                .setItemId(777)
                .setPrice(14.89)
                .setName("T-Shirt");

        Item item = itemBuilder.build();
        System.out.println(item);

        Item  item2 = Item.newBuilder()
                .setItemId(771)
                .setPrice(14.80)
                .setName("Gloves")
                .build();
        System.out.println(item2);
    }
}
