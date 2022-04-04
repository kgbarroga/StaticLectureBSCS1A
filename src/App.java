public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome Back!");
        /**
         * Create objects for Bicycle
         */
        Bicycle b1 = new Bicycle("white");
        Bicycle b2 = new Bicycle("orange");
        Bicycle b3 = new Bicycle("black");
        /**
         * Display Instance Variables
         * 
         */
        System.out.println("Bicycle 1 " + b1.getColor());
        System.out.println("Bicycle 2 " + b2.getColor());

        /**
         * Call the Class Variable
         * ClassName.variable/method
         */
        System.out.println("I have " + Bicycle.numberOfBikes + " bike(s).");

        System.out.println("----------------------------");

        Friend f1 = new Friend("Spongebob");
        Friend f2 = new Friend("Patrick");

        System.out.println("I have now " + Friend.getFriendCount() + " Friends." );
        


    }
}
