package vehicle;

import maker.Maker;

public class Vehicle
{
int id, p_day, maker_id;
String brand;
Maker maker;

	public Vehicle(int id, String brand,int p_day, int maker_id, Maker maker) {
		super();
		this.id = id;
		this.p_day = p_day;
		this.maker_id = maker_id;
		this.brand = brand;
		this.maker = maker;
}

	public void showData()
	{
		System.out.println(id+"\t"+brand+"\t"+p_day+"\t"+maker_id+"\t"+maker.getName());
	}
}