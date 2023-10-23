package day12.task4and5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;

    private List<Members> members;
    private static List<List> list;


    public MusicBand(String name, int year) {
        members = new ArrayList<>();
        this.name = name;
        this.year = year;
    }

    public MusicBand() {
    }

    public static void transferMembers(MusicBand a, MusicBand b){
        list = new ArrayList<>();
        list.add(a.getMembers());
        list.add(b.getMembers());
    }

    public static void printMembers(){
        System.out.println(list);
    }

    public List<Members> getMembers() {
        return members;
    }

    public void setMembers(Members members) {
        this.members.add(members);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
