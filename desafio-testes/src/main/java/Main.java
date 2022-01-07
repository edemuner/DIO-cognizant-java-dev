public class Main {
    public static void main(String[] args) {
        //Digite o seu código aqui
        for (int i = 0; i < 39; i++){
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < 5; i++){
            System.out.print("|");
            for (int j= 0; j < 37; j++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
        for (int i = 0; i < 39; i++){
            System.out.print("-");
        }
    }
}