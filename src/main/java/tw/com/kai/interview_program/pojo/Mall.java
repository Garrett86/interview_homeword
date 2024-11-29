package tw.com.kai.interview_program.pojo;

public class Mall {
    private Integer id;
    private String name;
    private String price;
    private String saleCount;
    private String breadCount;

    public Mall() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(String saleCount) {
        this.saleCount = saleCount;
    }

    public String getBreadCount() {
        return breadCount;
    }

    public void setBreadCount(String breadCount) {
        this.breadCount = breadCount;
    }

    @Override
    public String toString() {
        return "Mall{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", saleCount='" + saleCount + '\'' +
                ", breadCount='" + breadCount + '\'' +
                '}';
    }
}
