public class Packet {
    private Object tuple;
    private Object data;
    private int length;
    private String timestamp;
    private Object parsed;

    // Constructor
    public Packet(Object tuple, Object data, int length, String timestamp, Object parsed) {
        this.tuple = tuple;
        this.data = data;
        this.length = length;
        this.timestamp = timestamp;
        this.parsed = parsed;
    }

    // Getters and setters
    public Object getTuple() {
        return tuple;
    }

    public void setTuple(Object tuple) {
        this.tuple = tuple;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Object getParsed() {
        return parsed;
    }

    public void setParsed(Object parsed) {
        this.parsed = parsed;
    }
}