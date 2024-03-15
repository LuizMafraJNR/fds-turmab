import domain.model.Cidade;
import domain.model.Cliente;
import domain.model.Pokemon;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Nome do Cliente", "Endereço do Cliente");
        Pokemon pokemon1 = new Pokemon("Pikachu");
        Pokemon pokemon2 = new Pokemon("Charmander");
        Cidade cidade = new Cidade("Joinville");
        cliente.setCidade(cidade);

       cliente.getListaPokemons().add(pokemon1);
       cliente.getListaPokemons().add(pokemon2);

        System.out.println(cliente.toString());
    }

}