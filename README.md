# App de gestão de frete para empresa de Logística

[![SpringBoot](https://img.shields.io/badge/SpringBoot-3.1.3-blue)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17.0.0-blue)](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html)
[![Maven](https://img.shields.io/badge/Maven-4.0.0-blue)](https://maven.apache.org/download.cgi)
[![H2](https://img.shields.io/badge/H2-all-blue)](https://www.h2database.com/html/main.html)

---

**código fonte:** <a href="https://github.com/Matheuspsilva/appFrete" target="_blank">https://github.com/Matheuspsilva/appFrete

---

## Instalação
Para instalar as dependências do projeto, utilize o comando abaixo:
```bash
mvn clean install
```

## Execução
Para executar o projeto, utilize o comando abaixo:
```bash
mvn spring-boot:run
```

## Descrição do Projeto

O "App de Gestão de Frete" é um sistema de software projetado para atender às necessidades
de uma empresa de logística fictícia chamada XPTO. Este sistema é desenvolvido para gerenciar o transporte de mercadorias entre filiais de empresas terceirizadas.
Aqui está um resumo das principais características e componentes do aplicativo:

## Front-End do Aplicativo

O front-end do aplicativo de gestão de frete foi desenvolvido usando a tecnologia JSP (JavaServer Pages). Esta seção fornece uma visão geral da estrutura do front-end e das principais tecnologias envolvidas.

### Tecnologias Utilizadas

O front-end do aplicativo utiliza as seguintes tecnologias e componentes:

- **JSP (JavaServer Pages)**: O aplicativo utiliza JSP para criar páginas da web dinâmicas, permitindo a mistura de código Java com HTML.
- **Taglibs**: Para facilitar o desenvolvimento e tornar as páginas JSP mais legíveis, o aplicativo utiliza taglibs compatíveis com Java 17, permitindo a inclusão de componentes dinâmicos nas páginas.

### Organização dos Arquivos JSP

Os arquivos JSP estão organizados em uma estrutura de diretórios que torna o desenvolvimento e manutenção mais eficientes. Aqui estão os principais diretórios e sua finalidade:

- **`/WEB-INF`**: Este diretório contém os arquivos JSP e é protegido contra acesso direto pelo navegador. Ele armazena as páginas JSP que são usadas para renderizar as diferentes partes do aplicativo.

- **`/WEB-INF/views`**: Neste diretório, você encontrará as páginas JSP específicas para a interface do usuário do aplicativo, como páginas de cadastro, consulta e visualização de informações relacionadas a fretes, empresas e rotas.

### Estrutura da Página JSP Padrão

Uma página JSP padrão no aplicativo pode incluir as seguintes seções:

- **HTML**: A estrutura HTML da página, que inclui tags HTML, cabeçalho e corpo da página.
- **Imports**: Importações de classes e taglibs necessárias para a página.
- **Declarations**: Declarações de variáveis Java.
- **Scriptlet**: Código Java para processamento lógico.
- **Taglibs**: Uso de taglibs para incorporar componentes dinâmicos.
- **HTML Dinâmico**: HTML que pode ser gerado dinamicamente com base nas informações do sistema.

### Exemplo de Uso de Taglibs

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Exemplo de Página JSP</title>
</head>
<body>
    <h1>Lista de Fretes</h1>
    <ul>
        <c:forEach items="${freteList}" var="frete">
            <li>${frete.nome}</li>
        </c:forEach>
    </ul>
</body>
</html>
```

## Funcionalidade Principal
O aplicativo é desenvolvido para a empresa de logística XPTO e permite
o gerenciamento de transporte de mercadorias entre as filiais de empresas terceirizadas.
Ele estabelece rotas específicas para cada entrega,
o que facilita o agendamento de fretes, como:

- Exemplo 1: Transportar produtos da Coca-Cola da filial de São Paulo para a filial de Minas Gerais.
- Exemplo 2: Levar mercadorias da Unilever da filial de São Paulo para a filial do Rio de Janeiro.

Esses exemplos ilustram o funcionamento central do aplicativo, permitindo que a empresa XPTO planeje e monitore eficazmente o transporte de produtos entre diferentes filiais de empresas terceirizadas por meio de rotas pré-definidas.
O aplicativo é composto por várias classes, incluindo Rota, Frete, Empresa (classe mãe), Remetente (classe filha 1), Destinatário (classe filha 2) e Transportadora (classe filha 3).


### Componentes do Sistema

O aplicativo é composto por várias classes, incluindo:

- **Rota:**: Responsável por definir as rotas de transporte.
- **Frete:**: Encarregado de gerenciar as informações de frete.
- **Empresa:**: Uma classe base para as classes filhas.
- **Remetente:**: Representa a empresa que está enviando a mercadoria.
- **Destinatário:**: Representa a empresa que está recebendo a mercadoria.
- **Transportadora:**: Representa a empresa que está transportando a mercadoria.

### Funcionalidades do Sistema: 

Os funcionários do sistema têm a capacidade de:

- Cadastrar novos fretes
- Consultar fretes existentes 
- Alterar o status de um frete.
- Cadastrar novas empresas
- Consultar empresas existentes
- Cadastrar Rotas 
- Consultar Rotas existentes
