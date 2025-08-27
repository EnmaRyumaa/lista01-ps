package temperatura;

public class Temperatura {

    private Double temperatura;

    public Temperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Double conversaoTemperatura() {
        return (this.temperatura * 1.8) + 32;
    }
}
