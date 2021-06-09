package com.codingdojo.pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	
	// Create new ArrayList of Pokemon objects
	ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();
	
	
	// Add Pokemon to ArrayList
	public void addPokemon(Pokemon pokemon) {
		this.myPokemons.add(pokemon);
	}

	
	// Print a list of all Pokemon in the Pokedex
	public void listPokemon() {
		System.out.println(" ------- List of all the Pokemons ------- ");
		for (Pokemon pokemon: this.myPokemons) {
			System.out.println(pokemonInfo(pokemon));
		}
	}

}
