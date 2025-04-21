package main;

public class Pokemon {

	//member var
	String name;
	int hp;
	int atk;
	
	
	//member method
	
	public void printInfo() {
		//출력문으로 변수 값들 출력
		System.out.println(name + " / " + hp + " / " + atk);
	}//printInfo
	
	public void bodyAttack() {
		System.out.println(name + " 의 몸통박치기 ~ !!!");
	}
	
	
}//class
