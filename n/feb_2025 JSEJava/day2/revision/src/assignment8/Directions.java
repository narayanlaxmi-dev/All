package assignment8;

public enum Directions {
	NORTH, SOUTH, EAST, WEST;

	public Directions oppositeDirection() {
		switch (this) {
		case NORTH:
			return SOUTH;
		case SOUTH:
			return NORTH;
		case EAST:
			return WEST;
		case WEST:
			return EAST;
		default:
			System.out.println("Error please valid input");
			;
		}
		return null;

	}
}
