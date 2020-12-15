package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance
{
	private int powerConsumption;
	private int weight;
	private int capacity;
	private int depth;
	private float height;
	private float width;

	public Oven(int powerConsumption, int weight, int capacity, int depth, float height, float width)
	{
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
		this.height = height;
		this.width = width;
	}

	@Override
	public String toString()
	{
		return "Oven : " +
				"powerConsumption = " + powerConsumption +
				", weight = " + weight +
				", capacity = " + capacity +
				", depth = " + depth +
				", height = " + height +
				", width = " + width;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Oven oven = (Oven) o;
		return powerConsumption == oven.powerConsumption &&
				weight == oven.weight &&
				capacity == oven.capacity &&
				depth == oven.depth &&
				height == oven.height &&
				width == oven.width;
	}

	@Override
	public int hashCode() {
		return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
