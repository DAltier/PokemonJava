package com.codingdojo.pokemon;

public class PokemonTest extends Pokedex {

	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		
		
		// Create new pokemons
		Pokemon pikachu = pokedex.createPokemon("Pikachu", 50, "electric");
		Pokemon squirtle = pokedex.createPokemon("Squirtle", 75, "water");
		Pokemon raichu = pokedex.createPokemon("Raichu", 80, "electric");
		Pokemon paras = pokedex.createPokemon("Paras", 25, "bug");
		
		
		// Add pokemons to pokedex
		pokedex.addPokemon(pikachu);
		pokedex.addPokemon(squirtle);
		pokedex.addPokemon(raichu);
		pokedex.addPokemon(paras);
		
		
		// List all the pokemons in the pokedex
		pokedex.listPokemon();
		
		
		// Attack Pokemon
		pikachu.attackPokemon(raichu);
		pokedex.listPokemon();

	}

}
