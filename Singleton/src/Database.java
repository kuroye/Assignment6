public class Database {

    //Storing the singleton instance should be static
    private static Database obj = new Database();

    //The singleton constructor should always be private
    private Database() {
    //Some initialization code , like connection to database server
    }

    //The static method controls access to the singleton instance
    public static Database getInstance(){
        return obj;
    }

    //Implementation which can be executed on its instance.
    public void test (){
        System.out.println("It works");
    }
}
