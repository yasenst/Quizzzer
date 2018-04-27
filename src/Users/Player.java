package Users;

import java.util.ArrayList;
import java.util.List;

public class Player extends User implements Punishable {
	private int points;
	private List<Badge> badges;
	
	// if there's no such player, create a new player
	public Player(String userName) {
		this(userName, 0, new ArrayList<>());
	}
	
	// if player exists, get his data from ranklist
	public Player(String userName, int points, List<Badge> badges) {
		super(userName);
		this.points = points;
		this.badges = badges;
	}

	@Override
	public void decreasePoints(int pointsToDeduct) {
		if (points <= pointsToDeduct) {
			points = 0;
		} else {
			points -= pointsToDeduct;
		}
	}
	
	
}