public class cote {

    public static void main(String[] args) {

        String s = "-1234";

        Solution solution =new Solution();
        int solution1 = solution.solution(s);
        System.out.println("solution1 = " + solution1);
    }
}

class Solution {
    public int solution(String s) {
        int answer = Integer.parseInt(s);

        return answer;
    }
}
