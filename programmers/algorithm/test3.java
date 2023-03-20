//3번(https://school.programmers.co.kr/learn/courses/30/lessons/120913)

import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        
        String[] answer = new String[my_str.length() % n >= 1 ? my_str.length() / n + 1 : my_str.length() / n];
        System.out.println("length % n : " + my_str.length() % n);
        System.out.println("my_str의 길이 : " + my_str.length());
        
        
        // int resultCnt = (my_str.length() + n - 1) / n;
        // String[] answer = new String[resultCnt];
        
        // answer[0] = my_str;
        // System.out.println(answer[0]);
//         System.out.println(my_str.split("(?<=\\G.{" + n + "})"));
        
//         String[] arr= my_str.split("(?<=\\G.{" + n + "})");
//         System.out.println(Arrays.toString(arr));
       
        // System.out.println(answer.length);
        
        for(int i=0;i <= answer.length-1;i++){
            // 설명2. 정규식 answer= my_str.split("(?<=\\G.{" + n + "})");
            
            int end = i*n + n >= my_str.length() ? my_str.length(): i*n + n;
            
            answer[i] = my_str.substring(i * n, end);
            
            System.out.println(i*n);
            
        }
        
        return answer;
    }
}
