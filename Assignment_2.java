package SuperX_Assignment_1;
import java.util.*;
import java.io.*;
public class Assignment_2 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int x=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                x++;
            }
            x--;
            System.out.println();
        }

    }
}
