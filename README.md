# Business Card App

Este é um aplicativo Android que exibe um cartão de visita digital para um desenvolvedor Android. O cartão contém informações de contato, como nome, título, telefone e e-mail.

## Funcionalidades

- Exibe um cartão de visita com nome, título e logotipo.
- Inclui informações de contato, como telefone e e-mail.
- Estilo moderno e responsivo.

## Tecnologias Utilizadas

- **Kotlin**: Linguagem de programação principal para desenvolvimento Android.
- **Jetpack Compose**: Biblioteca moderna para construção de interfaces de usuário em Android.
- **Material Design**: Diretrizes de design do Google para criar interfaces de usuário atraentes.

## Estrutura do Projeto

- `MainActivity.kt`: A atividade principal que define o conteúdo da interface do usuário.
- `ProfileData`: Uma classe de dados que contém as informações do perfil.
- `BusinessCard`: Composable que gera a interface do cartão de visita.
- `HeaderSection`: Composable para exibir o cabeçalho do cartão, incluindo o logotipo e o nome.
- `ContactSection`: Composable que exibe informações de contato.
- `ContactRow`: Composable para exibir uma linha de contato (telefone ou e-mail) com ícones.

## Como Executar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/LABELLECANDIDO/Business-Card.git
