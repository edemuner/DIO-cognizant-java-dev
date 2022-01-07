public abstract class Conta implements Iconta{

    protected static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo = 0d;
    private static int SEQUENCIAL = 1;

    public Conta() {
        agencia = AGENCIA_PADRAO;
        numero = SEQUENCIAL++;
    }




    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }
}
