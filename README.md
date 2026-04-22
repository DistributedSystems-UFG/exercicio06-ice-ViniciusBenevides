[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/AGZSOySv)

## Exercício 06 — ICE Java Client + Java Server

### Objetivo
1. Executar o **cliente Java** conectado ao **servidor Python** do Exercício 05 (máquinas separadas).
2. Estender o cliente para chamar **todos os novos métodos** do servidor (Printer e Conversor).
3. Criar um **servidor Java** implementando a mesma interface.

---

### Interface (Printer.ice)

```slice
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
```

---

### Instalação (Amazon Linux / EC2)

#### JDK 17 (Amazon Corretto)
```bash
sudo dnf install java-17-amazon-corretto-devel -y
```

#### Repositório ZeroC Ice 3.7
```bash
sudo dnf install https://download.zeroc.com/ice/3.7/amzn2023/ice-repo-3.7.amzn2023.noarch.rpm -y
```

#### Compilador Slice
```bash
sudo dnf install ice-compilers -y
```

#### Runtime ICE (JAR)
```bash
wget https://repo1.maven.org/maven2/com/zeroc/ice/3.7.11/ice-3.7.11.jar
```

---

### Instalação (Ubuntu)

```bash
sudo apt update && sudo apt install default-jdk -y
wget "https://download.zeroc.com/ice/3.7/ubuntu24.04/ice-repo-3.7_1.0.0_all.deb" -O ice-repo.deb
sudo dpkg -i ice-repo.deb && rm ice-repo.deb
sudo apt-get update
sudo apt-get install zeroc-ice-compilers -y
wget https://repo1.maven.org/maven2/com/zeroc/ice/3.7.11/ice-3.7.11.jar
```

---

### Compilação

```bash
# 1. Gera os stubs Java a partir da interface Slice
slice2java Printer.ice

# 2. Compila Cliente e Servidor
javac -cp ".:ice-3.7.11.jar" Client.java Server.java Demo/*.java
```

---

### Parte 1 — Cliente Java + Servidor Python (Exercício 05)

> Servidor Python roda na máquina remota (porta 5678). Cliente Java roda localmente.

```bash
java -cp ".:ice-3.7.11.jar" Client
```

O cliente chama:
- `printer.printString("Hello from Goiania!")`
- `printer.sayHelloTo("Vinicius")`
- `printer.soma(10, 7)`
- `printer.subtrai(20, 5)`
- `printer.multiplica(4, 6)`
- `conversor.celsiusParaFahrenheit(100.0)`
- `conversor.fahrenheitParaCelsius(212.0)`
- `conversor.kmParaMilhas(100.0)`
- `conversor.milhasParaKm(62.0)`
- `conversor.kgParaLibras(70.0)`
- `conversor.librasParaKg(154.0)`

---

### Parte 2 — Servidor Java

> Substitui o servidor Python. Implementa a mesma interface em Java.

```bash
java -cp ".:ice-3.7.11.jar" Server
```

Para testar com o cliente apontando para o servidor Java local, edite o IP em `Client.java`:
```java
// Troque o IP pelo endereço da máquina que roda o Server.java
communicator.stringToProxy("SimplePrinter:default -h <IP_DO_SERVIDOR> -p 5678");
```

---

### Nota
Configure o IP e a porta conforme a topologia da sua rede.
