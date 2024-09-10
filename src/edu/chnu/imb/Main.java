package edu.chnu.imb;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
	public static void main(String[] args) {
		HumanIMB humanIMB = new HumanIMB(89, 1.83);
		System.out.println(humanIMB.getResult());
	}
}