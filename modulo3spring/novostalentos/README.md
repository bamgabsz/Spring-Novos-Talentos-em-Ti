 # Projeto módulo 3 Spring Boot

 ## Spring Framework
 
 Conjunto de bibliotecas escritas em Java para simplificar o desenvolvimento de aplicações WEB
#
 ## Spring Boot 
 Ferramenta para acelerar o inicio de um projeto utilizado o Spring framework
 - Documentação: https://spring.io/projects/spring-boot
 - Start: https://start.spring.io/

Site que cria a estrutura de um projeto utilizando o spring boot

#
## Configuração do ambiente
- Java Development Kit (JDK)
- Maven (gerenciador de pacotes e ferramenta de build)
- VSCode
    - Extension Pack for Java (Microsoft)
    - Extension Pack for Spring Boot (Pivotal)
- Banco de dados (MariaDB)

# 
## Estrutura do projeto
- Pacote src: todo o codigo da aplicação (Java, HTML, CSS, JS)
- Pacote target: codigo compilado e gerado pelo Maven
- Arquivo pom.sml: arquivo descritor utilizado pelo Maven pela download das dependencias e build de aplicação
- <nomedoprojeto> Application.java - main da aplicação Java
- Pacote controller: classes que são responsáveis por tratar as requisições HTTP enviadas para as rotas definidas por anotação

#
## Passo a passo para criar um novo projeto Springboot no VSCode

- Criar uma pasta no disco do computador
- Abrir a pasta no VSCode usando a opção File (arquivo) -> Open Folder (abrir pasta)
- Ctrl + shift + P
- Digitar spring Selecionar Spring Initializr: Create a Maven Project
- Qual a versão do Spring Framework (a última)
- Qual a linguagem: Java XD
- Qual o pacote base do projeto: domínio da empresa (univille.br) usar invertido (br.univille)
- Qual o nome do projeto? (nào usar espaço ou caracter especial)
- Qual a forma de empacotamento: JAR 
- Qual a versão do JDK: 11 (depende da versão instalada no seu computador)
- Quais são as dependências do projeto?
    - spring web (clicar para selecionar)
    - spring boot DevTools

- Clicar em Selected N Dependencies
- Selecionar a pasta onde o projeto será criado (usar a mesma que foi utilizada no passo 1) 
- Retorno que o projeto foi criado com sucesso, clicar em OPEn

#
## Executar a aplicação
- Encontrar o Spring Boot Dashboard

#
##

