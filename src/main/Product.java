package main;

public class Product {
    private Code code;
    private Double price;
    private Double volumePrice;
    private Integer volume;

    public Product(Code code) {
        this.price = code.price;
        this.volumePrice = code.volumePrice;
        this.volume = code.volume;
        this.code = code;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getVolumePrice() {
        return volumePrice;
    }

    public void setVolumePrice(Double volumePrice) {
        this.volumePrice = volumePrice;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

}
