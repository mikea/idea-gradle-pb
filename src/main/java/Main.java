import testproto.Test;

/**
 */
public class Main {
    public static void main(String[] args) {
        Test.TestMessage msg = Test.TestMessage.getDefaultInstance();
        System.out.println("msg = " + msg);
    }
}
