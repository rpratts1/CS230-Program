package com.gamingroom;

/**
 * The ProgramDriver class starts and tests the
 * Draw It or Lose It application.
 *
 * This class demonstrates the following:
 *
 * 1. Accessing the GameService Singleton.
 * 2. Creating multiple Game objects.
 * 3. Creating Team objects inside a Game.
 * 4. Creating Player objects inside a Team.
 * 5. Preventing duplicate game, team, and player names.
 * 6. Verifying that the Singleton pattern is working.
 *
 * @author coce@snhu.edu
 */
public class ProgramDriver {

	/**
	 * Main entry point for the Java application.
	 *
	 * Java begins running the program from this method.
	 *
	 * @param args command-line arguments supplied when the program starts
	 */
	public static void main(String[] args) {

		/*
		 * Obtain the single shared GameService object.
		 *
		 * We use getInstance() instead of creating a new GameService
		 * because the GameService class uses the Singleton pattern.
		 */
		GameService service = GameService.getInstance();

		System.out.println("\nAbout to test initializing game data...");

		/*
		 * Create the first Game object.
		 *
		 * GameService automatically assigns a unique ID.
		 */
		Game game1 = service.addGame("Game #1");

		// Display the first game.
		System.out.println(game1);

		/*
		 * Create a second Game object.
		 */
		Game game2 = service.addGame("Game #2");

		// Display the second game.
		System.out.println(game2);

		/*
		 * Test the unique game-name requirement.
		 *
		 * Because "Game #1" already exists, addGame() should
		 * return the existing Game object instead of creating
		 * another one.
		 */
		Game duplicateGame = service.addGame("Game #1");

		System.out.println("\nTesting duplicate game name:");
		System.out.println(duplicateGame);

		/*
		 * Add teams to Game #1.
		 */
		System.out.println("\nAbout to test team data...");

		Team team1 = game1.addTeam("Team #1");
		System.out.println(team1);

		Team team2 = game1.addTeam("Team #2");
		System.out.println(team2);

		/*
		 * Test the unique team-name requirement.
		 *
		 * Because Team #1 already exists in this game,
		 * addTeam() should return the existing Team object.
		 */
		Team duplicateTeam = game1.addTeam("Team #1");

		System.out.println("\nTesting duplicate team name:");
		System.out.println(duplicateTeam);

		/*
		 * Add players to Team #1.
		 */
		System.out.println("\nAbout to test player data...");

		Player player1 = team1.addPlayer("Player #1");
		System.out.println(player1);

		Player player2 = team1.addPlayer("Player #2");
		System.out.println(player2);

		/*
		 * Test the unique player-name requirement.
		 *
		 * Because Player #1 already exists on this team,
		 * addPlayer() should return the existing Player object.
		 */
		Player duplicatePlayer = team1.addPlayer("Player #1");

		System.out.println("\nTesting duplicate player name:");
		System.out.println(duplicatePlayer);

		/*
		 * Create the SingletonTester object.
		 *
		 * This class requests GameService.getInstance() again.
		 * If the Singleton pattern works correctly, it will see
		 * the same games that were created above.
		 */
		SingletonTester tester = new SingletonTester();

		// Run the Singleton test.
		tester.testSingleton();
	}
}