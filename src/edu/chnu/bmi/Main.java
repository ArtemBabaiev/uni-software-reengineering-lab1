package edu.chnu.bmi;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
	public static void main(String[] args) {
		HumanBMI humanIMB = new HumanBMI(89, 1.84);
		System.out.println(humanIMB.getResult().getLabel());
	}
}