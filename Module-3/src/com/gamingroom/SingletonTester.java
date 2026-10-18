package com.gamingroom;

/**
 * The SingletonTester class demonstrates that the GameService Singleton
 * is working correctly.
 *
 * ProgramDriver previously creates games using a GameService reference.
 * This class obtains another GameService reference by calling getInstance().
 *
 * If both classes can see the same games, this demonstrates that they are
 * accessing the same GameService Singleton object.
 *
 * @author coce@snhu.edu
 */
public class SingletonTester {

	/**
	 * Tests the Singleton behavior of GameService.
	 */
	public void testSingleton() {

		// Display a message showing that the Singleton test is starting.
		System.out.println("\nAbout to test the singleton...");

		/*
		 * Request the GameService Singleton.
		 *
		 * Because getInstance() always returns the same GameService object,
		 * this reference should point to the exact same service that was
		 * previously used inside ProgramDriver.
		 */
		GameService service = GameService.getInstance();

		/*
		 * Loop through all games stored in the GameService.
		 *
		 * getGameCount() determines how many games are currently stored.
		 */
		for (int i = 0; i < service.getGameCount(); i++) {

			/*
			 * Retrieve each Game object according to its position in the list
			 * and print it to the Console.
			 *
			 * Seeing Game #1 and Game #2 here proves that SingletonTester
			 * received access to the same GameService data that ProgramDriver
			 * used earlier.
			 */
			System.out.println(service.getGame(i));
		}
	}
}