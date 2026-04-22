// Gerado manualmente — equivalente ao slice2java do Ice 3.7.x
package Demo;

public final class ConversorPrxHelper extends com.zeroc.Ice.ObjectPrxHelperBase
    implements ConversorPrx
{
    public double celsiusParaFahrenheit(double celsius, java.util.Map<String, String> context)
    {
        return _iceI_celsiusParaFahrenheitAsync(celsius, context, true).waitForResponse();
    }

    public double fahrenheitParaCelsius(double fahrenheit, java.util.Map<String, String> context)
    {
        return _iceI_fahrenheitParaCelsiusAsync(fahrenheit, context, true).waitForResponse();
    }

    public double kmParaMilhas(double km, java.util.Map<String, String> context)
    {
        return _iceI_kmParaMilhasAsync(km, context, true).waitForResponse();
    }

    public double milhasParaKm(double milhas, java.util.Map<String, String> context)
    {
        return _iceI_milhasParaKmAsync(milhas, context, true).waitForResponse();
    }

    public double kgParaLibras(double kg, java.util.Map<String, String> context)
    {
        return _iceI_kgParaLibrasAsync(kg, context, true).waitForResponse();
    }

    public double librasParaKg(double libras, java.util.Map<String, String> context)
    {
        return _iceI_librasParaKgAsync(libras, context, true).waitForResponse();
    }

    public static ConversorPrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(
            obj, ice_staticId(), ConversorPrx.class, ConversorPrxHelper.class);
    }

    public static ConversorPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(
            obj, ConversorPrx.class, ConversorPrxHelper.class);
    }

    public static String ice_staticId()
    {
        return "::Demo::Conversor";
    }

    private static final long serialVersionUID = 0L;
}
