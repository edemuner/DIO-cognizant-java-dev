public class Endereco {

    public enum TipoEndereco{
        RESIDENCIAL,
        ENTREGA,
        PROFISSIONAL
    }

    public String logradouro;
    public String bairro;
    public String municipio;
    public String unidadeFederativa;
    public String pais;
    public String cep;
}
