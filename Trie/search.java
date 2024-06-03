public class search {
    static class node {
        node[] children;
        boolean eow;

        public node() {
            children = new node[26];
            eow = false;

            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }

    public static node root = new node();

    public static void insert(String word) {
        node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new node();
            }

            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }
    }

    public static boolean find(String word){
        node curr=root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                return false;
            }
            if(i==word.length()-1 && curr.children[idx].eow == false){
                return false;
            }

            curr=curr.children[idx];
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = { "the", "a", "there", "their", "any" };
        for (String word : words) {
            insert(word);
            System.out.println("inserted " + word);
        }


        boolean search = find("the");
        System.out.println(search);
    }
}
