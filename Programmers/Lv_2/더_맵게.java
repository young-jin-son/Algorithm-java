package Programmers.Lv_2;
import java.util.*;

public class 더_맵게 {
    static class Solution {
        public int solution(int[] scoville, int K) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int scov: scoville) {
                pq.add(scov);
            }

            int answer = 0;

            while (pq.size() > 1 && pq.peek() < K) {
                int first = pq.poll();
                int second = pq.poll();
                int newScoville = first + (second * 2);
                pq.add(newScoville);
                answer++;
            }

            if (pq.peek() < K) {
                return -1;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][][] testCases = {
                {{1,2,3,9,10,12},{7}},
                {{10,1,2},{3}},
                {{1,1,1}, {10}}
        };

        for (int [][] testCase: testCases) {
            int[] scoville = testCase[0];
            int K = testCase[1][0];
            int result = sol.solution(scoville, K);
            System.out.println(result);
        }
    }
}
