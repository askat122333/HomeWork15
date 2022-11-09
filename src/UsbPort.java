public class UsbPort {
    private double typeOfPort;
    private String idOfPort;

    public UsbPort(double typeOfPort,String idOfPort){
        this.typeOfPort=typeOfPort;
        this.idOfPort=idOfPort;
    }

    public void setTypeOfPort(double typeOfPort){
        this.typeOfPort=typeOfPort;
    }
    public void setIdOfPort(String idOfPort){
        this.idOfPort=idOfPort;
    }


    public double getTypeOfPort(){
        return typeOfPort;
    }
    public String getIdOfPort(){
        return idOfPort;
    }

    @Override
    public String toString() {
        return "UsbPort{" +
                "typeOfPort=" + typeOfPort +
                ", idOfPort='" + idOfPort + '\'' +
                '}';
    }
}
