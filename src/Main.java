import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int Num = Integer.parseInt(bf.readLine());
        int sum = 0;

        for(int i = 0; i < Num; i++) {

            int x = Integer.parseInt(bf.readLine());

            if(x == 0) {
                stack.pop();
            }
            else {
                stack.push(x);
            }


        }

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.print(sum);
    }

}