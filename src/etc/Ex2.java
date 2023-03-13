package etc;

import com.sun.jdi.Value;

import java.util.Objects;

public class Ex2 {
        // equals

    public static void main(String[] args) {

        Value1 v1 = new Value1(10);
        Value1 v2 = new Value1(10);

        if (v1.equals(v2)) {
            System.out.println("같습니다");
        } else {
            System.out.println("다릅니다");
        }
    }
}


class Value1 {

    int Value1;
     Value1(int Value1) {
        this.Value1 = Value1;
    }

    public boolean equals(Object obj) {
         if(!(obj instanceof Value1)) return false;

         return this.Value1 == ((Value1)obj).Value1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Value1);
    }
}