package com.almazan.google;
import java.io.*;
import java.util.*;

public class KGoodnessString {

    public static int n = (int) (1e5*2+1);
    public static int k;

    public static void main (String[] args) {

        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int T = scan.nextInt();

        for(int i=1; i<=T; i++) {
            n = scan.nextInt();
            k = scan.nextInt();
            int K = k;
            int count=0,z=0;
            String s = scan.next();
            Character[] wall = new Character[n+1];

            for (int c = 0; c < n; c++) {
                wall[c+1] = s.charAt(c);
            }

            for(int m=1; m<=n/2; m++){
                if(wall[m] != wall[n-m+1]) count++;
            }

            if(count == K) z =0;
            if(count > K) z = count - K;
            if(count < K) z = K -count;
            System.out.printf("Case #%d: %d\n",i,z);
        }
    }
}

