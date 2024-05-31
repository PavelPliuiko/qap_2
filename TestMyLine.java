public class TestMyLine {
    public static void main(String[] args) {
        TestMyLine test = new TestMyLine();
        test.runTests();
    }

    public void runTests() {
        testConstructorAndGetters();
        testSetters();
        testGetLength();
        testGetGradient();
        testToString();
        System.out.println("All tests completed.");
    }

    public void testConstructorAndGetters() {
        MyLine line1 = new MyLine(0, 0, 3, 4);
        MyPoint begin = new MyPoint(1, 1);
        MyPoint end = new MyPoint(4, 5);
        MyLine line2 = new MyLine(begin, end);

        assert line1.getBegin().equals(new MyPoint(0, 0)) : "testConstructorAndGetters failed";
        assert line1.getEnd().equals(new MyPoint(3, 4)) : "testConstructorAndGetters failed";
        assert line2.getBegin().equals(begin) : "testConstructorAndGetters failed";
        assert line2.getEnd().equals(end) : "testConstructorAndGetters failed";
        System.out.println("testConstructorAndGetters passed");
    }

    public void testSetters() {
        MyLine line = new MyLine(0, 0, 3, 4);

        MyPoint newBegin = new MyPoint(2, 2);
        line.setBegin(newBegin);
        assert line.getBegin().equals(newBegin) : "testSetters failed";

        MyPoint newEnd = new MyPoint(5, 5);
        line.setEnd(newEnd);
        assert line.getEnd().equals(newEnd) : "testSetters failed";

        line.setBeginX(10);
        assert line.getBeginX() == 10 : "testSetters failed";

        line.setBeginY(20);
        assert line.getBeginY() == 20 : "testSetters failed";

        line.setEndX(30);
        assert line.getEndX() == 30 : "testSetters failed";

        line.setEndY(40);
        assert line.getEndY() == 40 : "testSetters failed";

        line.setBeginXY(50, 60);
        int[] beginXY = line.getBeginXY();
        assert beginXY[0] == 50 && beginXY[1] == 60 : "testSetters failed";

        line.setEndXY(70, 80);
        int[] endXY = line.getEndXY();
        assert endXY[0] == 70 && endXY[1] == 80 : "testSetters failed";

        System.out.println("testSetters passed");
    }

    public void testGetLength() {
        MyLine line = new MyLine(0, 0, 3, 4);
        assert Math.abs(line.getLength() - 5.0) < 0.001 : "testGetLength failed";

        MyLine line2 = new MyLine(new MyPoint(1, 1), new MyPoint(4, 5));
        assert Math.abs(line2.getLength() - 5.0) < 0.001 : "testGetLength failed";

        System.out.println("testGetLength passed");
    }

    public void testGetGradient() {
        MyLine line = new MyLine(0, 0, 3, 4);
        assert Math.abs(line.getGradient() - Math.atan2(4, 3)) < 0.001 : "testGetGradient failed";

        MyLine line2 = new MyLine(new MyPoint(1, 1), new MyPoint(4, 5));
        assert Math.abs(line2.getGradient() - Math.atan2(4, 3)) < 0.001 : "testGetGradient failed";

        System.out.println("testGetGradient passed");
    }

    public void testToString() {
        MyLine line = new MyLine(0, 0, 3, 4);
        assert line.toString().equals("MyLine [begin=(0,0), end=(3,4)]") : "testToString failed";

        MyLine line2 = new MyLine(new MyPoint(1, 1), new MyPoint(4, 5));
        assert line2.toString().equals("MyLine [begin=(1,1), end=(4,5)]") : "testToString failed";

        System.out.println("testToString passed");
    }
}
