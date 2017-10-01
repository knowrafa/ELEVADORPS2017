# Atividade Projeto de Software

## Enunciado do problema
Este projeto representa a abstração de um sistema automatizado de elevadores.
Exercício de fixação - Inspirado no exercício de disciplina análoga do MIT

Crie os modelos necessários para solução do problema abaixo

Você está projetando o software de controle para os elevadores para o novo prédio do INF. Você deseja chegar à essência do problema e criar um design elegante, sendo necessário modelar o arranjo de elevadores e botões e avaliar várias políticas para controlar os elevadores. Aqui estão alguns pressupostos que você pode fazer:

Há um banco de elevadores, cada um dos quais serve a mesma coleção de pisos.
Em todos os andares existem botões de escolha de andar que a pessoa quer ir. Veja o exemplo abaixo



    Dentro do elevador há apenas um botão, que o leva ao térreo.
    Um elevador pode estar em um piso ou estar entre dois andares.
    Os elevadores não mudam a direção entre os pisos.
    Todo elevador tem uma capacidade máxima de 1000 kg.
    O sistema não deve permitir que a capacidade máxima do elevador seja atingida.
    Alguns andares podem ser acessíveis somente via credencial especial de acesso.
    Você precisará descrever como as solicitações de botão são atendidas e quando elas são canceladas. Em vez de escrever um algoritmo, você deve desenvolver uma coleção de regras e investigar as conseqüências de certas combinações de regras. Por exemplo, você pode ter uma regra noSkipping que diz que um elevador não pode passar por um andar se houver um pedido para parar nesse andar.
    Você deve ser capaz de fazer algumas análises interessantes, considerando apenas transições de um estado para outro. Você provavelmente quer permitir que todos os elevadores se movam em uma transição e para que os botões sejam pressionados ao mesmo tempo.
    Você deve investigar algumas propriedades de rastreamento. Para verificar se ninguém está aguardando "morrendo de fome", por exemplo, você poderia afirmar que não há nenhum rastreamento no qual o sistema avança, retornando a um estado antigo sem atender a uma solicitação pendente.
    Esta é uma tarefa aberta e você pode torná-la tão geral como quiser. Mas você quer apontar para uma descrição de algumas políticas simples e algumas informações sobre suas ramificações, ao invés de encontrar erros em um esquema complexo que é difícil de explicar.

Quais diagramas são esperados:

    Classe
    Diagramas de sequência para diferentes operações
    Estados de um elevador
    Diagramas de atividades

Para ajudar no entendimento do projeto, recomenda-se uma breve leitura dos [diagramas](https://github.com/knowrafa/ELEVADORPS2017/tree/master/Diagramas) disponíveis no repositório.

Como executar:

O master do repositório pode ser aberto como um projeto utilizando-se alguma IDE que execute java (Eclipse, NetBeans 8.1 ou superior) ou por linhas de comando, se houver como.
