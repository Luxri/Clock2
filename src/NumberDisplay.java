
public class NumberDisplay {
    protected int limit;
    protected int value;

    /**
     * Limit
     * @param maxLimit
     */
    public NumberDisplay(int maxLimit) {
        value = 0;
        limit = maxLimit;
    }

    /**
     * getter för value
     * @return
     */
    public int getValue() {
        return value;
    }

    /**
     * Failsafe för klockan så inget olgiltigt värde kommer in
     * @param newValue
     */
    public void setValue(int newValue) {
        if (newValue < 0 && newValue > limit) {

        } else {
            this.value = newValue;
        }
    }

    /**
     * Visar displayen
     * @return
     */
    public String getDisplayValue() {
        String display = Integer.toString(value);
        if (value < 10) {
            display = "0" + display;
        }
        return display;
    }

    /**
     * Adderar minuter
     */
    public void increment() {
        value++;
        if (value == limit) {
            setValue(0);
        }
    }
}


