public class insertion {
    static class node {
        node[] children;
        boolean eow;

        public node() {
            children = new node[26];
            eow = false;

            for (int i = 0; i < 26; i++) {
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

    public static void main(String[] args) {
        String[] words = { "the", "a", "there", "their", "any" };
        for (String word : words) {
            insert(word);
        }
    }
}
