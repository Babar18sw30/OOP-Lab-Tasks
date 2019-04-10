class Record
{
public static void main(String args[])
{
String name="Babar";
long totalmarks=1100;
int marks=950;
float percentage=marks*100/totalmarks;
char grade='A';
boolean pass=true;
System.out.print("name ="+name);
System.out.println("Totalmarks="+totalmarks);
System.out.println("obtained marks="+marks);
System.out.println("percentage is ="+percentage);
System.out.println("grade is="+grade);
if(percentage>=50){

if(pass==true){
System.out.println("status=pass");
}
}
else
{
System.out.println("status=Fail");
}
}
}
