import java.util.*;

class LFUCache {

    class Node {
        int key;
        int value;
        int freq;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.freq = 1;
        }
    }

    class DLL {
        Node head;
        Node tail;
        int size;

        DLL() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
        }

        void addFirst(Node node) {
            node.next = head.next;
            node.prev = head;

            head.next.prev = node;
            head.next = node;

            size++;
        }

        void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;

            size--;
        }

        Node removeLast() {
            if (size == 0) {
                return null;
            }

            Node node = tail.prev;
            remove(node);
            return node;
        }
    }

    int capacity;
    int minFreq;

    Map<Integer, Node> nodes;
    Map<Integer, DLL> freqMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        nodes = new HashMap<>();
        freqMap = new HashMap<>();
    }

    public int get(int key) {
        if (!nodes.containsKey(key)) {
            return -1;
        }

        Node node = nodes.get(key);
        updateFrequency(node);

        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }

        if (nodes.containsKey(key)) {
            Node node = nodes.get(key);
            node.value = value;
            updateFrequency(node);
            return;
        }

        if (nodes.size() == capacity) {
            DLL list = freqMap.get(minFreq);
            Node removed = list.removeLast();

            nodes.remove(removed.key);
        }

        Node node = new Node(key, value);
        nodes.put(key, node);

        freqMap.computeIfAbsent(1, x -> new DLL()).addFirst(node);
        minFreq = 1;
    }

    private void updateFrequency(Node node) {
        int oldFreq = node.freq;

        DLL oldList = freqMap.get(oldFreq);
        oldList.remove(node);

        if (oldFreq == minFreq && oldList.size == 0) {
            minFreq++;
        }

        node.freq++;

        freqMap
            .computeIfAbsent(node.freq, x -> new DLL())
            .addFirst(node);
    }
}
