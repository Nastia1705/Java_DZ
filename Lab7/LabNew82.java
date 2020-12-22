package Lab7;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LabNew82 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, IOException {
        Container cont = new Container();
        Class<?> cls = cont.getClass();
        if (cls.isAnnotationPresent(SaveTo.class)) {
            SaveTo saveTo = cls.getAnnotation(SaveTo.class);
            String path = saveTo.path();
            Method[] methods = cls.getDeclaredMethods();

            for (Method m: methods) {
                if (m.isAnnotationPresent(Saver.class)) {
                    m.invoke(cont, path);
                    System.out.println("File is saved!");
                }
            }
        }
    }

    @SaveTo(path = "e:\\text.txt")
    public static class Container {

        public String text = "Save this text to your file!";
        @Saver
        public void save(String path) throws IOException {
            PrintWriter pw = new PrintWriter(path);
            pw.write(text);
            pw.close();
        }
    }
}
