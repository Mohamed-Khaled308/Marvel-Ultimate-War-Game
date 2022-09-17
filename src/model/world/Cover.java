package model.world;

import java.awt.Point;

public class Cover implements Damageable {
	private int currentHP;
	private int maxHP;
	private Point location;

	public String toString() {
		return "HP: " + getCurrentHP();
	}

	public Cover(int x, int y) {
		this.currentHP = (int) ((Math.random() * 900) + 100);
		this.maxHP = currentHP;
		location = new Point(x, y);
	}

	public int getMaxHP() {
		return maxHP;
	}

	public int getCurrentHP() {
		return this.currentHP;
	}

	public void setCurrentHP(int newHp) {
		if (newHp < 0) {
			currentHP = 0;

		} else
			currentHP = newHp;
	}

	public Point getLocation() {
		return location;
	}

	public String getName() {
		return "Cover";
	}

}
