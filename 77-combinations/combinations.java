class Solution {

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();

        combination(n, 1, k, li, ans);

        return ans;
    }

    public static void combination(int n, int i, int k,
                                   List<Integer> li,
                                   List<List<Integer>> ans) {

        // K numbers select ho gaye
        if (li.size() == k) {
            ans.add(new ArrayList<>(li));
            return;
        }

        // Numbers khatam ho gaye
        if (i > n) {
            return;
        }

        // Choose
        li.add(i);

        combination(n, i + 1, k, li, ans);

        // Backtrack
        li.remove(li.size() - 1);

        // Don't choose
        combination(n, i + 1, k, li, ans);
    }
}