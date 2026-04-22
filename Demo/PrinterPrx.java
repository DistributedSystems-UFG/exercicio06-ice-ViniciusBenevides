// Gerado manualmente — equivalente ao slice2java do Ice 3.7.x
package Demo;

public interface PrinterPrx extends com.zeroc.Ice.ObjectPrx
{
    default String printString(String s)
    {
        return printString(s, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default String printString(String s, java.util.Map<String, String> context)
    {
        return _iceI_printStringAsync(s, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<String> printStringAsync(String s)
    {
        return _iceI_printStringAsync(s, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default com.zeroc.Ice.AsyncResult<java.util.function.Consumer<String>> _iceI_printStringAsync(
        String s, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.Ice.OutgoingAsync<String> f =
            new com.zeroc.Ice.OutgoingAsync<>(this, "printString", null, sync, null);
        f.invoke(true, context, null,
            ostr -> { ostr.writeString(s); },
            istr -> { return istr.readString(); });
        return f;
    }

    // --- sayHelloTo ---
    default String sayHelloTo(String name)
    {
        return sayHelloTo(name, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default String sayHelloTo(String name, java.util.Map<String, String> context)
    {
        return _iceI_sayHelloToAsync(name, context, true).waitForResponse();
    }

    default com.zeroc.Ice.AsyncResult<java.util.function.Consumer<String>> _iceI_sayHelloToAsync(
        String name, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.Ice.OutgoingAsync<String> f =
            new com.zeroc.Ice.OutgoingAsync<>(this, "sayHelloTo", null, sync, null);
        f.invoke(true, context, null,
            ostr -> { ostr.writeString(name); },
            istr -> { return istr.readString(); });
        return f;
    }

    // --- soma ---
    default int soma(int a, int b)
    {
        return soma(a, b, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default int soma(int a, int b, java.util.Map<String, String> context)
    {
        return _iceI_somaAsync(a, b, context, true).waitForResponse();
    }

    default com.zeroc.Ice.AsyncResult<java.util.function.Consumer<Integer>> _iceI_somaAsync(
        int a, int b, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.Ice.OutgoingAsync<Integer> f =
            new com.zeroc.Ice.OutgoingAsync<>(this, "soma", null, sync, null);
        f.invoke(true, context, null,
            ostr -> { ostr.writeInt(a); ostr.writeInt(b); },
            istr -> { return istr.readInt(); });
        return f;
    }

    // --- subtrai ---
    default int subtrai(int a, int b)
    {
        return subtrai(a, b, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default int subtrai(int a, int b, java.util.Map<String, String> context)
    {
        return _iceI_subtraiAsync(a, b, context, true).waitForResponse();
    }

    default com.zeroc.Ice.AsyncResult<java.util.function.Consumer<Integer>> _iceI_subtraiAsync(
        int a, int b, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.Ice.OutgoingAsync<Integer> f =
            new com.zeroc.Ice.OutgoingAsync<>(this, "subtrai", null, sync, null);
        f.invoke(true, context, null,
            ostr -> { ostr.writeInt(a); ostr.writeInt(b); },
            istr -> { return istr.readInt(); });
        return f;
    }

    // --- multiplica ---
    default int multiplica(int a, int b)
    {
        return multiplica(a, b, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default int multiplica(int a, int b, java.util.Map<String, String> context)
    {
        return _iceI_multiplicaAsync(a, b, context, true).waitForResponse();
    }

    default com.zeroc.Ice.AsyncResult<java.util.function.Consumer<Integer>> _iceI_multiplicaAsync(
        int a, int b, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.Ice.OutgoingAsync<Integer> f =
            new com.zeroc.Ice.OutgoingAsync<>(this, "multiplica", null, sync, null);
        f.invoke(true, context, null,
            ostr -> { ostr.writeInt(a); ostr.writeInt(b); },
            istr -> { return istr.readInt(); });
        return f;
    }

    // --- factory methods ---
    static PrinterPrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(
            obj, ice_staticId(), PrinterPrx.class, PrinterPrxHelper.class);
    }

    static PrinterPrx checkedCast(com.zeroc.Ice.ObjectPrx obj,
                                   java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(
            obj, context, ice_staticId(), PrinterPrx.class, PrinterPrxHelper.class);
    }

    static PrinterPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(
            obj, PrinterPrx.class, PrinterPrxHelper.class);
    }

    static String ice_staticId()
    {
        return "::Demo::Printer";
    }

    default PrinterPrx ice_context(java.util.Map<String, String> ctx)
    {
        return (PrinterPrx) _ice_context(ctx);
    }
}
