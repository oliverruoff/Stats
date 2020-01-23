package eu.de.bw.hn.stats.Classes;

import android.content.Context;

import java.util.TreeMap;

public class Stats {

    private TreeMap<String, TreeMap> statsMap = new TreeMap<>();
    private String currentStat;
    private Context context;

    public Stats (Context context) {
        this.context = context;
    }

    public TreeMap<String, TreeMap> getStatsMap() {
        return statsMap;
    }

    public String getCurrentStat() {
        return currentStat;
    }

    public void setCurrentStat(String currentStat) {
        this.currentStat = currentStat;
    }

    public void setStatsMap(TreeMap<String, TreeMap> statsMap) {
        this.statsMap = statsMap;
    }

}
