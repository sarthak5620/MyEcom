package Models;

import java.util.Objects;

public class Product {
    public String name;
    public String imageUrl;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) && imageUrl.equals(product.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, imageUrl);
    }

    /**
    public Product() {
    }
 */

    public Product(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
