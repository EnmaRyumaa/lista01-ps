package losango;

public class Losango {

    private Double diagonalMenor;
    private Double diagonalMaior;

    public Losango(Double x, Double y) {
        diagonalMenor = x;
        diagonalMaior = y;
    }

    public Double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(Double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public Double getDiagonalMaior() {
        return diagonalMaior;
    }

    public void setDiagonalMaior(Double diagonalMaior) {
        this.diagonalMaior = diagonalMaior;
    }

    public Double losangoArea() {
        return (diagonalMaior * diagonalMenor) / 2.0;
    }
}
