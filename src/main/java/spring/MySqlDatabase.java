package spring;

public class MySqlDatabase implements CustomerDaoInter {
    @Override
    public void add() {
        System.out.println("Mysql Veritabanina eklendi");
    }
}
