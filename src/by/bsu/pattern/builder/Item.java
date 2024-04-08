package by.bsu.pattern.builder;

import java.util.StringJoiner;

public class Item {
    private int itemId;
    private String name;
    private double price;

    private Item() {
        // private constructor
    }

    public int getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static Builder newBuilder() {
        return new Item().new Builder();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Item.class.getSimpleName() + "[", "]")
                .add("itemId=" + itemId)
                .add("name='" + name + "'")
                .add("price=" + price)
                .toString();
    }

    public class Builder {

        private Builder() {
        }

        public Builder setItemId(int itemId) {
            Item.this.itemId = itemId;
            return this;
        }

        public Builder setName(String name) {
            Item.this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            Item.this.price = price;
            return this;
        }

        public Item build() {
            return Item.this;
        }
    }
}