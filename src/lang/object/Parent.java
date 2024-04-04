package lang.object;

/*
    Object 클래스
    자바에서 모든 클래스의 최~상위 부모클래스는 항상 Object!
 */
public class Parent { // 부모가 없으면 묵시적으로 Object클래스를 상속 받음!
                      // 지금까지 항상 그래왔음!
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
