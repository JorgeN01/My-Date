import java.util.Scanner;
public class MyDate {
private int month, day;
String season;
public MyDate(int month, int day) {
this.month=month;
this.day=day;
}
public String getDate(){
switch(month){
case 1:
case 2:
case 3:
season=("Winter");
break;
case 4:
case 5:
case 6:
season=("Spring");
break;
case 7:
case 8:
case 9:
season=("Summer");
break;
case 10:
case 11:
case 12:
season=("Fall");
break;
}
if (month %3==0 && day >= 21){
switch (season) {
case "Winter":
season=("Spring");
break;
case "Spring":
season=("Summer");
break;
case "Summer":
season=("Fall");
break;
default:
season=("Winter");
break;
}
} 
return season;
}
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter month: ");
int month= sc.nextInt();
System.out.println("Enter day: ");
int day= sc.nextInt();
MyDate md= new MyDate(month,day);
String season=md.getDate();
System.out.println(season);
}
}