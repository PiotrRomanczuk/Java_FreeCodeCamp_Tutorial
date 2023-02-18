class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class AnotherClass {
    public static void main(String[] args) {
        System.out.println("Hello, Another");
    }
}


class TypesOfData {
    public static void main(String[] args) {

        // integar types
        byte aSinleByte = 100; // -128 to 127
        short aSmallNumber = 2000; // -32,768 to 32,767
        int anIntegar = 2115126321; // -2147483648 to 2147483648
        long aLongNumber = 99231757733127512L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808

        // decimal types
        double aDouble = 1.76451283; // Double is a 32 bit / 0 to 4,294,967,295
        float aFloat = 3.4028F; // Float is a 64 bit/ -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        // booleans
        boolean aTrueBoolean = true;
        boolean aFalseBoolean = false;

        // characters 
        char copyrightSymbol = '\u00A9';
        char percentSymbol = '%';


        System.out.println("This is the copyright symbol: " + copyrightSymbol);
        System.out.println("This is the percent symbol: " + percentSymbol);
    }
}