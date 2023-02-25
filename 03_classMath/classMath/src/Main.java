public class Main {
    public static void main(String[] args) {
        System.out.println("CLASS MATH");
        System.out.println("Math is a Java class that helps us to execute different mathematical operations.");
        //Math es una clase de Java que nos ayuda a ejecutar diferentes operaciones matemáticas.

        double pi=Math.PI; // 3.141592653589793
        double EulerNumber=Math.E; // 2.718281828459045

        System.out.println("number PI= "+pi);
        System.out.println("number Euler= "+EulerNumber);

        System.out.println();
        System.out.println("Math.ceil= round up a decimal number value (2.1)");
        System.out.println(Math.ceil(2.1)); // 3.0 (redondear hacia arriba)

        System.out.println();
        System.out.println("Math.floor= round down a decimal number value (2.1)");
        System.out.println(Math.floor(2.1)); // 2.0 (redondear hacia abajo)

        System.out.println();
        System.out.println("Math.pow= number raised to a power; 2 raised to the power of 3");
        System.out.println(Math.pow(2, 3)); // 8.0 (número elevado a una potencia)

        System.out.println();
        System.out.println("Math.sqrt= returns the square root of a number(3)");
        System.out.println(Math.sqrt(3)); // 1.73... (raíz cuadrada)

        System.out.println();
        System.out.println("Math.max= returns the greater of 2 numbers(2,3)");
        System.out.println(Math.max(2, 3)); // 3.0 (el número más grande)

        double radio=23;

        System.out.println();
        System.out.println("Examples:");
        System.out.println("Area of a circle (PI * radio^2)");
        // Área de un círculo (PI * radio^2):
        double areaCircle=Math.PI * Math.pow(radio, 2);
        System.out.println(areaCircle);

        System.out.println();
        System.out.println("Area of a sphere (4 * PI * radio^2)");
        // Área de una esfera (4 * PI * radio^2):
        double areaSphere=4 * Math.PI * Math.pow(radio, 2);
        System.out.println(areaSphere);

        System.out.println();
        System.out.println("volume of a sphere ( (4/3) * PI * radio^3)");
        // Volumen de una esfera ( (4/3) * PI * radio^3):
        double volumeSphere=(4/3) * Math.PI * Math.pow(radio, 3);
        System.out.println(volumeSphere);
    }
}