/**
 * This program TestCluHouseUse
 *
 * Author:Treepaech Treechan
 * ID: 633040156-4
 * Sec: 1
 * Date:February 18, 2021
 *
 **/


package treeechan.treepaech.midterm;

public class TestCluHouseUser {
    public static void testConstructorsMethods(){
        ClubHouseUser apirak = new ClubHouseUser("apirak");
        ClubHouseUser jeng = new ClubHouseUser("jengguru,", "Seeking new fun startup");
        apirak.setNumFollowers(407);
        jeng.setNumFollowers(93);
        apirak.setBio("Co-Founder UX Thailand Community");
        System.out.println(apirak.getId() + " has number of followers as " +
                apirak.getNumFollowers());
        System.out.println(apirak);
        System.out.println(jeng);
        System.out.println("Number of Club Hourse Users is " +
                ClubHouseUser.getNumClubHouseUser());
    }
    public static void testSuperclass(){
        VIPClubHouseUser gap = new VIPClubHouseUser("gab", "Nerd Squad", 719);
        gap.setNumHostedRooms(2);
        System.out.println(gap);
        System.out.println("Number of Club Hourse Users is " +
                ClubHouseUser.getNumClubHouseUser());
    }
    public static void main(String[] args) {
     testConstructorsMethods();
     testSuperclass();
    }
}
