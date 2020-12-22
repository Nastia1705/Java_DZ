package Lab7;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(value= ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
@interface Test {
    int a();
    int b();
}

class Sum {
    @Test(a = 2, b = 5)
    public static void test(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }
}

public class LabNew81 {
    public static void main(String[] args) {
        try {
            Class<?> cls = Sum.class;
            Method[] methods = cls.getDeclaredMethods();
            for (Method m: methods) {
                if (m.isAnnotationPresent(Test.class)){
                    Test tst = m.getAnnotation(Test.class);
                    m.invoke(null, tst.a(), tst.b());
                }
            }
        } catch (Exception x) {
            System.out.println(x.toString());
        }
    }
}