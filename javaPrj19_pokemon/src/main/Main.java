package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("==== POKEMON ====");
		
		
		//객체 만들기 및 변수 선언
		//포켓몬 3마리 생성
		Pokemon p1 = new Pokemon();
		Pokemon p2 = new Pokemon();
		Pokemon p3 = new Pokemon();
		
		// 객체 멤버변수에 값 할당
		p1.name = "피카츄";
		p1.hp = 100;
		p1.atk = 10;

		p2.name = "꼬부기";
		p2.hp = 120;
		p2.atk = 5;
		
		p3.name = "파이리";
		p3.hp = 80;
		p3.atk = 15;
		
		//포켓몬 목록 출력
		p1.printInfo();
		p2.printInfo();
		p3.printInfo();
		
		//숫자 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("원하시는 포켓몬 번호 입력 : ");
		int num = sc.nextInt();
		
		//유저, 컴퓨터(적) 포켓몬 선택
		Pokemon enemy = null;
		Pokemon user = null;
		// 아무것도 안골랐으니 null, 빈공간으로 둘것
		switch(num) {
		case 1 : 
			user = p1;
			enemy = p2;
			break;
		case 2 : 
			user = p2;	
			enemy = p3;
			break;
		case 3 : 
			user = p3;	
			enemy = p1;
			break;
		}//switch /
		
		
		//객체 값 확인
		System.out.println();
		p1.printInfo();
		System.out.println();
		p2.printInfo();
		System.out.println();
		
		
		//battle
		while(user.hp > 0 &&
				enemy.hp > 0) {
			user.bodyAttack();
			enemy.bodyAttack();
			System.out.println(user.name + " vs " + enemy.name); //p1 -> name/ p2 -> enemy
//			System.out.println("!!! 피카츄가 꼬부기를 때림 !!!");
//			System.out.println("!!! 꼬부기가 피카츄를 때림 !!!");
			user.hp -= enemy.atk;
			enemy.hp -= user.atk;
			
			//check info
			System.out.println("------ 치고받은 결과 ------");
			user.printInfo();
			enemy.printInfo();
			
			
		}//while /
		
		System.out.println("===== END =====");
		
	}//main

}//class
