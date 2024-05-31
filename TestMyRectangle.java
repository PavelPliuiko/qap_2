public class TestMyRectangle {
    public static void main(String[] args) {
        TestMyRectangle test = new TestMyRectangle();
        test.runTests();
    }

    public void runTests() {
        testConstructorAndGetters();
        testSetters();
        testDimensions();
        testArea();
        testPerimeter();
        testToString();
        System.out.println("All tests completed.");
    }

    public void testConstructorAndGetters() {
        MyRectangle rect1 = new MyRectangle(new MyPoint(0, 0), new MyPoint(3, 4));
        MyRectangle rect2 = new MyRectangle(1, 1, 4, 5);

        assert rect1.getTopLeft().equals(new MyPoint(0, 0)) : "testConstructorAndGetters failed";
        assert rect1.getBottomRight().equals(new MyPoint(3, 4)) : "testConstructorAndGetters failed";
        assert rect2.getTopLeft().equals(new MyPoint(1, 1)) : "testConstructorAndGetters failed";
        assert rect2.getBottomRight().equals(new MyPoint(4, 5)) : "testConstructorAndGetters failed";
        System.out.println("testConstructorAndGetters passed");
    }

    public void testSetters() {
        MyRectangle rect = new MyRectangle(new MyPoint(0, 0), new MyPoint(3, 4));

        MyPoint newTopLeft = new MyPoint(2, 2);
        rect.setTopLeft(newTopLeft);
        assert rect.getTopLeft().equals(newTopLeft) : "testSetters failed";

        MyPoint newBottomRight = new MyPoint(5, 5);
        rect.setBottomRight(newBottomRight);
        assert rect.getBottomRight().equals(newBottomRight) : "testSetters failed";

        System.out.println("testSetters passed");
    }

    public void testDimensions() {
        MyRectangle rect = new MyRectangle(new MyPoint(0, 0), new MyPoint(3, 4));
        assert rect.getWidth() == 3 : "testDimensions failed";
        assert rect.getHeight() == 4 : "testDimensions failed";

        MyRectangle rect2 = new MyRectangle(new MyPoint(1, 1), new MyPoint(4, 5));
        assert rect2.getWidth() == 3 : "testDimensions failed";
        assert rect2.getHeight() == 4 : "testDimensions failed";

        System.out.println("testDimensions passed");
    }

    public void testArea() {
        MyRectangle rect = new MyRectangle(new MyPoint(0, 0), new MyPoint(3, 4));
        assert rect.getArea() == 12 : "testArea failed";

        MyRectangle rect2 = new MyRectangle(new MyPoint(1, 1), new MyPoint(4, 5));
        assert rect2.getArea() == 12 : "testArea failed";

        System.out.println("testArea passed");
    }

    public void testPerimeter() {
        MyRectangle rect = new MyRectangle(new MyPoint(0, 0), new MyPoint(3, 4));
        assert rect.getPerimeter() == 14 : "testPerimeter failed";

        MyRectangle rect2 = new MyRectangle(new MyPoint(1, 1), new MyPoint(4, 5));
        assert rect2.getPerimeter() == 14 : "testPerimeter failed";

        System.out.println("testPerimeter passed");
    }

    public void testToString() {
        MyRectangle rect = new MyRectangle(new MyPoint(0, 0), new MyPoint(3, 4));
        assert rect.toString().equals("MyRectangle [topLeft=(0,0), bottomRight=(3,4)]") : "testToString failed";

        MyRectangle rect2 = new MyRectangle(new MyPoint(1, 1), new MyPoint(4, 5));
        assert rect2.toString().equals("MyRectangle [topLeft=(1,1), bottomRight=(4,5)]") : "testToString failed";

        System.out.println("testToString passed");
    }
}
