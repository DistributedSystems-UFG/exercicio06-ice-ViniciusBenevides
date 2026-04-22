import com.zeroc.Ice.*;

public class Client {
    public static void main(String[] args) {
        // 1. Initialize the Ice communicator within a try-with-resources block
        try (Communicator communicator = Util.initialize(args)) {

            // ----------------------------------------------------------------
            // 2a. Connect to the Printer object on the server (exercício 05)
            // ----------------------------------------------------------------
            ObjectPrx basePrinter = communicator.stringToProxy("SimplePrinter:default -h 98.90.53.6 -p 5678");
            Demo.PrinterPrx printer = Demo.PrinterPrx.checkedCast(basePrinter);

            if (printer == null) {
                throw new Error("Invalid Printer proxy");
            }

            System.out.println("=== Testando interface Printer ===");

            // printString (método original — servidor retorna string agora)
            String r1 = printer.printString("Hello from Goiania!");
            System.out.println("printString -> " + r1);

            // sayHelloTo (novo método)
            String r2 = printer.sayHelloTo("Vinicius");
            System.out.println("sayHelloTo  -> " + r2);

            // soma
            int r3 = printer.soma(10, 7);
            System.out.println("soma(10,7)  -> " + r3);

            // subtrai
            int r4 = printer.subtrai(20, 5);
            System.out.println("subtrai(20,5) -> " + r4);

            // multiplica
            int r5 = printer.multiplica(4, 6);
            System.out.println("multiplica(4,6) -> " + r5);

            // ----------------------------------------------------------------
            // 2b. Connect to the Conversor object on the same server
            // ----------------------------------------------------------------
            ObjectPrx baseConversor = communicator.stringToProxy("SimpleConversor:default -h 98.90.53.6 -p 5678");
            Demo.ConversorPrx conversor = Demo.ConversorPrx.checkedCast(baseConversor);

            if (conversor == null) {
                throw new Error("Invalid Conversor proxy");
            }

            System.out.println("\n=== Testando interface Conversor ===");

            double r6 = conversor.celsiusParaFahrenheit(100.0);
            System.out.printf("100 C em F         -> %.2f%n", r6);

            double r7 = conversor.fahrenheitParaCelsius(212.0);
            System.out.printf("212 F em C         -> %.2f%n", r7);

            double r8 = conversor.kmParaMilhas(100.0);
            System.out.printf("100 km em milhas   -> %.2f%n", r8);

            double r9 = conversor.milhasParaKm(62.0);
            System.out.printf("62 milhas em km    -> %.2f%n", r9);

            double r10 = conversor.kgParaLibras(70.0);
            System.out.printf("70 kg em libras    -> %.2f%n", r10);

            double r11 = conversor.librasParaKg(154.0);
            System.out.printf("154 libras em kg   -> %.2f%n", r11);

        } catch (LocalException e) {
            e.printStackTrace();
        }
    }
}
