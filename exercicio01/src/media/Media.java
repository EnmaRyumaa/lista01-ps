package media;

public class Media {

    private Double numberOne, numberTwo, numberThree;

    public Media(Double numberOne, Double numberTwo, Double numberThree) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
    }

    public Double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(Double numberOne) {
        this.numberOne = numberOne;
    }

    public Double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(Double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public Double getNumberThree() {
        return numberThree;
    }

    public void setNumberThree(Double numberThree) {
        this.numberThree = numberThree;
    }

    public Double makeMedia() {
        return (numberOne + numberTwo + numberThree)/3 ;
    }
}
