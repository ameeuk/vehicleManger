package maker;
import showAble.ShowAble;

public class Maker implements ShowAble{
	int maker_id;
	String name;
	
	public Maker(int maker_id, String name) {
		super();
		this.maker_id = maker_id;
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void showData()
	{
		System.out.println(maker_id+"\t"+name);
	}

}
