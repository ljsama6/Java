package chapter08.interface_.In02;

public class DBTest {
    public static void main(String[] args) {
        DBMysql dbMysql = new DBMysql();
        t(dbMysql);
        DBOracle dbOracle = new DBOracle();
        t(dbOracle);
    }

    public static void t(DBInterface db) {
        db.connect();
        db.close();
    }
}
