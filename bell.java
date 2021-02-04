import java.io.*;
import java.util.Scanner;
public class bell
{
public static void main(String args[])
{
int dist[]=new int[10];
int n,i,j,k,flag=0;
int cost[][]=new int[10][10];
System.out.println("enter the no. of vertices");
Scanner in= new Scanner(System.in);
n=in.nextInt();
System.out.println("enter the cost adjacency matrix");
for(i=1;i<=n;i++)
for(j=1;j<=n;j++){
cost[i][j]=in.nextInt();
if(cost[i][j]==0)
cost[i][j]=999;
}
dist[1]=0;
for(i=2;i<=n;i++)
{
dist[i]=999;
}
for(k=1;k<n;k++)
{
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
if(cost[i][j]!=999)
{
if(dist[i]+cost[i][j]<dist[j])
dist[j]=dist[i]+cost[i][j];
}
}
}
}
System.out.println("the distance between source vertex and the other vertices");
for(i=1;i<=n;i++)
System.out.println("edge 1-->"+ i +"=" +dist[i]);
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
if(cost[i][j]!=999)
{
if(dist[i]+cost[i][j]<dist[j])
flag=1;
break;
}
}
}
if(flag==1)
System.out.println("negative cycle is present");
else
System.out.println("there is no negative cycle");
}
}
