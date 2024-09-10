package edu.chnu.imb;

public class HumanIMB {
	private double weight; // Weight Human
	private double height; // Height Human
	private double imb; // Body Mass Index 

	public HumanIMB(double weight, double height) {
		this.weight = weight;
		this.height = height;
		calcImb();
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double w) {
		weight = w;
		calcImb();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double h) {
		height = h;
		calcImb();
	}

	public double getImb() {
		return imb;
	}

	private void calcImb() {
		if (height == 0) {
            throw new IllegalArgumentException("Height cannot be zero.");
        }
		imb = weight / (height * height);
	}

	public String getResult() {
		String string = null;
		if (imb < 18.5) {
			string = "Deficit";
		} else if (imb >= 18.5 && imb < 25) {
			string = "Norm";
		} else if (imb >= 25 & imb < 30) {
			string = "Warning! ";
		} else if (imb >= 30) {
			string = "Fat";
		}

		return string;
	}
}
