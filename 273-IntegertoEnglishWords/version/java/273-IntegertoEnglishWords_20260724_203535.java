// Last updated: 7/24/2026, 8:35:35 PM
1class Solution {
2
3    private final String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
4            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
5    private final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
6
7    public String numberToWords(int num) {
8        if (num == 0) {
9            return "Zero";
10        }
11        return helper(num);
12    }
13
14    private String helper(int num) {
15        StringBuilder result = new StringBuilder();
16        if (num < 20) {
17            result.append(belowTwenty[num]);
18        } else if (num < 100) {
19            result.append(tens[num / 10]).append(" ").append(belowTwenty[num % 10]);
20        } else if (num < 1000) {
21            result.append(helper(num / 100)).append(" Hundred ").append(helper(num % 100));
22        } else if (num < 1000000) {
23            result.append(helper(num / 1000)).append(" Thousand ").append(helper(num % 1000));
24        } else if (num < 1000000000) {
25            result.append(helper(num / 1000000)).append(" Million ").append(helper(num % 1000000));
26        } else {
27            result.append(helper(num / 1000000000)).append(" Billion ").append(helper(num % 1000000000));
28        }
29        return result.toString().trim();
30    }
31}