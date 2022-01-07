public class Main {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente(new Cliente("Eduardo"));
        Conta cp = new ContaPoupanca(new Cliente("Alice"));

        cc.depositar(100);
        cc.transferir(50, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
