import java.util.Random;
import java.io.*;
import java.util.Scanner;
public class LB
{
public static void main(String args[])
{
int bs,or,ip,cbs=0,w;
System.out.println("\nEnter Bucket Size:");
Scanner in=new Scanner(System.in);
bs=in.nextInt();
System.out.println("Enter Output Rate:");
//Scanner input=new Scanner(System.in);
or=in.nextInt();
System.out.println("InPut CurBuc Output Discarded");
System.out.println("Size contains rate Bytes");
	for(int i=0;i<5;i++)
{
Random r = new Random();
ip = r.nextInt(100);
cbs+=ip;
if(cbs>(bs+or))
{
w=cbs-(bs+or);
System.out.println(ip +"\t "+ bs +"\t " + or+"\t " + w);
cbs=bs;
}
else
{
if(cbs<or)
System.out.println(ip +"\t "+ cbs +"\t " + 0 +"\t " + 0);
else
{
cbs-=or;
System.out.println(ip +"\t "+ cbs +"\t " + or +"\t " +
0);
}
}
}
}}
