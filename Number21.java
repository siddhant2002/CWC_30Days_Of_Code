import java.util.*;
public class Number21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		A nm = new A();
        nm.solve();
	}
}
	class A {
		Scanner sc=new Scanner(System.in);
    	final int n=sc.nextInt();
	    void printSolution(int a[][])
	    {
	    	int i,j;
	        for(i=0;i<a.length;i++) 
	        {
	            for (j=0;j<a.length;j++)
	            {
	            	System.out.print(a[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }
	    boolean isSafe(int a[][], int row, int col)
	    {
	        int i, j;
	        for (i=0;i<col;i++)
	            if(a[row][i]==1)
	                return false;
	        for (i=row,j=col;i>=0&&j>=0;i--,j--)
	            if (a[i][j]==1)
	                return false;
	        for (i=row,j=col;j>=0&&i<a.length;i++,j--)
	            if (a[i][j] == 1)
	                return false;
	  
	        return true;
	    }
	    boolean check(int a[][], int col)
	    {
	    	int i;
	        if (col>=n)
	            return true;
	        for (i=0;i<a.length;i++) {
	            if (isSafe(a,i,col)) {
	                a[i][col]=1;
	                if (check(a,col+1)==true)
	                    return true;
	                a[i][col]=0;
	            }
	        }
	        return false;
	    }
	    boolean solve()
	    {
	        int a[][]=new int[n][n];
	        int i,j;
	        for(i=0;i<a.length;i++)
	        {
	        	for(j=0;j<a.length;j++)
	        	{
	        		a[i][j]=0;
	        	}
	        }
	        if (check(a,0) == false) {
	            System.out.print("Solution does not exist");
	            return false;
	        }
	  
	        printSolution(a);
	        return true;
	    }
	}
