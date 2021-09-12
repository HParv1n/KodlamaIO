package spring;

public class OracleDatabase implements CustomerDaoInter{

    @Override
    public void add() {
        System.out.println(" Oracle veri tabanina eklendi");
    }
}
