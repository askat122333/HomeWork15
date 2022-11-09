public class Ram {
    private double volume;
    private String producer;


    public Ram(double volume, String producer){
        this.volume = volume;
        this.producer= producer;
    }


    public void setVolume(double volume){
        this.volume = volume;
    }
    public void setProducer(String producer){
        this.producer = producer;
    }


    public double getVolume(){
        return volume;
    }
    public String getProducer(){
        return producer;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "volume=" + volume +
                ", producer='" + producer + '\'' +
                '}';
    }
}
