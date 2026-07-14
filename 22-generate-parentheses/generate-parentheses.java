class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li = new ArrayList<>();
        generate(n, 0, 0, "", li);
        return li;

    }

    public static void generate(int n, int opencount, int closecount, String res, List<String> li){
        // base case--
        if(opencount == n && closecount == n){
            li.add(res);
            return;
        }

        //
        if(opencount > n || closecount > opencount){
            return;
        }
        //
        generate(n, opencount+1,  closecount, res+"(", li);
        generate(n, opencount,  closecount+1, res+")", li);

    }
}