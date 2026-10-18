package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The Team class represents one team in the Draw It or Lose It application.
 *
 * Team extends Entity, which means it inherits the common id and name
 * attributes as well as the getId() and getName() methods.
 *
 * Each Team can contain multiple Player objects.
 *
 * @author coce@snhu.edu
 */
public class Team extends Entity {

	/**
	 * Stores all players that belong to this team.
	 */
	private List<Player> players = new ArrayList<Player>();

	/**
	 * Creates a new Team object with a unique ID and name.
	 *
	 * The super() call sends the ID and name to the Entity constructor.
	 *
	 * @param id unique identification number assigned to the team
	 * @param name unique name assigned to the team
	 */
	public Team(long id, String name) {
		super(id, name);
	}

	/**
	 * Adds a player to this team.
	 *
	 * The Iterator pattern is used to search through the existing players
	 * before creating a new Player object. This prevents two players on the
	 * same team from having the same name.
	 *
	 * @param name name of the player to add
	 * @return the existing Player or the newly created Player
	 */
	public Player addPlayer(String name) {

		// Local variable for the Player that will be returned.
		Player player = null;

		// Create an iterator to search through the existing players.
		Iterator<Player> iterator = players.iterator();

		while (iterator.hasNext()) {

			// Get the next Player object.
			Player existingPlayer = iterator.next();

			// Check whether a player with this name already exists.
			if (existingPlayer.getName().equals(name)) {
				return existingPlayer;
			}
		}

		/*
		 * If no matching player was found, create a new Player.
		 * GameService provides the next unique player ID.
		 */
		if (player == null) {
			player = new Player(
					GameService.getInstance().getNextPlayerId(),
					name);

			// Add the new player to this team's player list.
			players.add(player);
		}

		return player;
	}

	/**
	 * Creates a readable String representation of the Team object.
	 *
	 * getId() and getName() are inherited from Entity.
	 *
	 * @return a String containing the team's ID and name
	 */
	@Override
	public String toString() {
		return "Team [id=" + getId() + ", name=" + getName() + "]";
	}
}