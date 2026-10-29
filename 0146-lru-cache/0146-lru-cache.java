class LRUCache {
    int capacity;
    HashMap <Integer, Node> cache;
    Node left;
    Node right;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next=this.right;
        this.right.prev = this.left;
    }
    void remove(Node node){
        Node newNode = node.prev;
        Node newNode2 = node.next;
        newNode.next = newNode2;
        newNode2.prev = newNode;
    }
    void insert(Node node){
        Node newNode = this.right.prev;
        newNode.next = node;
        node.prev = newNode;
        node.next = this.right;
        this.right.prev = node;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node newNode = cache.get(key);
            remove(newNode);
            insert(newNode);
            return newNode.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insert(newNode);

        if(cache.size()>capacity){
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}
class Node{
    int key;
    int val;
    Node prev;
    Node next;
    Node(int key, int val){
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */