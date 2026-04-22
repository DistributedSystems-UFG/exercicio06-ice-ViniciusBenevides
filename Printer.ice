module Demo
{
    interface Printer
    {
        string printString(string s);
        string sayHelloTo(string name);
        int soma(int a, int b);
        int subtrai(int a, int b);
        int multiplica(int a, int b);
    }

    interface Conversor
    {
        double celsiusParaFahrenheit(double celsius);
        double fahrenheitParaCelsius(double fahrenheit);
        double kmParaMilhas(double km);
        double milhasParaKm(double milhas);
        double kgParaLibras(double kg);
        double librasParaKg(double libras);
    }
}
