package eu.de.bw.hn.stats.Classes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Set;
import java.util.TreeMap;

public class Stat {

    private String title;
    private TreeMap<Long, Float> dateRecordsMap = new TreeMap<>();

    public void Stat(String title) {
        this.title = title;
    }

    public TreeMap<Long, Float> getMap() {
        return this.dateRecordsMap;
    }

    public void addRecord(float record) {
        this.dateRecordsMap.put(Calendar.getInstance().getTimeInMillis(), record);
    }

    public void removeDate(long timeInMillis) {
        this.dateRecordsMap.remove(timeInMillis);
    }

    public Set<Long> getDateMillis() {
        return this.dateRecordsMap.keySet();
    }

    public ArrayList<String> getDateStrings() {
        ArrayList<String> dateStringList = new ArrayList<>();
        for (Long milli : this.dateRecordsMap.keySet()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(milli);

            int mYear = calendar.get(Calendar.YEAR);
            int mMonth = calendar.get(Calendar.MONTH);
            int mDay = calendar.get(Calendar.DAY_OF_MONTH);
            int mHour = calendar.get(Calendar.HOUR_OF_DAY);
            int mMinute = calendar.get(Calendar.MINUTE);
            int mSecond = calendar.get(Calendar.SECOND);
            String dateString = mYear + "-" + mMonth + "-" +
                    mDay + "-" + "T" + mHour + ":" + mMinute +
                    ":" + mSecond;
            dateStringList.add(dateString);
        }
        return dateStringList;
    }

}
