package labs_examples.objects_classes_methods.labs.objects.airplanepkg;

public class Wings {
    private int length;
    private int width;
    private boolean foldable;

    public Wings(int length, int width, boolean foldable) {
        this.length = length;
        this.width = width;
        this.foldable = foldable;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isFoldable() {
        return foldable;
    }

    public void setFoldable(boolean foldable) {
        this.foldable = foldable;
    }

    @Override
    public String toString() {
        return "Wings{" +
                "length=" + length +
                ", width=" + width +
                ", foldable=" + foldable +
                '}';
    }
}
