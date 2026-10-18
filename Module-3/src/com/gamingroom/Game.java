package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The Game class represents one game in the Draw It or Lose It application.
 *
 * Game extends Entity, which means it inherits the common id and name
 * attributes and the getId() and getName() methods.
 *
 * Each Game can contain multiple Team objects.
 */
public class Game extends Entity {

	/**
	 * Stores all teams that belong to this game.
	 */
	private List<Team> teams = new ArrayList<Team>();

	/**
	 * Creates a new Game object with a unique ID and name.
	 *
	 * The super() call sends the ID and name to the Entity constructor.
	 *
	 * @param id unique identification number assigned to the game
	 * @param name unique name assigned to the game
	 */
	public Game(long id, String name) {
		super(id, name);
	}

	/**
	 * Adds a team to this game.
	 *
	 * The Iterator pattern is used to search through the existing teams
	 * before creating a new Team object. This prevents two teams in the
	 * same game from having the same name.
	 *
	 * @param name name of the team to add
	 * @return the existing Team or the newly created Team
	 */
	public Team addTeam(String name) {

		// Local variable for the Team that will be returned.
		Team team = null;

		// Create an iterator to search through the existing teams.
		Iterator<Team> iterator = teams.iterator();

		while (iterator.hasNext()) {

			// Get the next Team object.
			Team existingTeam = iterator.next();

			// Check whether a team with this name already exists.
			if (existingTeam.getName().equals(name)) {
				return existingTeam;
			}
		}

		/*
		 * If no matching team was found, create a new Team.
		 * GameService provides the next unique team ID.
		 */
		if (team == null) {
			team = new Team(
					GameService.getInstance().getNextTeamId(),
					name);

			// Add the new team to this game's team list.
			teams.add(team);
		}

		return team;
	}

	/**
	 * Creates a readable String representation of the Game object.
	 *
	 * getId() and getName() are inherited from Entity.
	 *
	 * @return a String containing the game's ID and name
	 */
	@Override
	public String toString() {
		return "Game [id=" + getId() + ", name=" + getName() + "]";
	}
}