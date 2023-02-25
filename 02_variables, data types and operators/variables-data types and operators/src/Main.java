public class Main {
    public static void main(String[] args) {
        System.out.println("Variables");
        System.out.println("We must use Upper Camel Case in the names of classes and files. And Lower Camel Case in the names of variables or methods.");
        //Debemos usar Upper Camel Case en los nombres de las clases y archivos. Y Lower Camel Case en los nombres de las variables o métodos.

        System.out.println();
        System.out.println("NUMBER VARIABLES");
        System.out.println();
        System.out.println("byte(It occupies 1 byte of memory and its range is from -128 to 127)");
        // byte(Ocupa 1 byte de memoria y su rango es de -128 hasta 127):
        byte numberByte = 100;
        System.out.println("byte= "+numberByte);

        System.out.println();
        System.out.println("char(It occupies 2 bytes and can only store 1 digit, we must use single quotes instead of double quotes.)");
        // char(Ocupa 2 bytes y solo puede almacenar 1 dígito, debemos usar comillas simples en vez de comillas dobles):
        char numberChar = 7;
        System.out.println("char= "+numberChar);

        System.out.println();
        System.out.println("bool(They are a logical data type, they only accept the values true and false. It also occupies 2 bytes and stores only 1 digit..)");
        // bool(Son un tipo de dato lógico, solo aceptan los valores true y false. También ocupa 2 bytes y almacena únicamente 1 dígito):
        boolean bool = true;
        System.out.println("bool= "+bool);

        System.out.println();
        System.out.println("short(It occupies 2 bytes of memory and its range is from -32,768 to 32,727)");
        // short(Ocupa 2 bytes de memoria y su rango es de -32,768 hasta 32,727):
        short numberShort = 3500;
        System.out.println("short= "+numberShort);

        System.out.println();
        System.out.println("int(It occupies 4 bytes of memory and its range is -2,147,483,648 to 2,147,483,647, it can store up to 10 digits)");
        // Int(Ocupa 4 bytes de memoria y su rango es de -2,147,483,648 hasta 2,147,483,647,Puede almacenar hasta 10 dígitos):
        int numberInt = 1234567890;
        System.out.println("int= "+numberInt);

        System.out.println();
        System.out.println("long( It occupies 8 bytes of memory and its range is from -9,223,372,372,036,854,775,808 to 9,223,372,036,854,775,807. To differentiate it from a long data type we must finish the number with the letter L)");
        // long( Ocupa 8 bytes de memoria y su rango es de -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807. Para diferenciarlo de un tipo de dato long debemos terminar el número con la letra L):
        long numberLong = 123456789012345L;
        System.out.println("long= "+numberLong);

        System.out.println();

        System.out.println("float(They occupy 4 bytes of memory and range from 1.40129846432481707e-45 to 3.40282346638528860e+38. As long as long, we must place a letter F at the end of it)");
        // float(Ocupan 4 bytes de memoria y su rango es de 1.40129846432481707e-45 hasta 3.40282346638528860e+38. Así como long, debemos colocar una letra F al final):
        float numberFloat =12343.46758F;
        System.out.println("float= "+numberFloat);

        System.out.println();
        System.out.println("double(They occupy 8 bytes of memory and range from 4.94065645841246544e-324d to 1.7976931348486231570e+308d.)");
        // double(Ocupan 8 bytes de memoria y su rango es de 4.94065645841246544e-324d hasta 1.79769313486231570e+308d):
        double numberDouble =123.456123456;
        System.out.println("double= "+numberDouble);

        System.out.println();
        System.out.println("OPERATORS");
        System.out.println();

        System.out.println("Assignment operators");
        //Operadores de asignación
        System.out.println("+="+" : "+"a += b: "+"es equivalente:"+" a = a + b");
        System.out.println("-="+" : "+"a -= b: "+"es equivalente:"+" a = a - b");
        System.out.println("*="+" : "+"a *= b: "+"es equivalente:"+" a = a * b");
        System.out.println("/="+" : "+"a /= b: "+"es equivalente:"+" a = a / b");
        System.out.println("%="+" : "+"a %= b: "+"es equivalente:"+" a = a % b");
        System.out.println();

        System.out.println("Increment operators");
        //Operadores de incremento
        System.out.println("++"+" : "+"i++: "+"es equivalente:"+" i = i + 1");
        System.out.println("--"+" : "+"i--: "+"es equivalente:"+" i = i - 1");

    }
}