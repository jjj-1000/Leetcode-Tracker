// Last updated: 7/9/2026, 3:14:12 PM
class Solution {

    public String multiply(String num1, String num2) {

        // If any number is 0
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n1 = num1.length();
        int n2 = num2.length();

        int[] result = new int[n1 + n2];

        // Multiply digits from right to left
        for (int i = n1 - 1; i >= 0; i--) {

            for (int j = n2 - 1; j >= 0; j--) {

                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int product = digit1 * digit2;

                int position1 = i + j;
                int position2 = i + j + 1;

                int sum = product + result[position2];

                result[position2] = sum % 10;
                result[position1] += sum / 10;
            }
        }

        // Convert array to string
        StringBuilder answer = new StringBuilder();

        for (int num : result) {

            // Skip leading zeros
            if (!(answer.length() == 0 && num == 0)) {
                answer.append(num);
            }
        }

        return answer.toString();
    }
}