public class FloatStack {
    private float data = 0;
    FloatStack next = null;
    FloatStack previous = null;
    boolean topFlag = true;

    void push(float inputNumber) {
        topFlag = false;
        next = new FloatStack();
        next.data = inputNumber;
        //next.topFlag=true;
        next.previous = this;
    }

    float pop() {

        return 0;
    }

    float peek() {
        return 0;
    }
}
