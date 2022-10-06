class TimeMap {
    HashMap<String, HashMap<Integer, String>> hm;
    public TimeMap() {
        hm = new HashMap<String, HashMap<Integer, String>>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (hm.containsKey(key)) {
            hm.get(key).put(timestamp, value);
        } else {
            HashMap<Integer, String> temp = new HashMap<Integer, String>();
            temp.put(timestamp, value);
            hm.put(key, temp);
        }
    }
    
    public String get(String key, int timestamp) {
        HashMap<Integer, String> curr = hm.get(key);
        if (curr == null) return "";
        while(timestamp > 0) {
            if (curr.containsKey(timestamp)) return curr.get(timestamp);
            else timestamp--;
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */