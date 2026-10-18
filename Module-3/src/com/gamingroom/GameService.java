package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The GameService class manages all of the games used by the application.
 *
 * This class uses the Singleton design pattern. The Singleton pattern makes
 * sure that only one GameService object can exist while the program is running.
 *
 * Having only one GameService object is useful because all parts of the
 * application will work with the same list of games instead of creating
 * separate copies of the game data.
 *
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * Stores all active Game objects.
	 *
	 * The ArrayList allows multiple Game objects to be stored together.
	 * The List interface is used as the variable type so the implementation
	 * could be changed later without changing the rest of the program.
	 */
	private static List<Game> games = new ArrayList<Game>();

	/**
	 * Stores the ID that will be assigned to the next game that is created.
	 *
	 * The value begins at 1. Each time a new game is created, nextGameId
	 * is increased so every game receives its own unique identification number.
	 */
	private static long nextGameId = 1;

	/**
	 * Holds the next unique team identifier.
	 */
	private static long nextTeamId = 1;

	/**
	 * Holds the next unique player identifier.
	 */
	private static long nextPlayerId = 1;

	/*
	 * Singleton Design Pattern
	 *
	 * This variable stores the one GameService object that will be shared
	 * throughout the entire application.
	 *
	 * It is static because it belongs to the GameService class itself rather
	 * than to an individual GameService object.
	 *
	 * It begins as null because the GameService object has not been created yet.
	 */
	private static GameService instance = null;

	/**
	 * Private constructor for the GameService class.
	 *
	 * Making the constructor private prevents other classes from using:
	 *
	 * new GameService()
	 *
	 * This is an important part of the Singleton pattern because it prevents
	 * multiple GameService objects from being created.
	 */
	private GameService() {
	}

	/**
	 * Returns the single GameService instance used by the application.
	 *
	 * The first time this method is called, instance is null, so a new
	 * GameService object is created.
	 *
	 * Every call after that returns the same GameService object that was
	 * already created.
	 *
	 * @return the single shared GameService instance
	 */
	public static GameService getInstance() {

		// Check whether the Singleton object has been created yet.
		if (instance == null) {

			// Create the GameService object only the first time it is needed.
			instance = new GameService();
		}

		// Return the same GameService object each time this method is called.
		return instance;
	}

	/**
	 * Adds a new game to the list of active games.
	 *
	 * Before creating a game, this method searches the existing games to make
	 * sure another game with the same name does not already exist.
	 *
	 * If a matching game is found, the existing Game object is returned.
	 * Otherwise, a new Game object is created and added to the list.
	 *
	 * @param name the unique name of the game
	 * @return the existing game or the newly created game
	 */
	public Game addGame(String name) {

		// Local variable that will hold the game that will be returned.
		Game game = null;

		/*
		 * Iterator Design Pattern
		 *
		 * An Iterator provides a standard way to move through each Game object
		 * stored inside the games collection.
		 *
		 * The iterator lets the program examine the objects one at a time
		 * without needing to directly manage the internal structure of the list.
		 *
		 * Here, the iterator is used to check whether a game with the requested
		 * name already exists before creating another game.
		 */
		Iterator<Game> iterator = games.iterator();

		// Continue looping while another Game object is available.
		while (iterator.hasNext()) {

			// Retrieve the next Game object from the collection.
			Game existingGame = iterator.next();

			/*
			 * Compare the existing game's name with the requested game name.
			 *
			 * Strings are compared with equals() instead of == because equals()
			 * compares the actual text stored inside the String objects.
			 */
			if (existingGame.getName().equals(name)) {

				/*
				 * A game with this name already exists, so return that object
				 * instead of creating a duplicate.
				 */
				return existingGame;
			}
		}

		/*
		 * If the iterator did not find an existing game, the game variable
		 * will still be null.
		 */
		if (game == null) {

			/*
			 * Create a new Game.
			 *
			 * nextGameId++ gives the current ID to the new Game and then
			 * increases nextGameId for the next game that will be created.
			 */
			game = new Game(nextGameId++, name);

			// Add the newly created game to the list of active games.
			games.add(game);
		}

		// Return either the new game or an existing game.
		return game;
	}

	/**
	 * Returns a Game object based on its position in the games list.
	 *
	 * This method has package-level access because it is used by the
	 * SingletonTester class when displaying the games.
	 *
	 * @param index position of the Game object inside the list
	 * @return the Game stored at the requested index
	 */
	Game getGame(int index) {

		// Retrieve and return the Game stored at the requested position.
		return games.get(index);
	}

	/**
	 * Searches for a Game using its unique ID number.
	 *
	 * An Iterator is used to examine every Game object until a matching ID
	 * is found.
	 *
	 * @param id unique game identification number to search for
	 * @return the matching Game object, or null if no matching game exists
	 */
	public Game getGame(long id) {

		// Start with null because a matching game has not been found yet.
		Game game = null;

		// Create an iterator for moving through the list of games.
		Iterator<Game> iterator = games.iterator();

		// Continue while there are more games available.
		while (iterator.hasNext()) {

			// Retrieve the next game from the collection.
			Game existingGame = iterator.next();

			/*
			 * Compare the current game's ID with the ID being requested.
			 *
			 * The == operator is appropriate here because id is a primitive
			 * long value.
			 */
			if (existingGame.getId() == id) {

				// Save the matching Game object.
				game = existingGame;

				/*
				 * Stop searching because the game has already been found
				 * and each game should have a unique ID.
				 */
				break;
			}
		}

		/*
		 * Return the matching game.
		 *
		 * If no matching ID was found, game remains null.
		 */
		return game;
	}

	/**
	 * Searches for a Game using its name.
	 *
	 * An Iterator is used to examine every Game object until a matching
	 * name is found.
	 *
	 * @param name name of the game to search for
	 * @return the matching Game object, or null if no matching game exists
	 */
	public Game getGame(String name) {

		// Start with null because a matching game has not been found yet.
		Game game = null;

		// Create an iterator to move through all Game objects.
		Iterator<Game> iterator = games.iterator();

		// Continue while another Game object exists in the collection.
		while (iterator.hasNext()) {

			// Retrieve the next game.
			Game existingGame = iterator.next();

			// Compare the existing game's name with the requested name.
			if (existingGame.getName().equals(name)) {

				// Store the matching Game object.
				game = existingGame;

				// Stop searching because the requested game was found.
				break;
			}
		}

		/*
		 * Return the matching Game object.
		 *
		 * If no matching game was found, this will return null.
		 */
		return game;
	}

	/**
	 * Returns the total number of active games.
	 *
	 * @return number of Game objects currently stored in the games list
	 */
	public int getGameCount() {

		// size() returns the number of elements stored in the list.
		return games.size();
	}

	/**
	 * Returns the next unique team ID and then increases the value
	 * so the following team receives a different ID.
	 *
	 * @return the next unique team ID
	 */
	public long getNextTeamId() {
		return nextTeamId++;
	}

	/**
	 * Returns the next unique player ID and then increases the value
	 * so the following player receives a different ID.
	 *
	 * @return the next unique player ID
	 */
	public long getNextPlayerId() {
		return nextPlayerId++;
	}
}