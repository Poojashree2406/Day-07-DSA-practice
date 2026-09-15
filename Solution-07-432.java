import java.util.*;

class AllOne {

    class Bucket {
        int count;
        Set<String> keys;
        Bucket prev;
        Bucket next;

        Bucket(int count) {
            this.count = count;
            keys = new HashSet<>();
        }
    }

    Bucket head;
    Bucket tail;
    Map<String, Bucket> map;

    public AllOne() {
        head = new Bucket(0);
        tail = new Bucket(0);

        head.next = tail;
        tail.prev = head;

        map = new HashMap<>();
    }

    public void inc(String key) {
        if (!map.containsKey(key)) {
            Bucket first = head.next;

            if (first == tail || first.count != 1) {
                Bucket bucket = new Bucket(1);
                insertAfter(head, bucket);
                first = bucket;
            }

            first.keys.add(key);
            map.put(key, first);
        } else {
            Bucket current = map.get(key);
            Bucket next = current.next;

            if (next == tail || next.count != current.count + 1) {
                Bucket bucket = new Bucket(current.count + 1);
                insertAfter(current, bucket);
                next = bucket;
            }

            next.keys.add(key);
            map.put(key, next);

            current.keys.remove(key);

            if (current.keys.isEmpty()) {
                remove(current);
            }
        }
    }

    public void dec(String key) {
        if (!map.containsKey(key)) {
            return;
        }

        Bucket current = map.get(key);

        if (current.count == 1) {
            map.remove(key);
        } else {
            Bucket prev = current.prev;

            if (prev == head || prev.count != current.count - 1) {
                Bucket bucket = new Bucket(current.count - 1);
                insertAfter(prev, bucket);
                prev = bucket;
            }

            prev.keys.add(key);
            map.put(key, prev);
        }

        current.keys.remove(key);

        if (current.keys.isEmpty()) {
            remove(current);
        }
    }

    public String getMaxKey() {
        if (tail.prev == head) {
            return "";
        }

        return tail.prev.keys.iterator().next();
    }

    public String getMinKey() {
        if (head.next == tail) {
            return "";
        }

        return head.next.keys.iterator().next();
    }

    private void insertAfter(Bucket prev, Bucket bucket) {
        bucket.next = prev.next;
        bucket.prev = prev;

        prev.next.prev = bucket;
        prev.next = bucket;
    }

    private void remove(Bucket bucket) {
        bucket.prev.next = bucket.next;
        bucket.next.prev = bucket.prev;
    }
}
