# Atividade_Pratica_3_Java

Exerc´ıcio - Agenda Telefˆonica
Vocˆe foi contratado para implementar um aplicativo de agenda eletrˆonica. O sistema dever´a permitir o cadastro
e gerenciamento de diferentes tipos de contatos. Se necess´ario, vocˆe pode criar mais atributos e m´etodos do que
os solicitados, desde que fa¸cam sentido para o contexto do problema.
N˜ao se esque¸ca de criar os m´etodos get e set para todos os atributos.
1. Crie uma classe Contato com os seguintes atributos: nome (String), email (String), telefone (String)
2. Crie um m´etodo para exibir os dados do contato.
3. Crie as Seguintes subclasses para Contato:
• ContatoPessoal - Representa amigos e familiares. Atributos adicionais: dataAniversario (String),
parentesco (String)
• ContatoProfissional - Representa contatos relacionados ao trabalho. Atributos adicionais: empresa
(String), cargo (String)
• ContatoEmergencia - Representa contatos que podem ser acionados em situa¸c˜oes de emergˆencia.
Atributos adicionais: grauPrioridade (int - valor de 1 a 5), observacao (String)
4. Crie outra classe, chamada Agenda, que possui uma lista de contatos e um atributo para armazenar a
quantidade de contatos cadastrados.
5. Na classe Agenda crie os seguintes m´etodos:
• Adicionar contato - adiciona um contato `a lista e atualize o tamanho da lista.
• Remover contato - excluir um contato da lista e atualiza o tamanho da Agenda. Retorne ao usu´ario
se a exclus˜ao foi bem sucedida ou n˜ao (contato encontrado ou n˜ao).
• Buscar contato por nome - busca um contato pelo nome e retorna o contato encontrado (instˆancia
da classe Contato).
• Buscar contato por email - busca um contato pelo email e retorna o contato encontrado (instˆancia
da classe Contato).
• Buscar contato por telefone - busca um contato pelo nome e retorna o contato encontrado (instˆancia
da classe Contato).
6. Na classe main apresente um menu para o usu´ario com as seguintes op¸c˜oes:
(a) Adicionar contato
(b) Remover contato - caso o usu´ario n˜ao seja encontrado o usu´ario deve ser informado
(c) Buscar contato por nome - caso o contato n˜ao seja encontrado o usu´ario deve ser informado
(d) Buscar contato por email - caso o contato n˜ao seja encontrado o usu´ario deve ser informado
(e) Buscar contato por telefone - caso o contato n˜ao seja encontrado o usu´ario deve ser informado
(f) Consultar tamanho da Agenda - caso o contato n˜ao seja encontrado o usu´ario deve ser informado
(g) Finalizar - o programa s´o deve encerrar quando o usu´ario selecionar esta op¸c˜ao.
1
– Pr´atica 3 - Heran¸ca e Polimorfismo 2
Exerc´ıcio - Sistema de Venda de Ingressos para Eventos
ocˆe foi contratado para desenvolver um sistema de venda de ingressos para eventos. O sistema dever´a per-
mitir o cadastro de diferentes tipos de ingressos e o c´alculo do valor final de cada ingresso de acordo com suas
regras espec´ıficas.
1. Crie uma classe abstrata chamada Ingresso:
• atributos: codigo (int), nomeEvento (String), setor (String), valorBase (double)
• m´etodo concreto para exibir as informa¸c˜oes b´asicas do ingresso
• m´etodos abstratos: double calcularValorFinal(), String obterBeneficios()
2. Crie as Seguintes subclasses para Ingresso:
• IngressoComum - Representa um ingresso tradicional, sem descontos ou benef´ıcios especiais.
– Atributos espec´ıficos: Nenhum atributo adicional.
– Regras:
∗ O valor final ´e igual ao valor base.
∗ N˜ao possui benef´ıcios adicionais.
• IngressoEstudante - Representa ingressos adquiridos por estudantes.
– Atributos espec´ıficos: instituicaoEnsino (String)
– Regras:
∗ Possui 50% de desconto sobre o valor base.
∗ Deve informar como benef´ıcio o direito `a meia-entrada.
• IngressoVIP - Representa ingressos com acesso privilegiado ao evento.
– Atributos espec´ıficos: acessoBackstage (boolean), numeroLounge (int)
– Regras:
∗ Acr´escimo de 80% sobre o valor base.
∗ Deve informar os benef´ıcios dispon´ıveis.
∗ Caso possua acesso ao backstage, esta informa¸c˜ao deve ser exibida.
3. Crie uma chamada Bilheteria, que possui uma lista de ingressos.
4. Na classe Bilheteria crie os seguintes m´etodos:
• Adicionar ingresso - Adiciona um ingresso `a lista.
• Remover ingresso - Remove um ingresso a partir do c´odigo informado. Retorne ao usu´ario se a
opera¸c˜ao foi realizada com sucesso.
• Buscar ingresso - Recebe um c´odigo e retorna o ingresso correspondente.
• Listar ingressos - Exibe todos os ingressos cadastrados. Utilize polimorfismo para que o sistema exiba
corretamente as informa¸c˜oes de cada tipo de ingresso.
• Calcular arrecada¸c˜ao total - Percorre todos os ingressos cadastrados e retorna a soma dos valores
finais dos ingressos. Observa¸c˜ao: utilize o m´etodo calcularValorFinal() para realizar o c´alculo.
• Listar benef´ıcios dos ingressos: Exibe os benef´ıcios de todos os ingressos cadastrados. Observa¸c˜ao:
utilize o m´etodo obterBeneficios().
5. Na classe main apresente um menu para o usu´ario com as seguintes op¸c˜oes:
(a) Cadastrar ingresso - o usu´ario deve escolher o tipo de ingresso.
(b) Remover ingresso - Caso o c´odigo n˜ao seja encontrado, o usu´ario dever´a ser informado.
(c) Buscar ingresso por c´odigo - Exibir todas as informa¸c˜oes do ingresso encontrado. Caso o c´odigo n˜ao
exista, informar o usu´ario.
(d) Listar todos os ingressos - Exibir todos os ingressos cadastrados.
(e) Calcular arrecada¸c˜ao total - Exibir a soma dos valores finais de todos os ingressos cadastrados.
(f) Listar benef´ıcios dos ingressos - Exibir os benef´ıcios oferecidos por cada ingresso.
(g) Finalizar - o programa s´o deve encerrar quando o usu´ario selecionar esta op¸c˜ao
