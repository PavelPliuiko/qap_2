public class MyLine {
    MyPoint begin;
    MyPoint end;

    MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.x;
    }

    public void setBeginX(int x) {
        begin.x = x;
    }

    public int getBeginY() {
        return begin.y;
    }

    public void setBeginY(int y) {
        begin.y = y;
    }

    public int getEndX() {
        return end.x;
    }

    public void setEndX(int x) {
        end.x = x;
    }

    public int getEndY() {
        return end.y;
    }

    public void setEndY(int y) {
        end.y = y;
    }

    public int[] getBeginXY() {
        return new int[]{begin.x, begin.y};
    }

    public void setBeginXY(int x, int y) {
        begin.x = x;
        begin.y = y;
    }

    public int[] getEndXY() {
        return new int[]{end.x, end.y};
    }

    public void setEndXY(int x, int y) {
        end.x = x;
        end.y = y;
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        return Math.atan2(end.y - begin.y, end.x - begin.x);
    }

    @Override
    public String toString() {
        return "MyLine [begin=(" + begin.x + "," + begin.y + "), end=(" + end.x + "," + end.y + ")]";
    }
}
