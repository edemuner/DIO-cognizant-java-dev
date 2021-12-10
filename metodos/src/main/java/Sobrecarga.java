public class Sobrecarga {

    public double calculaArea(int lado){
        return lado * lado;
    }

    public double calculaArea(int lado1, int lado2){
        return lado1 * lado2;
    }

    public double calculaArea(int baseMaior, int baseMenor, int altura){
        return (double) ((baseMaior + baseMenor) * altura) / 2;
    }



}
