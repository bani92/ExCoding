

public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance==null) {
            instance = new Singleton();
        }
        return instance;
    }
}

// 어떤 클래스가 최초 한 번만 메모리를 할당하고(static) 그 메모리에 객체를 생성하여 이후에는
// 그 객체를 반환하게끔 하는 것을 말합니다.
// 이러한 방식을 통해, 전역 변수를 사용하지 않고 객체를 하나만 생성하여 공유할 수 있습니다.
