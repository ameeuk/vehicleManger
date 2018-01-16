package vehicle;

import showAble.ShowAble;
import maker.Maker;

public class Bike extends Vehicle implements ShowAble
{
	public Bike(int id, String brand, int p_day, int maker_id,Maker maker) {
		super(id, brand, p_day, maker_id, maker);
		// TODO Auto-generated constructor stub
	}

	public void showData()
	{
		System.out.println(id+"\t"+brand+"\t"+p_day+"\t"+maker_id+"\t"+maker.getName());
	}

}