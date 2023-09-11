package lab3.task6;

public class task6 {
    public static void main(String[] args) {
        //1
        Double doubleObject1 = Double.valueOf(3253.142342);
        Double doubleObject2 = Double.valueOf("2.71828");
        //2
        String stringValue = "1.63453453";
        double doubleValue = Double.parseDouble(stringValue);
        //3
        Double doubleObj = 77.234;
        double primitiveDouble = doubleObj.doubleValue();
        int primitiveInt = doubleObj.intValue();
        long primitiveLong = doubleObj.longValue();
        float primitiveFloat = doubleObj.floatValue();
        short primitiveShort = doubleObj.shortValue();
        byte primitiveByte = doubleObj.byteValue();
        //4
        System.out.println("Значение объекта Double: " + doubleObj);
        //5
        String d = Double.toString(3.14);
    }
}
