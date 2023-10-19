package SuperX_Assignment_1;
import java.util.*;
import java.io.*;
public class Assignment_1 {
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            int x=i;
            for(int j=1;j<=n;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}
