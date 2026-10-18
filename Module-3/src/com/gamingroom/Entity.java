package com.gamingroom;

/**
 * The Entity class is the base class for common game objects.
 *
 * Game, Team, and Player will inherit from this class. Each of those
 * objects needs a unique identification number and a name, so those
 * shared attributes are stored here instead of being repeated in
 * every class.
 *
 * Using a common base class demonstrates inheritance and helps make
 * the application easier to organize and maintain.
 */
public class Entity {

	/**
	 * Stores the unique identification number for this entity.
	 */
	private long id;

	/**
	 * Stores the name assigned to this entity.
	 */
	private String name;

	/**
	 * Private default constructor.
	 *
	 * This prevents an Entity object from being created without
	 * providing an ID and name.
	 */
	private Entity() {
	}

	/**
	 * Creates an Entity with a unique ID and name.
	 *
	 * @param id   unique identification number for the entity
	 * @param name name assigned to the entity
	 */
	public Entity(long id, String name) {

		// Call the private default constructor.
		this();

		// Store the supplied identification number.
		this.id = id;

		// Store the supplied name.
		this.name = name;
	}

	/**
	 * Returns the unique ID assigned to this entity.
	 *
	 * @return the entity's ID
	 */
	public long getId() {

		// Return the stored ID.
		return id;
	}

	/**
	 * Returns the name assigned to this entity.
	 *
	 * @return the entity's name
	 */
	public String getName() {

		// Return the stored name.
		return name;
	}

	/**
	 * Creates a readable String representation of the Entity object.
	 *
	 * @return a String containing the entity's ID and name
	 */
	@Override
	public String toString() {

		// Return the basic information stored in this Entity.
		return "Entity [id=" + id + ", name=" + name + "]";
	}
}