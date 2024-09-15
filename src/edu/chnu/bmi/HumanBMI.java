package edu.chnu.bmi;

public class HumanBMI {
	private double weight; // Weight Human
	private double height; // Height Human
	private double bmi; // Body Mass Index 

	public HumanBMI(double weight, double height) {
		this.weight = weight;
		this.height = height;
		calcBMI();
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double w) {
		weight = w;
		calcBMI();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double h) {
		height = h;
		calcBMI();
	}

	public double getBMI() {
		return bmi;
	}

	private void calcBMI() {
		if (height == 0) {
            throw new IllegalArgumentException("Height cannot be zero.");
        }
		bmi = weight / (height * height);
	}

	public BMIResult getResult() {
		BMIResult string = null;
		if (bmi < 18.5) {
			string = BMIResult.DEFICIT;
		} else if (bmi >= 18.5 && bmi < 25) {
			string = BMIResult.NORM;
		} else if (bmi >= 25 & bmi < 30) {
			string = BMIResult.WARNING;
		} else if (bmi >= 30) {
			string = BMIResult.FAT;
		}

		return string;
	}
	
	public static enum BMIResult{
		DEFICIT("Deficit"), NORM("Norm"), WARNING("Warning!"), FAT("Fat");
		private String label;
		private BMIResult(String label) {
			this.label = label;
		}
		
		public String getLabel() {
			return this.label;
		}
	}
}
