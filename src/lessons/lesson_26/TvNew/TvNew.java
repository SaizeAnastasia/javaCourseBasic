package lessons.lesson_26.TvNew;

public class TvNew {
    private String produced;
    private int size;


    public TvNew(String produced, int size) {
        this.produced = produced;
        this.size = size;
    }

    public String getProduced() {
        return produced;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "TvNew{" +
                "produced='" + produced + '\'' +
                ", size=" + size +
                '}';
    }
}
