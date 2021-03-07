public class Main{
    public static void main(String[] args) {
        Database obj1 = Database.getInstance();
        Database obj2 = Database.getInstance();

        obj1.test();
        obj2.test();
        //The variable `obj2` will contain the same object as the variable `obj1`
    }
}