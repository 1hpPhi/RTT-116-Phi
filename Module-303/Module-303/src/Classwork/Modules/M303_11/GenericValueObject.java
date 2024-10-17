package Classwork.Modules.M303_11;

public class GenericValueObject<T, K extends Number> {

    private T typeT;
    private K typeK;

    public T getT() {
        return typeT;
    }

    public void setT(T typeT) {
        this.typeT = typeT;
    }

    public static void main(String[] args) {

        GenericValueObject<String, Integer> str = new GenericValueObject<>();
        str.setT("String");
        String s1 = str.getT();

        GenericValueObject<Integer, Double> value = new GenericValueObject<>();
        value.setT(10);
        Integer i = value.getT();
    }
}
