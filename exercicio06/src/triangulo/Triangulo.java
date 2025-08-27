package triangulo;

public class Triangulo {

    private Double cateto1;
    private Double cateto2;

    public Triangulo(Double cateto1, Double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public Double getCateto1() {
        return cateto1;
    }

    public void setCateto1(Double cateto1) {
        this.cateto1 = cateto1;
    }

    public Double getCateto2() {
        return cateto2;
    }

    public void setCateto2(Double cateto2) {
        this.cateto2 = cateto2;
    }

    public Double calcHipotenuse() {
        return Math.sqrt(Math.pow(this.cateto1, 2) + Math.pow(this.cateto2, 2));
    }
}
