package tema7_streams;

public interface Conversor {

    void toPDF();

    default void toText(Object o) {
        System.out.println(o.toString());
    }

}
