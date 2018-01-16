package mainMenu;

import java.util.Scanner;


import vehicle.Bike;
import vehicle.Skate;
import vehicle.VList;
import maker.MList;

public class MainMenu {

	public static void main(String[] args) {
		Menu mn = new Menu();
		mn.issueMenu();

	}

}

class Menu
{
	MList ml = new MList(10);
	VList vl = new VList(10);
	
	int id,p_day,maker_id;
	String brand;
	
	public void issueMenu()
	{
		int sel;
		Scanner scan =new Scanner(System.in);
		
	while(true)
	{
		System.out.println("--------메 뉴--------");
		System.out.println(" 1. 자전거추가");
		System.out.println(" 2. 자전거목록출력");
		System.out.println(" 3. 인라인추가");
		System.out.println(" 4. 인라인목록출력");
		System.out.println(" 5. 전체목록출력");
		System.out.println(" 0. 종료");
		System.out.println("---------------------");
		System.out.print(" 선택>>");
		sel=scan.nextInt();
		switch(sel)
		{
		case 0:
			return;
		case 1:
			System.out.println(" - I D: ");
			id = scan.nextInt();
			scan.nextLine();
			System.out.println(" - 이름: ");
			brand = scan.nextLine();
			System.out.println(" - 연식: ");
			p_day = scan.nextInt();
			System.out.println(" - Maker_ID: ");
			maker_id = scan.nextInt();
			vl.addVehicle(new Bike(id,brand,p_day,maker_id,ml.getMaker(maker_id)));
			break;
		case 2:
			System.out.println("<자전거목록>");
			System.out.println("-------------------------------------------------------");
			System.out.println("자전거_ID   브랜드   연식   제조사_ID   제조사_이름");
			System.out.println("-------------------------------------------------------");
			vl.showBikeData();
			System.out.println("-------------------------------------------------------");
			break;
		case 3:
			System.out.println(" - I D: ");
			id = scan.nextInt();
			scan.nextLine();
			System.out.println(" - 이름: ");
			brand = scan.nextLine();
			System.out.println(" - 연식: ");
			p_day = scan.nextInt();
			System.out.println(" - Maker_ID: ");
			maker_id = scan.nextInt();
			vl.addVehicle(new Skate(id,brand,p_day,maker_id,ml.getMaker(maker_id)));
			break;
		case 4:
			System.out.println("<인라인목록>");
			System.out.println("-------------------------------------------------------");
			System.out.println("인라인_ID   브랜드   연식   제조사_ID   제조사_이름");
			System.out.println("-------------------------------------------------------");
			vl.showSkateData();
			System.out.println("-------------------------------------------------------");
			break;
		case 5:
			System.out.println("<전체목록>");
			System.out.println("--------------------------------------------------------------");
			System.out.println("구분   자전거_ID   브랜드   연식   제조사_ID   제조사_이름");
			System.out.println("--------------------------------------------------------------");
			vl.showData();
			System.out.println("--------------------------------------------------------------");
			break;
		
		}
		
	}
		
	}
}