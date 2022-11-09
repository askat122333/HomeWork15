public class Display {
    private double diagonal;
    private String producer;
    private String matrixType;

    public Display(double diagonal, String producer, String matrixType) {
        this.diagonal = diagonal;
        this.producer = producer;
        this.matrixType = matrixType;
    }


    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;

    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getProducer() {
        return producer;
    }

    public String getMatrixType() {
        return matrixType;
    }

    @Override
    public String toString() {
        return "Display{" +
                "diagonal=" + diagonal +
                ", producer='" + producer + '\'' +
                ", matrixType='" + matrixType + '\'' +
                '}';
    }
}
