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

## Facade
