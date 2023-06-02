package domain;

public class ListFilms {
    private int id;

    private int productId;
    private String productName;
    private int productPrice;
    private int count;

    public ListFilms(int id, int ProductId,String productName, int ProductPrice, int count) {
        this.id = id;
        this.productName =productName;
        this.productId=productId;
        this.productPrice=productPrice;
        this.count= count;

    }
}
