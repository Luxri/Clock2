public class Clock{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;


    /**
     * Konstruktor
     */
    public Clock () {
        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Parameter för hours/minutes, sätts till 00:00
     * @param hours
     * @param minutes
     */

    public Clock(int hours, int minutes) {
        this();
        this.hours.setValue(0);
        this.minutes.setValue(0);
    }
    public void timeTick () {
        minutes.increment();
    }

    /**
     * Setter för tiden
     * @param hours
     * @param minutes
     */

    public void setTime(int hours, int minutes) {
        this.hours.setValue(hours);
        this.minutes.setValue(minutes);
    }

    /**
     * Getter för displayString
     * @return
     */
    public String getTime() {
        return displayString;
    }

    /**
     * Displaystringen och uppdatering av display
     */
    private void updateDisplay() {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }

    public static void main(String[] args) {
        Clock c1 = new Clock();
        System.out.println(c1.getTime());
    }
}