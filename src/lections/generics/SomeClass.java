package lections.generics;

public class SomeClass<T> {
    private T someField;

    @Override
    public String toString() {
        return "SomeClass{" +
                "someField=" + someField +
                '}';
    }

    public SomeClass(T someField) {
        this.someField = someField;
    }

    public T getSomeField() {

        return someField;
    }

    public void setSomeField(T someField) {
        this.someField = someField;
    }
}
