// Gerado manualmente — equivalente ao slice2java do Ice 3.7.x
package Demo;

public interface ConversorPrx extends com.zeroc.Ice.ObjectPrx
{
    // --- celsiusParaFahrenheit ---
    default double celsiusParaFahrenheit(double celsius)
    {
        return celsiusParaFahrenheit(celsius, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default double celsiusParaFahrenheit(double celsius, java.util.Map<String, String> context)
    {
        return _iceI_celsiusParaFahrenheitAsync(celsius, context, true).waitForResponse();
    }

    default com.zeroc.Ice.AsyncResult<java.util.function.Consumer<Double>> _iceI_celsiusParaFahrenheitAsync(
        double celsius, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.Ice.OutgoingAsync<Double> f =
            new com.zeroc.Ice.OutgoingAsync<>(this, "celsiusParaFahrenheit", null, sync, null);
        f.invoke(true, context, null,
            ostr -> { ostr.writeDouble(celsius); },
            istr -> { return istr.readDouble(); });
        return f;
    }

    // --- fahrenheitParaCelsius ---
    default double fahrenheitParaCelsius(double fahrenheit)
    {
        return fahrenheitParaCelsius(fahrenheit, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default double fahrenheitParaCelsius(double fahrenheit, java.util.Map<String, String> context)
    {
        return _iceI_fahrenheitParaCelsiusAsync(fahrenheit, context, true).waitForResponse();
    }

    default com.zeroc.Ice.AsyncResult<java.util.function.Consumer<Double>> _iceI_fahrenheitParaCelsiusAsync(
        double fahrenheit, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.Ice.OutgoingAsync<Double> f =
            new com.zeroc.Ice.OutgoingAsync<>(this, "fahrenheitParaCelsius", null, sync, null);
        f.invoke(true, context, null,
            ostr -> { ostr.writeDouble(fahrenheit); },
            istr -> { return istr.readDouble(); });
        return f;
    }

    // --- kmParaMilhas ---
    default double kmParaMilhas(double km)
    {
        return kmParaMilhas(km, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default double kmParaMilhas(double km, java.util.Map<String, String> context)
    {
        return _iceI_kmParaMilhasAsync(km, context, true).waitForResponse();
    }

    default com.zeroc.Ice.AsyncResult<java.util.function.Consumer<Double>> _iceI_kmParaMilhasAsync(
        double km, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.Ice.OutgoingAsync<Double> f =
            new com.zeroc.Ice.OutgoingAsync<>(this, "kmParaMilhas", null, sync, null);
        f.invoke(true, context, null,
            ostr -> { ostr.writeDouble(km); },
            istr -> { return istr.readDouble(); });
        return f;
    }

    // --- milhasParaKm ---
    default double milhasParaKm(double milhas)
    {
        return milhasParaKm(milhas, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default double milhasParaKm(double milhas, java.util.Map<String, String> context)
    {
        return _iceI_milhasParaKmAsync(milhas, context, true).waitForResponse();
    }

    default com.zeroc.Ice.AsyncResult<java.util.function.Consumer<Double>> _iceI_milhasParaKmAsync(
        double milhas, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.Ice.OutgoingAsync<Double> f =
            new com.zeroc.Ice.OutgoingAsync<>(this, "milhasParaKm", null, sync, null);
        f.invoke(true, context, null,
            ostr -> { ostr.writeDouble(milhas); },
            istr -> { return istr.readDouble(); });
        return f;
    }

    // --- kgParaLibras ---
    default double kgParaLibras(double kg)
    {
        return kgParaLibras(kg, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default double kgParaLibras(double kg, java.util.Map<String, String> context)
    {
        return _iceI_kgParaLibrasAsync(kg, context, true).waitForResponse();
    }

    default com.zeroc.Ice.AsyncResult<java.util.function.Consumer<Double>> _iceI_kgParaLibrasAsync(
        double kg, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.Ice.OutgoingAsync<Double> f =
            new com.zeroc.Ice.OutgoingAsync<>(this, "kgParaLibras", null, sync, null);
        f.invoke(true, context, null,
            ostr -> { ostr.writeDouble(kg); },
            istr -> { return istr.readDouble(); });
        return f;
    }

    // --- librasParaKg ---
    default double librasParaKg(double libras)
    {
        return librasParaKg(libras, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default double librasParaKg(double libras, java.util.Map<String, String> context)
    {
        return _iceI_librasParaKgAsync(libras, context, true).waitForResponse();
    }

    default com.zeroc.Ice.AsyncResult<java.util.function.Consumer<Double>> _iceI_librasParaKgAsync(
        double libras, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.Ice.OutgoingAsync<Double> f =
            new com.zeroc.Ice.OutgoingAsync<>(this, "librasParaKg", null, sync, null);
        f.invoke(true, context, null,
            ostr -> { ostr.writeDouble(libras); },
            istr -> { return istr.readDouble(); });
        return f;
    }

    // --- factory methods ---
    static ConversorPrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(
            obj, ice_staticId(), ConversorPrx.class, ConversorPrxHelper.class);
    }

    static ConversorPrx checkedCast(com.zeroc.Ice.ObjectPrx obj,
                                     java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(
            obj, context, ice_staticId(), ConversorPrx.class, ConversorPrxHelper.class);
    }

    static ConversorPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(
            obj, ConversorPrx.class, ConversorPrxHelper.class);
    }

    static String ice_staticId()
    {
        return "::Demo::Conversor";
    }

    default ConversorPrx ice_context(java.util.Map<String, String> ctx)
    {
        return (ConversorPrx) _ice_context(ctx);
    }
}
