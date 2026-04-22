// Gerado manualmente — equivalente ao slice2java do Ice 3.7.x
package Demo;

public interface Conversor extends com.zeroc.Ice.Object
{
    double celsiusParaFahrenheit(double celsius, com.zeroc.Ice.Current current);
    double fahrenheitParaCelsius(double fahrenheit, com.zeroc.Ice.Current current);
    double kmParaMilhas(double km, com.zeroc.Ice.Current current);
    double milhasParaKm(double milhas, com.zeroc.Ice.Current current);
    double kgParaLibras(double kg, com.zeroc.Ice.Current current);
    double librasParaKg(double libras, com.zeroc.Ice.Current current);

    static String ice_staticId()
    {
        return "::Demo::Conversor";
    }
}
