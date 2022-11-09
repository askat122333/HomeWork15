public class Main {
    public static void main(String[] args) {
        Display myDisplay = new Display(15.6,"Asus","ips");
        Ssd mySsd = new Ssd(256,2);
        Ram myRam = new Ram(16,"Asus");
        UsbPort MyUsbPort = new UsbPort(3.0,"802.11ac");
        UsbPort MyUsbPort2 = new UsbPort(2.0,"882.15cv");
        String[] keys = {"Русский","English"};
        Keyboard myKeyboard = new Keyboard(keys,false,true);


        Notebook myNotebook = new Notebook(myDisplay,"Asus","Darck",
                mySsd,myRam,"RTX 3080 OC Edition",MyUsbPort,myKeyboard);
        System.out.println(myNotebook.toString());
    }
}