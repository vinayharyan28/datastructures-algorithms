package trie;


public class Trie {
    static class Node{
        Node[] children;
        boolean endOfWord;

        public Node(){
            children = new Node[26]; // a to z
            for (int i=0; i<26; i++){
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null){
                // add new node
                curr.children[index] = new Node();
            }
            if (i == word.length()-1){
                curr.children[index].endOfWord = true;
            }

            curr = curr.children[index];
        }
    }

    public static boolean search(String key){
        Node curr = root;
        for (int i=0; i<key.length(); i++){
            int index = key.charAt(i) - 'a';
            Node node = curr.children[index];
            if (node == null){
                return false;
            }

            if (i == key.length()-1 && !node.endOfWord){
                return false;
            }

            curr = curr.children[index];
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any"};
        for (String word : words) {
            insert(word);
        }

        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("an"));
    }
}
