# Atividade Prática - Capítulo 9: Subprogramas
**Disciplina:** Linguagem de Programação  
**Aluno:** Davi Lima de Oliveira  
**Turma:** LNPG-BSI-2026.1  
**Repositório:** 1npg-cap9-subprogramas-Davi-Lima

## 📝 Descrição do Projeto
Este repositório contém as atividades práticas referentes ao estudo de subprogramas, modularização e mecanismos de passagem de parâmetros, utilizando as linguagens Java e Python.

---

## 🛠️ Instruções de Execução

### Java (Tarefas 1, 3 e 4)
1. Certifique-se de ter o JDK instalado.
2. Navegue até a pasta da tarefa: `cd tarefaX-java...`
3. Compile o código: `javac NomeDoArquivo.java`
4. Execute: `java NomeDoArquivo`

### Python (Tarefas 2 e 5)
1. Certifique-se de ter o Python 3 instalado.
2. Navegue até a pasta: `cd tarefaX-python...`
3. Execute: `python nome_do_arquivo.py`

---

## 📂 Tarefas e Discussões

### Tarefa 1 - Controle Acadêmico (Java)
**Descrição:** Sistema que lê notas de 5 alunos e determina a situação acadêmica.
- **Versão Monolítica:** Toda a lógica (leitura, cálculo e exibição) concentrada no método `main`.
- **Versão Modularizada:** Divisão em métodos específicos: `lerAluno`, `lerNotas`, `calcularMedia`, `determinarSituacao` e `imprimirRelatorio`.

**Comparação Monolítica vs Modularizada:**
- **Legibilidade:** A versão modularizada é muito mais fácil de ler, pois o `main` funciona como um índice do que o programa faz.
- **Reutilização:** O método `calcularMedia` poderia ser usado em qualquer outra parte do sistema sem reescrita.
- **Manutenção:** Se a regra de aprovação mudar, alteramos apenas o método `determinarSituacao`, sem risco de afetar a entrada de dados.
- **Coesão:** Cada subprograma possui uma única responsabilidade clara.

### Tarefa 2 - Sistema de Vendas (Python)
**Descrição:** Processa a venda de um produto com descontos progressivos (5% acima de R$ 200 e 10% acima de R$ 500).

**Discussão Técnica:**
- **Partes Repetitivas:** Identificou-se que cálculos de desconto e formatação de cupom são frequentemente repetidos; transformá-los em funções elimina redundância.
- **Vantagens:** A modularização permitiu separar a "lógica de negócio" (regras de desconto) da "interface" (inputs e prints).

### Tarefa 3 - Passagem de Parâmetro por Valor (Java)
**Descrição:** Experimento para observar o comportamento de tipos primitivos (`int`) em chamadas de métodos.

**Respostas Obrigatórias:**
1. **Por que o valor original não mudou?** Porque o Java cria uma cópia local do valor na memória para o método usar.
2. **O que significa "passagem por valor"?** Significa que o subprograma recebe o conteúdo da variável, mas não tem acesso à variável original no `main`.
3. **Qual valor realmente foi copiado?** O valor literal (o número inteiro) foi duplicado em uma nova posição de memória (pilha).

### Tarefa 4 - Objetos e Referência (Java)
**Descrição:** Uso de uma classe `Produto` para observar como objetos se comportam em métodos.

**Respostas Obrigatórias:**
1. **Java possui passagem por referência verdadeira?** Não. Java utiliza exclusivamente passagem por valor.
2. **O que exatamente é copiado na chamada?** É copiado o valor da **referência** (o endereço de memória onde o objeto está guardado).
3. **Por que alterações no objeto permanecem?** Como o método recebe uma cópia do endereço, ele aponta para o mesmo objeto na memória (Heap) que o `main`. Alterar o atributo via referência afeta o objeto compartilhado.

### Tarefa 5 - Projeto Livre: Jogo de RPG (Python)
**Descrição:** Um simulador de batalha em turnos contra um dragão.
**Subprogramas utilizados:** `mostrar_status`, `calcular_dano` (Retorno 1), `usar_pocao`, `turno_dragao`, `verificar_vitoria` (Retorno 2) e `main`.

**Relatório do Projeto:**
- **Justificativa:** A divisão permitiu que a função `calcular_dano` fosse reutilizada tanto pelo jogador quanto pelo dragão, garantindo consistência nas regras de combate.
- **Dificuldades:** Gerenciar a atualização das variáveis de vida entre as diferentes funções e garantir que o loop do jogo parasse no momento exato da vitória/derrota.
- **Vantagens Percebidas:** O código ficou extremamente organizado. Adicionar novos recursos (como um novo tipo de ataque) seria simples, bastando criar uma nova função sem mexer na estrutura principal.

**Diagrama de Chamadas Simples:**
`Main -> mostrar_status`  
`Main -> calcular_dano (Ataque Jogador)`  
`Main -> verificar_vitoria`  
`Main -> turno_dragao -> calcular_dano (Ataque Dragão)`  
`Main -> usar_pocao`
