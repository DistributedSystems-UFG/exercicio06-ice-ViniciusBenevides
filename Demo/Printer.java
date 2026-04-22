// Gerado manualmente — equivalente ao slice2java do Ice 3.7.x
package Demo;

public interface Printer extends com.zeroc.Ice.Object
{
    String printString(String s, com.zeroc.Ice.Current current);
    String sayHelloTo(String name, com.zeroc.Ice.Current current);
    int soma(int a, int b, com.zeroc.Ice.Current current);
    int subtrai(int a, int b, com.zeroc.Ice.Current current);
    int multiplica(int a, int b, com.zeroc.Ice.Current current);

    static String ice_staticId()
    {
        return "::Demo::Printer";
    }
}
