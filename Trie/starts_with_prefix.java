public class starts_with_prefix {
    static class node{
        node[] children;
        boolean eow;

        public node(){
            children = new node [26];
            eow = false;

            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    static node root = new node();

    public static void insert(String word){
        node curr=root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new node();
            }

            if(i==word.length()-1){
                curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }
    }

    static boolean starts_with(String prefix){
        node curr = root;
        for(int i=0;i<prefix.length();i++){
            int idx = prefix.charAt(i) - 'a';

            if(curr.children[idx] == null){
                return false;
            }

            curr= curr.children[idx];
        }

        return true;
    }

    public static void main(String[] args){
        String[] words = {"i","like", "sam","samsung","mobile","ice" };
        for (String word : words) {
            insert(word);
        }
        System.out.println(starts_with("moon"));
        System.out.println(starts_with("sam"));
    }
}
