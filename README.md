# ToDoList
## Descrição
Projeto Started - ToDOList - Triadworks 2017

A idéia era de se realizar o projeto para que eu pudesse aplicar os conceitos de JavaEE (MVC Action Based, JSP, JSTL, CSS, JavaScript e etc).

## Requisitos
```
Descrição: Um projeto simples WEB onde teremos um CRUD. Deve-se cadastrar uma tarefa e atribuir a mesma para um usuário cadastrado. Não será necessário um CRUD para o usuário. Faça utilizando o mais simples, nada de ferramentas, apenas o básico.

Arquitetura: MVC Action Based, JSP, JSTL, CSS, JavaScript (pode usar o Jquery ou outro framework para validação).

Informações:
Banco de dados (qualquer um que você quiser, recomendado: MySQL, Postgresql).
Estrutura simples com Tomcat (escolha a versão), JSP e Servlets.
CRUD completo da tarefa (toda tarefa tem que estar ligada a UM ÚNICO usuário).
Adicionar tarefa
Alterar tarefa
Deletar tarefa
listar tarefas
Usuários podem ser adicionados diretamente no banco.
Um usuário poderá ter várias tarefas, mas não o contrário.
Autenticação e Permissão básica de acesso por usuário.
O usuário poderá criar, alterar, excluir e listar somente as SUAS tarefas.
Um usuário logado NUNCA poderá acessar tarefas de outro usuário.

OBS: A tarefa será apenas além do ID uma descrição do que é a tarefa e qual usuário ela pertence. Não se pode adicionar tarefa sem que o usuário esteja logado.
```
## Instalação
### Configuração Inicial:
#### Criando database:
```sql 
CREATE SCHEMA `ToDoList`;
```
#### Criando tabelas iniciais:
- Usuario
```sql
CREATE TABLE `ToDoList`.`usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(25) NOT NULL,
  `username` VARCHAR(25) NOT NULL,
  `senha` VARCHAR(25) NOT NULL,
  UNIQUE KEY (`username`),
  PRIMARY KEY (`id`));
  
  INSERT INTO `ToDoList`.`usuario` (`nome`, `username`, `senha`) VALUES ('admin', 'admin', '123456');
```
- Tarefa
```sql
CREATE TABLE `ToDoList`.`tarefa` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(70) NOT NULL,
  `usuarioID` INT NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`usuarioID`) REFERENCES usuario(`id`));
```

### Primeiro Acesso
- Inicialize o seu TomCat
- Após ter subido o seu Tomcat, acesse a pagina do projeto: [localhost:8080/ToDOList/index.jsp](localhost:8080/ToDOList/index.jsp)
- Dados de acesso:
  - Login: admin
  - Senha: 123456
