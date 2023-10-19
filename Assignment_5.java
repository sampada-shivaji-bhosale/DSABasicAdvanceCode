package SuperX_Assignment_1;

import java.io.BufferedReader;
import java.io.*;

public class Assignment_5 {
        public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            int count=0;
            for(int i=0;i<str.length();i++){
                count++;
            }
            System.out.println(str+": "+count);
        }
}
