package treeechan.treepaech.midterm;

public class VIPClubHouseUser extends ClubHouseUser{
    private int numHostedRooms = 0;
    public VIPClubHouseUser(String Id){
        super(Id);
    }
    public VIPClubHouseUser(String Id, String bio){
        super(Id, bio);
    }
    public VIPClubHouseUser(String Id, String bio, int numFollowers){
        super(Id,bio);
        super.numFollowers= numFollowers;
    }
    public int getNumHostedRooms() {
        return numHostedRooms;
    }
    public void setNumHostedRooms(int numHostedRooms) {
        this.numHostedRooms = numHostedRooms;
    }
    @Override
    public String toString() {
        return super.toString() + ", Number of hosted rooms:" + getNumHostedRooms();
    }
}
