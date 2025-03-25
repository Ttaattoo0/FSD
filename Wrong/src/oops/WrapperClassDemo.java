package oops;

public class WrapperClassDemo {
    public static void main(String[] args) {
        // Byte Wrapper Class
        Byte byteValue = Byte.valueOf((byte) 10);
        System.out.println("Byte Value: " + byteValue);

        // Short Wrapper Class
        Short shortValue = Short.valueOf((short) 100);
        System.out.println("Short Value: " + shortValue);

        // Integer Wrapper Class
        Integer intValue = Integer.valueOf(1000);
        System.out.println("Integer Value: " + intValue);

        // Character Wrapper Class
        Character charValue = Character.valueOf('A');
        System.out.println("Character Value: " + charValue);

        // Float Wrapper Class
        Float floatValue = Float.valueOf(10.5f);
        System.out.println("Float Value: " + floatValue);

        // Double Wrapper Class
        Double doubleValue = Double.valueOf(20.99);
        System.out.println("Double Value: " + doubleValue);

        // Boolean Wrapper Class
        Boolean booleanValue = Boolean.valueOf(true);
        System.out.println("Boolean Value: " + booleanValue);
    }
}