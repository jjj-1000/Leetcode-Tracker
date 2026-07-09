// Last updated: 7/9/2026, 3:11:34 PM
import java.util.*;

class Solution {

    public List<String> addOperators(String num, int target) {

        List<String> result = new ArrayList<>();

        backtrack(result, "", num, target, 0, 0, 0);

        return result;
    }

    private void backtrack(List<String> result,
                           String path,
                           String num,
                           int target,
                           int index,
                           long value,
                           long prev) {

        // If entire string is used
        if (index == num.length()) {

            if (value == target) {
                result.add(path);
            }

            return;
        }

        for (int i = index; i < num.length(); i++) {

            // Skip numbers with leading zeros
            if (i != index && num.charAt(index) == '0') {
                break;
            }

            String currentStr = num.substring(index, i + 1);
            long current = Long.parseLong(currentStr);

            // First number (no operator before it)
            if (index == 0) {

                backtrack(result,
                          currentStr,
                          num,
                          target,
                          i + 1,
                          current,
                          current);

            } else {

                // Addition
                backtrack(result,
                          path + "+" + currentStr,
                          num,
                          target,
                          i + 1,
                          value + current,
                          current);

                // Subtraction
                backtrack(result,
                          path + "-" + currentStr,
                          num,
                          target,
                          i + 1,
                          value - current,
                          -current);

                // Multiplication
                backtrack(result,
                          path + "*" + currentStr,
                          num,
                          target,
                          i + 1,
                          value - prev + (prev * current),
                          prev * current);
            }
        }
    }
}