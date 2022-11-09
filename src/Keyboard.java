import java.util.Arrays;

public class Keyboard {
    private String[] layout;
    private boolean backlight;
    private boolean additionalDigits;

    public Keyboard(String[] layout, boolean backlight, boolean additionalDigits) {
        this.layout = layout;
        this.backlight = backlight;
        this.additionalDigits = additionalDigits;
    }

    public String[] getLayout() {
        return layout;
    }

    public void setLayout(String[] layout) {
        this.layout = layout;
    }

    public boolean isBacklight() {
        return backlight;
    }

    public void setBacklight(boolean backlight) {
        this.backlight = backlight;
    }

    public boolean isAdditionalDigits() {
        return additionalDigits;
    }

    public void setAdditionalDigits(boolean additionalDigits) {
        this.additionalDigits = additionalDigits;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "layout=" + Arrays.toString(layout) +
                ", backlight=" + backlight +
                ", additionalDigits=" + additionalDigits +
                '}';
    }
}
