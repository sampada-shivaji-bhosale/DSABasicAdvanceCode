package SuperX_Assignment_1;
import java.util.*;
import java.io.*;
public class Assignment_4 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<=10;i++)
        {
            if(i%2!=0){
                System.out.println(i+" ");
            }
        }
    }
}
