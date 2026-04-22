import com.zeroc.Ice.*;

// ============================================================
// Implementação do objeto Printer em Java
// ============================================================
class PrinterI implements Demo.Printer {

    @Override
    public String printString(String s, Current current) {
        String response = "[Servidor Java] Mensagem recebida: " + s;
        System.out.println("[printString] " + response);
        return response;
    }

    @Override
    public String sayHelloTo(String name, Current current) {
        String msg = "Hello, " + name + "! Bem-vindo ao servidor Java ICE!";
        System.out.println("[sayHelloTo] " + msg);
        return msg;
    }

    @Override
    public int soma(int a, int b, Current current) {
        int resultado = a + b;
        System.out.printf("[soma] %d + %d = %d%n", a, b, resultado);
        return resultado;
    }

    @Override
    public int subtrai(int a, int b, Current current) {
        int resultado = a - b;
        System.out.printf("[subtrai] %d - %d = %d%n", a, b, resultado);
        return resultado;
    }

    @Override
    public int multiplica(int a, int b, Current current) {
        int resultado = a * b;
        System.out.printf("[multiplica] %d * %d = %d%n", a, b, resultado);
        return resultado;
    }
}

// ============================================================
// Implementação do objeto Conversor em Java
// ============================================================
class ConversorI implements Demo.Conversor {

    @Override
    public double celsiusParaFahrenheit(double celsius, Current current) {
        double resultado = celsius * 9.0 / 5.0 + 32.0;
        System.out.printf("[celsiusParaFahrenheit] %.1fC = %.2fF%n", celsius, resultado);
        return resultado;
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit, Current current) {
        double resultado = (fahrenheit - 32.0) * 5.0 / 9.0;
        System.out.printf("[fahrenheitParaCelsius] %.1fF = %.2fC%n", fahrenheit, resultado);
        return resultado;
    }

    @Override
    public double kmParaMilhas(double km, Current current) {
        double resultado = km * 0.621371;
        System.out.printf("[kmParaMilhas] %.3f km = %.2f milhas%n", km, resultado);
        return resultado;
    }

    @Override
    public double milhasParaKm(double milhas, Current current) {
        double resultado = milhas * 1.60934;
        System.out.printf("[milhasParaKm] %.1f milhas = %.2f km%n", milhas, resultado);
        return resultado;
    }

    @Override
    public double kgParaLibras(double kg, Current current) {
        double resultado = kg * 2.20462;
        System.out.printf("[kgParaLibras] %.1f kg = %.2f libras%n", kg, resultado);
        return resultado;
    }

    @Override
    public double librasParaKg(double libras, Current current) {
        double resultado = libras * 0.453592;
        System.out.printf("[librasParaKg] %.1f libras = %.2f kg%n", libras, resultado);
        return resultado;
    }
}

// ============================================================
// Servidor principal
// ============================================================
public class Server {
    public static void main(String[] args) {
        // Use try-with-resources to ensure communicator is destroyed on exit
        try (Communicator communicator = Util.initialize(args)) {

            // Graceful shutdown on Ctrl+C
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("\nServidor encerrando...");
                communicator.destroy();
            }));

            // Create the object adapter listening on port 5678 (same as ex05 server)
            ObjectAdapter adapter = communicator.createObjectAdapterWithEndpoints(
                    "SimpleAdapter", "default -p 5678");

            // Register Printer object
            PrinterI printerObj = new PrinterI();
            adapter.add(printerObj, Util.stringToIdentity("SimplePrinter"));
            System.out.println("Objeto Printer registrado (SimplePrinter)");

            // Register Conversor object
            ConversorI conversorObj = new ConversorI();
            adapter.add(conversorObj, Util.stringToIdentity("SimpleConversor"));
            System.out.println("Objeto Conversor registrado (SimpleConversor)");

            adapter.activate();
            System.out.println("Servidor Java ICE pronto na porta 5678. Aguardando chamadas...");

            communicator.waitForShutdown();
        } catch (LocalException e) {
            e.printStackTrace();
        }
    }
}
