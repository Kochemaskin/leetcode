package FindUniqueBinaryString1980;

public class FindUniqueBinaryString1980 {
        int n;
        Set<String> numsSet = new HashSet();

        private String generate(String curr) {
            if (curr.length() == n) {
                if (!numsSet.contains(curr)) {
                    return curr;
                }

                return "";
            }

            String addZero = generate(curr + "0");
            if (addZero.length() > 0) {
                return addZero;
            }

            return generate(curr + "1");
        }

        public String findDifferentBinaryString(String[] nums) {
            n = nums.length;
            for (String s : nums) {
                numsSet.add(s);
            }

            return generate("");
        }
    }
/*
1980
TC: O(n^2)
SC: O(n)
*/