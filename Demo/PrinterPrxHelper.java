// Gerado manualmente — equivalente ao slice2java do Ice 3.7.x
package Demo;

public final class PrinterPrxHelper extends com.zeroc.Ice.ObjectPrxHelperBase
    implements PrinterPrx
{
    public String printString(String s, java.util.Map<String, String> context)
    {
        return _iceI_printStringAsync(s, context, true).waitForResponse();
    }

    public String sayHelloTo(String name, java.util.Map<String, String> context)
    {
        return _iceI_sayHelloToAsync(name, context, true).waitForResponse();
    }

    public int soma(int a, int b, java.util.Map<String, String> context)
    {
        return _iceI_somaAsync(a, b, context, true).waitForResponse();
    }

    public int subtrai(int a, int b, java.util.Map<String, String> context)
    {
        return _iceI_subtraiAsync(a, b, context, true).waitForResponse();
    }

    public int multiplica(int a, int b, java.util.Map<String, String> context)
    {
        return _iceI_multiplicaAsync(a, b, context, true).waitForResponse();
    }

    public static PrinterPrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(
            obj, ice_staticId(), PrinterPrx.class, PrinterPrxHelper.class);
    }

    public static PrinterPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(
            obj, PrinterPrx.class, PrinterPrxHelper.class);
    }

    public static String ice_staticId()
    {
        return "::Demo::Printer";
    }

    private static final long serialVersionUID = 0L;
}
