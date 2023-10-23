package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> groups = Arrays.asList(new MusicBand("group1", 2000),
                new MusicBand("group2", 2001), new MusicBand("group3", 1995),
                new MusicBand("group4", 1990), new MusicBand("group5", 2010),
                new MusicBand("group10", 1988), new MusicBand("group8", 1982),
                new MusicBand("group7", 1985), new MusicBand("group6", 1922),
                new MusicBand("group9", 1974));
        System.out.println(groups);

//        Collections.shuffle(groups);
//        System.out.println(groups);

        System.out.println(groupsAfter2000(groups));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> groups){
        List<MusicBand> list = new ArrayList<>();
        for(MusicBand m: groups){
            if (m.getYear() >= 2000){
                list.add(m);
            }
        }

        return list;
    }
}
