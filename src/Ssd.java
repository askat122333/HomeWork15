public class Ssd {
    private double memoryVolume;
    private int howManyDisc;
    public Ssd(double memoryVolume, int howManyDisc){
        this.memoryVolume=memoryVolume;
        this.howManyDisc=howManyDisc;
    }

    public void setMemoryVolume(double memoryVolume){
        this.memoryVolume=memoryVolume;
    }
    public void setHowManyDisc(int howManyDisc){
        this.howManyDisc=howManyDisc;
    }


    public double getMemoryVolume(){
        return memoryVolume;
    }
    public int getHowManyDisc(){
        return howManyDisc;
    }

    @Override
    public String toString() {
        return "Ssd{" +
                "memoryVolume=" + memoryVolume +
                ", howManyDisc=" + howManyDisc +
                '}';
    }
}
