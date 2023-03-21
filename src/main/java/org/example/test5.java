package org.example;

public class test5 {
    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(babbling));
    }
        public static int solution(String[] babbling) {
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
                 String[] arr = str.split("aya|ye|woo|ma");
                 if(arr.length == 0){
                     answer++;
                 }
             }
             return answer;

            // stream 도전
            // Stream<String> stream = Arrays.stream(babbling);
            // Stream<String> stream = Arrays.stream(babbling);
            // System.out.println(stream);
            // System.out.println(Arrays.stream(babbling));

            // return Arrays.stream(babbling).splitAsStream("word1|word2|word3|word4");
//            Stream<String> strr = Arrays.stream(babbling)
//                    .distinct()
//                    .filter(name -> name.matches("aya|ye|woo|ma"));
//
//            answer = (int) strr.count();
//
//            return answer;



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


            // return answer;
        }
}
