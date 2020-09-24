import java.util.ArrayList;

public class AddressBook
{
    // Collection
    private ArrayList<BuddyInfo> buddyList;

    /**
     *
     * Constructor for AddressBook
     *
     */
    public AddressBook()
    {
        buddyList = new ArrayList<BuddyInfo>();
    }

    /**
     *
     * Method to add BuddyInfo object to buddyList
     *
     */
    public void addBuddy(BuddyInfo aBuddy)
    {
        buddyList.add(aBuddy);
    }

    /**
     *
     * Method to remove BuddyInfo object from buddyList;
     *
     */
    public void removeBuddy(BuddyInfo aBuddy)
    {
        buddyList.remove(aBuddy);
    }

    public static void main(String[] args)
    {
        System.out.println("Address Book");
    }

}
