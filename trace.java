import java.util.*;
import java.lang.*;
class matrix
 {
  public static void main(String args[])
    {
      int i,j,p;
      Scanner s=new Scanner(System.in);
      int T=s.nextInt();
      while(T-->0)
      {
      int N=s.nextInt();
      int a[][]=new int[N][N];
      for( i=0;i<N;i++)
      for(j=0;j<N;j++)
      a[i][j]=s.nextInt();
      int max=0;
      for( i=0;i<N;i++)
      {
      for(j=0;j<N;j++)
      {
       p=a[i][j];
       if(i>=1  &&j>=1)
       a[i][j]= p+a[i-1][j-1];
       else
       a[i][j]=p;
       max = Math.max(max,a[i][j]);
       }
       }
       
       System.out.println(max);
}
}
}