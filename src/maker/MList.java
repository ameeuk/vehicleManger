package maker;

public class MList {
	Maker mlist[];
	int index=0;
	
	public MList(int n)
	{
		mlist = new Maker[n];
		mlist[index++]=new Maker(1,"삼천리");
		mlist[index++]=new Maker(2,"알톤");
		mlist[index++]=new Maker(3,"K2");
		mlist[index++]=new Maker(4,"디엠스포츠");
		mlist[index++]=new Maker(5,"첼로스포츠");
		mlist[index++]=new Maker(6,"Rollerblade");
	}
	
	public Maker getMaker(int n)
	{
		return mlist[n-1];
	}
	
	public void showData(int n)
	{
		mlist[n-1].showData();
	}

}
