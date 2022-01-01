import javax.swing.*;

public class Exception_Customizada_2 {

    public static void main(String[] args) {

        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0;i < denominador.length; i++){
            try {
                if (numerador[i] % 2 != 0) throw new DivisaoNaoExataException(
                        "Divisão não exata", numerador[i], denominador[i]
                );
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch(DivisaoNaoExataException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException e){
                System.out.println(e.getMessage() + " - Impossível dividir por zero!");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage() + " - O número de numeradores e denominadores fornecidos é diferente!");
            }
            System.out.println("O programa continua");
        }
    }
}