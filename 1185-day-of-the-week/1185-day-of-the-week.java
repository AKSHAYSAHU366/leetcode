class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int months[]={3,0,3,2,3,2,3,3,2,3,2,3};
        String days[]={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        // int date=2;
        // int moth=12;
        // int year=2001;
        if((year%4==0))
        {
            if((year%100==0)&&(year%400==0)){
                months[1] = 1;
            }else if(year % 100 != 0){
                months[1] = 1;
            }
        }
        
        int year1=(year-1)%400;
        int y1=year1/100;
        int y2=year1%100;
        int odd_days=(y1*5)%7 + (y2+(y2/4))%7;
        int odd_days1=odd_days%7;
        System.out.println("years odd days are: "+ odd_days1);
        int count=0;
        for(int i=0;i<month-1;i++)
        {
            count=count+months[i];  
        }
        // count=count%7;
        odd_days=(odd_days +count + day)%7;
        // System.out.println("Total odd months days : " + (count+date)%7);
        // System.out.println("Days is : "+days[odd_days]);
        return days[odd_days];
        
    }
}