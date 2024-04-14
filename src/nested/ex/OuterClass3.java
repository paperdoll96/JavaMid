package nested.ex;

public class OuterClass3 {

    public void myMethod() {

        class LocalClass {
           public void hello() {
                System.out.println("LccalClass Hi~~");
            }

        }
            LocalClass local = new LocalClass();
            local.hello();
    }
}
