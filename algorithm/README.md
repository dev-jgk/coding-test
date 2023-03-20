1번(https://school.programmers.co.kr/learn/courses/30/lessons/120923)

```
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num]; // 배열의 길이 = 정수(num)의 갯수
        int number = total / num; // 배열의 중간 값 산출
        
        for(int i =0; i <= answer.length - 1; i++){ // 첫번째 index부터 마지막 index까지 반복
            answer[i] = number - num / 2 + (num % 2 == 1 ? i : i+1); // i번째 index는 배열의 중간 값에 배열 길이의 반만큼 빼고 i만큼 더해주는데(연속적인 정수니까 중간 값에서 1씩 줄어들거나 더해지니까 * 왼쪽 오른쪽으로 몇번씩 해야하는지 알기 위해 길이의 반만큼 뺀다), 이 때 배열의 길이가 짝수이면 n+1만큼 더해준다.(짝수면 중간 값에 위치할 수 없어서 1을 더해줌)
        }
        return answer;
    }
}
```

2번(https://school.programmers.co.kr/learn/courses/30/lessons/120907)

```
import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i<=quiz.length-1;i++){
            // String[] abc = Arrays.copyOfRange(quiz,i,i+1);
            
            System.out.println("복제한거 : "+quiz[0]);
            
            String[] abcd = quiz[i].split(" ");
            
            int bbbb = Integer.parseInt(abcd[0]);
            String giho = abcd[1];
            int cccc = Integer.parseInt(abcd[2]);
            int dddd = Integer.parseInt(abcd[4]);
            
            if(giho.equals("-") && bbbb - cccc == dddd || giho.equals("+") && bbbb + cccc == dddd){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }
                return answer;
    }
}
        
        // String aaa = Arrays.toString(quiz);
        // System.out.println(aaa);
        
        // String[] abc = aaa.split(" ");
        // System.out.println(abc[0]);
        // System.out.println(abc[1]);
        // System.out.println(abc[2]);
        // System.out.println(abc[3]);
        // System.out.println(abc[4]);
        
        // String[] abc = Arrays.copyOfRange(quiz,0,1);
        // System.out.println(abc[0]);
        
        // String[] abcd = Arrays.copyOfRange(quiz,1,2);
        // System.out.println(abcd[0]);
        
                
//         String[] abc = new String[quiz.length];
//         System.out.println(abc[0]);
        

        
        // String[] aaaa = abc[0].split(" ");
        // System.out.println(aaaa[0]);
        // System.out.println(aaaa[1]);
        // System.out.println(aaaa[2]);
        // System.out.println(aaaa[3]);
        // System.out.println(aaaa[4]);
        
//         int bbbb = Integer.parseInt(aaaa[0]);
//         System.out.println(bbbb);
//         int cccc = Integer.parseInt(aaaa[2]);
//         System.out.println(cccc);
//         int dddd = Integer.parseInt(aaaa[4]);
//         System.out.println("마지막은?"+dddd);
        
//         if(bbbb + cccc == dddd || bbbb - cccc == dddd){
//             answer[0] = "O";
//         }else{
//             answer[0] = "X";
//         }
        
        // if(aaaa[0] + aaaa[1] + aaaa[2] + aaaa[3] == aaaa[4] || aaaa[0] + aaaa[1] + aaaa[2] + aaaa[3] == aaaa[4]){
        //     System.out.println("hi");
        // }
        
        // System.out.println(aaaa[0] + aaaa[1] + aaaa[2]);
        
        // System.out.println(Arrays.toString(abc));
        
        
        // for(int i = 0; i <= answer.length -1 ; i++){
        // if(quiz[i] == true){
        //     answer[i] = "O";
        // } else{
        //     answer[i] = "X";
        //     }
        // }
```

3번(https://school.programmers.co.kr/learn/courses/30/lessons/120913)

```
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
```

4번(https://school.programmers.co.kr/learn/courses/30/lessons/120883)

```
import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        
        String a1 = id_pw[0];
        String a2 = id_pw[1];
        
        String b1 = db[0][0];
        String b2 = db[0][1];
        
        System.out.println("첫번 : "+Arrays.toString(id_pw));
        
        System.out.println("a1 : "+a1);
        System.out.println("a2 : "+a2);
        
        System.out.println("b1 : "+b1);
        System.out.println("b2 : "+b2);
        
        String answer = "";
//         String yaya = Arrays.deepToString(db);
        
//         System.out.println("yaya : " + yaya);
//         System.out.println("yaya.equals(meosseugi) ? : " + db.equals("meosseugi"));
//         System.out.println("yaya.equals(a2) ? : " + b2.equals(a2));
        
        // for(int i=0; i<= db.length-1; i++){
        // if(db[i][0].equals(a1)){
        //     if(db[i][0].equals(a1) && db[i][1].equals(a2)){
        //     answer = "login";
        //     }
        // }
        // if(db[i][0].equals(a1)){
        //     if(db[i][0].equals(a1) && !db[i][1].equals(a2)){
        //     answer = "wrong pw";
        //     }
        // }
        // if(!db[i][0].equals(a1) && !db[i][1].equals(a2)){
        //     answer = "fail";
        //     }
        // }
        
        for(int i=0; i<= db.length-1; i++){
            answer = "fail";
        if(db[i][0].equals(a1) && db[i][1].equals(a2)){
            answer = "login";
        }
        else if(db[i][0].equals(a1) && !db[i][1].equals(a2)){
            answer = "wrong pw";
        }
        }
        
        
        return answer;
    }
}
```

5번(https://school.programmers.co.kr/learn/courses/30/lessons/120956)

```
import java.util.*;

// import org.apache.commons.lang.StringUtils;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String word1 = "aya";
        String word2 = "ye";
        String word3 = "woo";
        String word4 = "ma";
        // System.out.println(Arrays.toString(babbling));
        // System.out.println(Arrays.asList(babbling));
        // System.out.println(babbling.toString());
        // System.out.println(String.join("", babbling));
        
        
        // System.out.println(StringUtils.containsAny("abc", 'a', 'b'));
        
        // String str = String.join("", babbling);
        // System.out.println("str : " + str);
        
        for(int i = 0; i < babbling.length;i++){
            String str = babbling[i];
            String[] arr = str.split("word1|word2|word3|word4");
            if(arr.length == 0){
                answer++;
            }
        }

        
        // if(str.contains(word1)){
        //     answer++;
        // }
        // if(str.contains(word2)){
        //     answer++;
        // }
        // if(str.contains(word3)){
        //     answer++;
        // }
        // if(str.contains(word4)){
        //     answer++;
        // }
        
        
//         Pattern pattern1 = Pattern.compile(".*" + "aya" + ".*");
//         Pattern pattern2 = Pattern.compile(".*" + "ye" + ".*");
//         Pattern pattern3 = Pattern.compile(".*" + "woo" + ".*");
//         Pattern pattern4 = Pattern.compile(".*" + "ma" + ".*");

//         Matcher matcher1 = pattern1.matcher(str);
//         Matcher matcher2 = pattern2.matcher(str);
//         Matcher matcher3 = pattern3.matcher(str);
//         Matcher matcher4 = pattern4.matcher(str);

//         if(matcher1 == true){
//             answer++;
//         }
//         if(matcher2 == true){
//             answer++;
//         }
//         if(matcher3 == true){
//             answer++;
//         }
//         if(matcher4 == true){
//             answer++;
//         }
        

        
        
        // if(StringUtils.containsAny(str, word1, word2, word3, word4)){
        //     answer++;
        // }
        
//         for(int i = 0; i<=babbling.length-1;i++){
            
//         }
        
//         if(Arrays.asList(babbling).contains("aya")){
//             answer++;
//         }
//         if(Arrays.asList(babbling).contains("ye")){
//             answer++;
//         }
//         if(Arrays.asList(babbling).contains("woo")){
//             answer++;
//         }
//         if(Arrays.asList(babbling).contains("ma")){
//             answer++;
//         }
        
        
//         if(Arrays.asList(babbling).contains(word1+word2)){
//             answer++;
//         }
//         if(Arrays.asList(babbling).contains(word1+word3)){
//             answer++;
//         }
//         if(Arrays.asList(babbling).contains(word1+word4)){
//             answer++;
//         }
        
//         if(Arrays.asList(babbling).contains(word2+word1)){
//             answer++;
//         }
//         if(Arrays.asList(babbling).contains(word2+word2)){
//             answer++;
//         }
//         if(Arrays.asList(babbling).contains(word2+word3)){
//             answer++;
//         }
//         if(Arrays.asList(babbling).contains(word2+word4)){
//             answer++;
//         }
        
//         if(Arrays.asList(babbling).contains(word3+word1)){
//             answer++;
//         }
//         if(Arrays.asList(babbling).contains(word3+word2)){
//             answer++;
//         }
//         if(Arrays.asList(babbling).contains(word3+word2)){
//             answer++;
//         }
//         if(Arrays.asList(babbling).contains(word3+word3)){
//             answer++;
//         }
//         if(Arrays.asList(babbling).contains(word3+word4)){
//             answer++;
//         }
        
//         if(Arrays.asList(babbling).contains(word4+word1)){
//             answer++;
//         }
//         if(Arrays.asList(babbling).contains(word4+word2)){
//             answer++;
//         }
//         if(Arrays.asList(babbling).contains(word4+word3)){
//             answer++;
//         }
        
        
//       StringUtils 안 되는듯
//       String str1 = "hello java.";
// // str이 java를 포함하고 있으면 true 반환.
// Boolean bool = StringUtils.contains(str1, "java");
// System.out.println("contains : " + bool);
    
        
        return answer;
    }
}
```
