# Dio-Java-Basico
Repositórios Java Básico Dio.

# Aprendendo sobre:
# Tipos e Variáveis,Operadores,Métodos,Escopo,Palavra Reservada,Java Doc,Terminal e Argumentos.

# Tipos e Variáveis
Em Java, tipos e variáveis são fundamentais para a manipulação de dados.

Tipos Primitivos: Java tem oito tipos primitivos: byte, short, int, long, float, double, char, e boolean. Esses tipos armazenam valores simples diretamente na memória.

Variáveis: São contêineres que armazenam valores. Uma variável é declarada com um tipo específico e pode armazenar um valor desse tipo.

# Operadores
Operadores são símbolos que realizam operações em variáveis e valores.

Aritméticos: +, -, *, /, %

Relacionais: ==, !=, >, <, >=, <=

Lógicos: && (AND), || (OR), ! (NOT)

De Atribuição: =, +=, -=, *=, /=

# Métodos
Métodos em Java são blocos de código que executam tarefas específicas. Eles podem receber argumentos e retornar valores.

# Escopo
O escopo refere-se ao contexto em que uma variável ou método é acessível.

Escopo de Classe (Global): Variáveis e métodos declarados dentro da classe, mas fora de métodos, estão disponíveis em toda a classe.

Escopo de Método (Local): Variáveis declaradas dentro de um método só podem ser acessadas dentro desse método.

ex:

public class MinhaClasse {
    int x = 10; // Escopo de classe

    public void meuMetodo() {
        int y = 5; // Escopo de método
        System.out.println(x + y);
    }
}


# Palavras Reservadas

Java possui palavras reservadas que têm significados específicos e não podem ser usadas como identificadores (nomes de variáveis, classes, etc.).

Exemplos de Palavras Reservadas: class, public, static, void, if, else, while, return, int, new, try, catch, etc.

# JavaDoc

JavaDoc é uma ferramenta que gera documentação API a partir de comentários no código.

Comentários JavaDoc: São escritos entre /** e */ e geralmente colocados antes de declarações de classes, métodos, ou campos.

# Terminal e Argumentos

O terminal (ou linha de comando) é usado para compilar e executar programas Java. Argumentos de linha de comando são parâmetros que podem ser passados para o método main.

# Conclusão
Esses conceitos são os pilares do desenvolvimento em Java. Entender como cada um funciona e como eles interagem entre si é essencial para escrever código eficiente e claro.



