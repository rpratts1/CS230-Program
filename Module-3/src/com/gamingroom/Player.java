package com.gamingroom;

/**
 * The Player class represents one player in the
 * Draw It or Lose It application.
 *
 * Player extends Entity, which means it inherits the common id and name
 * attributes as well as the getId() and getName() methods.
 *
 * Using inheritance prevents the Player class from repeating code that is
 * already provided by the Entity base class.
 *
 * @author coce@snhu.edu
 */
public class Player extends Entity {

	/**
	 * Creates a new Player object with a unique ID and name.
	 *
	 * The super() call sends the player's ID and name to the
	 * Entity constructor, where those common values are stored.
	 *
	 * @param id unique identification number assigned to the player
	 * @param name unique name assigned to the player
	 */
	public Player(long id, String name) {

		// Call the Entity constructor to store the ID and name.
		super(id, name);
	}

	/**
	 * Creates a readable String representation of the Player object.
	 *
	 * The getId() and getName() methods are inherited from Entity.
	 *
	 * @return a String containing the player's ID and name
	 */
	@Override
	public String toString() {

		/*
		 * Return the Player information in a readable format.
		 *
		 * Example:
		 *
		 * Player [id=1, name=Player #1]
		 */
		return "Player [id=" + getId() + ", name=" + getName() + "]";
	}
}