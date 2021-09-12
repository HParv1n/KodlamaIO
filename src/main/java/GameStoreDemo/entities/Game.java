package GameStoreDemo.entities;

public class Game {
    private String gameName;
    private String price;

    public Game() {
    }

    public Game(String gameName, String price) {
        this.gameName = gameName;
        this.price = price;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
