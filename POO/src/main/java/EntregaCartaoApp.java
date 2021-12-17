import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {


        Endereco endereco = new Endereco();
        Cliente cliente = new Cliente();

        if (cliente.enderecos == null) {
            cliente.enderecos = new ArrayList<Endereco>();
        }

        cliente.enderecos.add(endereco);
        System.out.println("Endereço adicionado com sucesso");

    }

}
