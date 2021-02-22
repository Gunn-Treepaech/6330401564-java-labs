package treeechan.treepaech.midterm;

class ClubHouseUser {
    protected String Id;
    protected String bio;
    protected int numFollowers;
    protected static int numClubHouseUser = 0;
    ClubHouseUser(){}
    public ClubHouseUser(String Id){
        this.Id = Id;
        numClubHouseUser++;
    }
    public ClubHouseUser(String Id, String bio){
        this.Id = Id;
        this.bio = bio;
        numClubHouseUser++;
    }
    public String getId() {
        return Id;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }
    public String getBio() {
        return bio;
    }
    public int getNumFollowers() {
        return numFollowers;
    }
    public void setNumFollowers(int numFollowers) {
        this.numFollowers = numFollowers;
    }

    public static int getNumClubHouseUser() {
        return numClubHouseUser;
    }
    @Override
    public String toString() {
        String msg;
        msg = "ID:" + getId() + ", Bio:" + getBio() + ", Number of followers:" + getNumFollowers();
        return msg;
    }
}
