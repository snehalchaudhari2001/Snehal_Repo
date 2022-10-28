// Write a program to find the factorial of no

//5!= 5*4*3*2*1=120
//4!= 4*3*2*1=24
//6!=6*5*4*3*2*1=720

class FactDemo
{
public static void main(String[] args)
{
int no=4;
int fact=1;
for(int i=no;i>=1;i--) 
{
fact=fact*i;  
}
System.out.println("Factorial Number "+fact);
}
}