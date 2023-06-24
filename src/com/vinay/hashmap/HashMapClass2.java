package com.vinay.hashmap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapClass2 {
    // Hash map internally implement array linked list
    static class HashMap<k, v>{
        private class Node{
            k key;
            v value;

            public Node(k key, v value){
                this.key = key;
                this.value = value;
            }
        }
        private int n; // n - nodes
        private int N; // N - buckets;
        private int[] arr;
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(k key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(k key, int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int i=0; i<ll.size(); i++){
                if (ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[N*2];
            for (int i=0; i<N*2; i++){
                buckets[i] = new LinkedList<>();
            }

            for (int i=0; i<oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for (int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(k key, v value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1){
                buckets[bi].add(new Node(key, value));
                n++;
            }else{
                Node data = buckets[bi].get(di);
                data.value = value;
            }

            double lambda = (double)n/N;
            if (lambda > 2.0){
                rehash();
            }
        }

        public v get(k key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1){
                return null;
            }else{
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(k key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            return di != -1;
        }

        public v remove(k key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di==-1){
                return null;
            }else{
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public ArrayList<k> keySet(){
            ArrayList<k> keys = new ArrayList<>();
            for (int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("india", 110);
        map.put("china", 120);
        map.put("us", 130);

        ArrayList<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        map.remove("us");
        System.out.println(map.get("us"));
    }
}

