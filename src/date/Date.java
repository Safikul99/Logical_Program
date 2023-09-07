package date;

public class Date 
{
	int dd;
	int mm;
	int yy;
	int []month= {0,31,28,31,30 ,31,30 ,31,31,30,31 ,30,31};
	String [] dname= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		if(yy%4==0&&yy%100!=0||yy%400==0)
			month[2]=29;
		
	}
    int noOfDays()
    {
    	int y=yy-1;
    	int days=y*365+y/4-y/100+y/400;
    	for(int i=1;i<mm;i++)
    	{
    		days=days+month[i];
    	}
    	days=days+dd;
    	return days;
    }
    String dayName()
    {
    	int days=noOfDays();
    	return dname[days%7];
    }
}
