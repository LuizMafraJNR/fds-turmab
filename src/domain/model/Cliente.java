package domain.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String endereco;
    private List<Pokemon> listaPokemons = new ArrayList<>();
    private Pokemon pokemon;
    private Cidade cidade;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Pokemon> getListaPokemons() {
        return listaPokemons;
    }

    public void setListaPokemons(List<Pokemon> listaPokemons) {
        this.listaPokemons = listaPokemons;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        // Make To String method return the name and the rest os the properties. The list of pokemons should be printed as a list of names.
        StringBuilder bd = new StringBuilder();
        bd.append("Nome: ").append(this.nome).append("\n");
        bd.append("Endereço: ").append(this.endereco).append("\n");
        bd.append("Cidade: ").append(this.cidade.getNome()).append("\n");
        bd.append("Pokemons: ").append("\n");
        for (Pokemon pokemon : this.listaPokemons) {
            bd.append(pokemon.getNome()).append("\n");
        }
        return bd.toString();
    }
}
