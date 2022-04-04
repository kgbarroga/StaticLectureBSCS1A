public class Friend {
    private String name;
    /**
     * Static Variable
     */
    private static int friendCount;

    Friend(String nameInput){
        friendCount++;
        this.name = nameInput;
    }

    /**
     * Getter for Static Method
     */
    public static int getFriendCount(){
        return friendCount;
    }

}
