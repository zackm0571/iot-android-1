package joanbempong.android;

import java.util.ArrayList;

/**
 * Created by Joan Bempong on 10/8/2015.
 */
public class MyChoices {
    //declaring variables
    private static MyChoices instance = null;
    private ArrayList<String> durationList = new ArrayList<>();
    private ArrayList<String> flashPatternList = new ArrayList<>();
    private ArrayList<String> flashRateList = new ArrayList<>();
    private ArrayList<String> colorList = new ArrayList<>();

    private MyChoices() {
        durationList.add("--");
        durationList.add("1");
        durationList.add("5");
        durationList.add("10");
        durationList.add("15");
        durationList.add("30");
        durationList.add("45");
        durationList.add("60");
        durationList.add("Always On (full brightness)");
        durationList.add("Always On (energy saving)");

        flashPatternList.add("--");
        flashPatternList.add("Slow");
        flashPatternList.add("Heartbeat");
        flashPatternList.add("Panic");

        flashRateList.add("--");
        flashRateList.add(".5");
        flashRateList.add("1");
        flashRateList.add("1.5");
        flashRateList.add("2");

        colorList.add("--");
        colorList.add("warm white");
        colorList.add("red");
        colorList.add("orange");
        colorList.add("yellow");
        colorList.add("green");
        colorList.add("blue");
        colorList.add("purple");
        colorList.add("pink");
    }

    public static MyChoices getInstance() {
        if(instance == null) {
            instance = new MyChoices();
        }

        return instance;
    }

    public static MyChoices create() {
        return getInstance();
    }

    public ArrayList<String> getDurationList(){
        return this.durationList;
    }

    public ArrayList<String> getFlashPatternList(){
        return this.flashPatternList;
    }
    public ArrayList<String> getFlashRateList(){
        return this.flashRateList;
    }
    public ArrayList<String> getColorList(){
        return this.colorList;
    }
}
