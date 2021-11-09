/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	BASKET(5, "Basket", Place.INDOOR), 
	VOLLEY(5, "Volley", Place.INDOOR),
	TENNIS(1, "Tennis", Place.INDOOR),
	BIKE(1, "Bike", Place.OUTDOOR),
	F1(1, "F1", Place.OUTDOOR),
	MOTOGP(1, "MotoGP", Place.OUTDOOR),
	SOCCER(11, "Soccer", Place.INDOOR);
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	
	private final int members;
	private final String name;
	private final Place type;

    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	
	private Sport(int members, String name, Place type) {
		this.members = members;
		this.name = name;
		this.type = type;
	}
	
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	
	public boolean isIndividualSport() {
		if(this.members == 1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isIndoorSport() {
		if(this.type == Place.INDOOR) {
			return true;
		}else {
			return false;
		}
	}
	
	public Place getPlace() {
		return this.type;
	}
	
	public String toString() {
		
		System.out.println("Sport name: " + this.name +
							"Players for team: " + this.members +
							"Type of Sport: " + this.type);
		
		return "";
	}
}
