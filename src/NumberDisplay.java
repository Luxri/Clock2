public class NumberDisplay {
    protected int limit;
    protected int value;


    public NumberDisplay(int maxLimit) {
        value = 0;
        limit = maxLimit;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int newValue) {
        if (newValue < 0 && newValue > limit) {

        } else {
            this.value = newValue;
        }
    }
    public String getDisplayValue() {
        String display = Integer.toString(value);
        if (value < 10) {
            display = "0" + display;
        }
        return display;
    }
    public void increment() {
        value++;
        if (value == limit) {
            setValue(0);
        }
    }
}


