package main;

public enum Code {
    A (1.25, 3.0, 3),
    B (4.25, -1.0, -1),
    C (1.0,  5.0, 6),
    D (0.75, -1.0, -1);

    public double price;
    public double volumePrice;
    public int volume;

    private Code (double price, double volumePrice, int volume ){
        this.price = price;
        this.volumePrice = volumePrice;
        this.volume = volume;
    }
}
