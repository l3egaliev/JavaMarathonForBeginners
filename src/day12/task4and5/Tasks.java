package day12.task4and5;

public class Tasks {
    public static void main(String[] args) {
        MusicBand groupA = new MusicBand("groupA", 2000);
        MusicBand groupB = new MusicBand("groupB", 1998);
        Members memberA = new Members("Member A");
        Members memberB = new Members("Member B");
        groupA.setMembers(memberA);
        groupB.setMembers(memberB);


        MusicBand.transferMembers(groupA, groupB);
        MusicBand.printMembers();
    }
}
