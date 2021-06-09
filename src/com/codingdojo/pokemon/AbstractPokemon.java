package com.codingdojo.pokemon;

public abstract class AbstractPokemon implements PokemonInterface{
	
	
	// Create a new Pokemon
	public Pokemon createPokemon(String name, int health, String type) {
		return new Pokemon(name, health, type);
	}
	
	
	// Display a Pokemon's information
	public String pokemonInfo(Pokemon pokemon) {
		return ("Name: " + pokemon.getName() + " Health: " + pokemon.getHealth() + " Type: " + pokemon.getType());
	}
}
