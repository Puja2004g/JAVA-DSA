public class word_break_problem {
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

    static boolean search(String word){
        node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                return false;
            }

            if(i==word.length()-1 && curr.children[idx].eow == false){
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }

        for(int i=1;i<=key.length();i++){
            String first = key.substring(0, i);
            String second = key.substring(i);

            if(search(first) && wordBreak(second)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){
        String[] words = {"i","like", "sam","samsung","mobile","ice" };
        for (String word : words) {
            insert(word);
            System.out.println("inserted "+ word);
        }

        System.out.println(wordBreak("ilikesamsung"));
        System.out.println(wordBreak("ilikesam"));
        System.out.println(wordBreak("ilikeicecream"));
        System.out.println(wordBreak(""));
    }
}
