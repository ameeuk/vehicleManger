package vehicle;

import maker.Maker;

public class VList {
	Vehicle vlist[];
	int index=0;
	
	public VList(int n)
	{
		vlist = new Vehicle[n];
		vlist[index++] = new Bike(1234, "블랙캣", 1998, 5, new Maker(5, "첼로스포츠"));
		vlist[index++] = new Bike(1235, "레스포", 2001, 1, new Maker(1, "삼천리"));
		vlist[index++] = new Bike(1236, "알로빅스", 2006, 2, new Maker(2, "알톤"));
		vlist[index++] = new Bike(1237, "지브라", 2007, 4, new Maker(4, "디엠스포츠"));
		vlist[index++] = new Skate(2345, "포뮬라88", 2010, 6, new Maker(6, "Rollerblade"));
		vlist[index++] = new Skate(1235, "지노비", 2007, 4, new Maker(4, "디엠스포츠"));
		
	}
	
	public void addVehicle(Vehicle vehicle)
	{
		vlist[index++]=vehicle;
	}
	
	public void showBikeData()
	{
		for(int i=0;i<index;i++)
			if(vlist[i] instanceof Bike)
				vlist[i].showData();
	}
	
	public void showSkateData()
	{
		for(int i=0;i<index;i++)
			if(vlist[i] instanceof Skate)
				vlist[i].showData();
	}
	
	public void showData()
	{
		for(int i=0;i<index;i++){
			if(vlist[i] instanceof Bike)
				{System.out.print("자전거   ");vlist[i].showData();}
			else
				{System.out.print("인라인   ");vlist[i].showData();}
		}
	}

}
