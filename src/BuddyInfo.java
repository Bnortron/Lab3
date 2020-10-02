public class BuddyInfo
{
    private static String name;
    private static String address;
    private static String phoneNumber;

    /**
     * Constructor for BuddyInfo object
     *
     * @param name of BuddyInfo object as a String
     * @param address of BuddyInfo object as a String
     * @param phoneNumber of BuddyInfo object as a String
     */
    public BuddyInfo(String name, String address, String phoneNumber)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for BuddyInfo name
     *
     * @return String containing name
     */
    public static String getName() {
        return name;
    }

    /**
     *
     *
     * @return String containing address
     */
    public static String getAddress() {
        return address;
    }

    /**
     *
     * @return String containing phoneNumber
     */
    public static String getPhoneNumber()
    {
        return phoneNumber;
    }

    //public static void main(String[] args)
    //{
        // empty
    //}
}