import java.util.Arrays;

public class Notebook {
    private Display display;
    private String brand;
    private String color;
    private Ssd  ssd;
    private Ram ram;
    private String videoCard;
    private UsbPort usbPorts;
    private Keyboard keyboard;

    public Notebook(Display display, String brand,
                    String color, Ssd ssd,
                    Ram ram, String videoCard,
                    UsbPort usbPorts, Keyboard keyboard) {
        this.display = display;
        this.brand = brand;
        this.color = color;
        this.ssd = ssd;
        this.ram = ram;
        this.videoCard = videoCard;
        this.usbPorts = usbPorts;
        this.keyboard = keyboard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public UsbPort getUsbPorts() {
        return usbPorts;
    }

    public void setUsbPorts(UsbPort usbPorts) {
        this.usbPorts = usbPorts;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Сomputer{" +
                "display=" + display +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                "\n, ssd=" + ssd +
                ", ram=" + ram +
                ", videoCard='" + videoCard + '\'' +
                "\n, usbPorts=" + usbPorts +
                ", keyboard=" + keyboard +
                '}';
    }
}
