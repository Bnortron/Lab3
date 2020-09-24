import java.util.ArrayList;

public class AddressBook
{
    // Collection
    private ArrayList<BuddyInfo> buddyList;

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
        // Construct buddyList
        AddressBook addressBook = new AddressBook();

        // Create BuddyInfo object, add it to buddyList, then remove it
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

}
