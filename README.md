# Explorando Padrões de Projetos na Prática com Java

Repositório com as implementações dos padrões de projeto explorados no Lab "Explorando Padrões de Projetos na Prática com Java". Especificamente, este projeto explorou alguns padrões usando Java puro:

## Singleton

O padrão Singleton é um design pattern que garante que uma classe tenha uma única instância e fornece um ponto global para acessá-la. Vale ressaltar que em casos de aplicação multithread é importante, e necessário, adicionar um thread lock no método estático da classe.

| Prós | Contras |
|:---: |  :---:  |
| Certeza de que uma classe possui apenas uma única instância.  | Viola o Princípio da Responsabilidade Única. O padrão resolve dois problemas ao mesmo tempo. |
| Ponto de acesso global para essa instância.| O padrão Singleton pode mascarar um design ruim, por exemplo, quando os componentes do programa sabem demais um sobre o outro. |
| Inicializado apenas quando é solicitado pela primeira vez. | Requer tratamento especial em um ambiente multithread. |


## Strategy

Define que uma classe (chamada de `context`) deve possuir um campo para armazenar um atributo do tipo *interface*(`strategy`) - a qual deriva em classes (`concrete strategies`) que aplicam seus métodos, no entanto vale ressaltar que o campo é responsável por armazenar *apenas uma estratégia por vez*. 

Sendo assim é possível que o cliente (`client`), ao informar ao *context* a estratégia desejada, lide com diferentes classes como se fossem todas da mesma característica (por meio da interface) e ainda aproveite os métodos de contrato da interface.

Exemplo genérico:

```
// Interface que define a estratégia
interface Comportamento {
    void executar();
}

// Implementações da interface
class ComportamentoA implements Comportamento {
    @Override
    public void executar() {
        System.out.println("Executando Comportamento A");
    }
}

class ComportamentoB implements Comportamento {
    @Override
    public void executar() {
        System.out.println("Executando Comportamento B");
    }
}

// Classe que possui o atributo de estratégia
class ObjetoComEstrategia {
    private Comportamento strategy;

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }

    public void executarComportamento() {
        if (strategy != null) {
            strategy.executar();
        } else {
            System.out.println("Nenhuma estratégia definida.");
        }
    }
}

```

| Classe                    | Atributos/Métodos                          |
|---------------------------|--------------------------------------------|
| ObjetoComEstrategia     | - strategy: Comportamento<br> + setStrategy(strategy: Comportamento)<br> + executarComportamento() |
| Comportamento           | + executar()                              |
| ComportamentoA          | + executar()                              |
| ComportamentoB          | + executar()                              |

| Prós | Contras  |
|:---:|:---:|
| Troca de algoritmos usados dentro de um objeto no RunTime. | O client deve instanciar todas as estratégias concretas. |
| Cada estratégia representa uma maneira diferente de realizar uma tarefa específica. | Em alguns contextos pode apenas complicar/poluir o programa com novas classes e interfaces. |
| Promove um acoplamento mais fraco e maior flexibilidade (Composição x Herança). |  |
| Introdução de estratégias concretas sem manutenção do contexto. |  |

## Facade

Define uma classe de fachada que tem como intuito agrupar um conjunto de outras fachadas e, obrigatoriamente, subsistemas, os quais são outras classes que possam servir ao facade. A fachada prove acesso a funcionalidades de subsistemas particulares ao seu uso, sendo capaz de direcionar o pedido do cliente e tendo noção de como operar.

A integração de demais fachadas¹ deve ser considerada em casos que a inicial se torne uma espécie de glasse globalizadora (evitando uma poluição de código) - aquela que realiza diversos métodos e fere o principio *Single-Responsability*; outro violado seria o *Open-Closed* visto que o acesso é feito por meio de importações e não implementação ou herança.

¹ *Elas devem poder ser acessadas tanto pela fachada principal quanto pelo cliente*