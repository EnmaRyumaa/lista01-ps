package circulo;

public class Circunferencia {

    private Double raio;
    private final Double pi = 3.14;

    private Double comprimento;
    private Double area;
    private Double volume;

    public Circunferencia(Double raio) {
        this.raio = raio;
        calcArea();
        calcVolume();
        calcComprimento();
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    private void calcComprimento () {
        this.comprimento = this.raio * this.pi * 2;
    }

    private void calcArea () {
        this.area = this.pi * Math.pow(this.raio, 2);
    }

    private void calcVolume () {
        this.volume = (3.0/4.0) * pi * Math.pow(this.raio, 3);
    }

    @Override
    public String toString() {
        return "comprimento = " + comprimento +
                ", area = " + area +
                ", volume = " + volume;
    }
}
