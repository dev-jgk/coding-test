package org.example;

public class Main {
    public static void main(String[] args) {
        class test1 {
            public int[] solution(int num, int total) {
                int[] answer = new int[num]; // 배열의 길이 = 정수(num)의 갯수

                int number = total / num; // 배열의 중간 값 산출

                for (int i = 0; i <= answer.length - 1; i++) { // 첫번째 index부터 마지막 index까지 반복
                    answer[i] = number - num / 2 + (num % 2 == 1 ? i : i + 1); // i번째 index는 배열의 중간 값에 배열 길이의 반만큼 빼고 i만큼 더해주는데(연속적인 정수니까 중간 값에서 1씩 줄어들거나 더해지니까 * 왼쪽 오른쪽으로 몇번씩 해야하는지 알기 위해 길이의 반만큼 뺀다), 이 때 배열의 길이가 짝수이면 n+1만큼 더해준다.(짝수면 중간 값에 위치할 수 없어서 1을 더해줌)
                }
                return answer;
            }
        }
    }
}