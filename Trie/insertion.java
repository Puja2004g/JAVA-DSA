public class insertion{
    static class node{
        node[] children;
        boolean eow;

        public node(){
            children = new node[26];
            eow = false;
        }
    }

    static node root = new node();

    public static void insert(String word){
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';

            if(root.children[idx] == null){
                root.children[idx] = new node();
            }

            if(i == word.length()-1){
                root.eow = true;
                System.out.println("inserted  '" + word + "' into trie");
            }

            root = root.children[idx];
        }
    }
    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any"};
        for(String word : words){
            insert(word);
        }
    }
}
