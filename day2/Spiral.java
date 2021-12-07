package pgm;
import java.util.Scanner;
public class Spiral {
    public static void main(String[] args) {
        System.out.println("JAVA SPIRAL PATTERN");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter dimention of matrix:");
        int n=sc.nextInt();
        int [] [] M =new int [n] [n];

        int i=1;
        int mR=0, mC=0,MR=n-1,MC=n-1;
        while (i<=(n*n)){

            for (int j=mC;j<=MC;j++)
                M[mR][j]=i++;
            for (int j=mR+1;j<=MR;j++)
                M[j][MC]=i++; 
            for (int j=MC-1;j>=mC;j--)
                M[MR][j]=i++; 
            for (int j=MR-1;j>=mR+1;j--)
                M[j][mC]=i++;  
            mC++; mR++; MC--; MR--;
        }
        for (i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
                System.out.print(M[i][j]+"\t");
            System.out.println() ;   
        }
        System.out.println();
        System.out.println("Bye !");  
    }
}


      