package vehicle;

import showAble.ShowAble;
import maker.Maker;

public class Skate extends Vehicle implements ShowAble
{

	public Skate(int id, String brand, int p_day, int maker_id, Maker maker) {
		super(id, brand, p_day, maker_id, maker);
	}

	public void showData()
	{
		System.out.println(id+"\t"+brand+"\t"+p_day+"\t"+maker_id+"\t"+maker.getName());
	}
}