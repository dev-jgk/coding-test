package org.example;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        test2 test2 = new test2();

        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};

        System.out.println(Arrays.toString(test2.solution(quiz)));
    }
        public String[] solution(String[] quiz) {

            String[] answer = new String[quiz.length];

            for(int i = 0; i<=quiz.length-1;i++){
                // String[] abc = Arrays.copyOfRange(quiz,i,i+1);

//                System.out.println("복제한거 : "+quiz[0]);

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
