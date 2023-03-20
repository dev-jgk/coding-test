//4번(https://school.programmers.co.kr/learn/courses/30/lessons/120883)
   
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
