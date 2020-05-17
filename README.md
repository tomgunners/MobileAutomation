# Projeto Automação Mobile [![Build Status](https://travis-ci.com/tomgunners/MobileAutomation.svg?branch=master)](https://travis-ci.com/tomgunners/MobileAutomation) ![GitHub All Releases](https://img.shields.io/github/downloads/tomgunners/MobileAutomation/total) ![GitHub repo size](https://img.shields.io/github/repo-size/tomgunners/MobileAutomation) ![GitHub](https://img.shields.io/github/license/tomgunners/MobileAutomation) ![GitHub commit merge status](https://img.shields.io/github/commit-status/tomgunners/MobileAutomation/master/b8f2a994f7e4eefd86cd5d48d8fc6e8d62aefb1a)
 
## About
 O Projeto tem como finalidade o cadastro de um usuário no aplicativo Muambator, 
 realizar interações com as abas existentes dentro do aplicativo, o cadastramento de um código de 
 rastreio e por fim a validação se o mesmo foi adicionado.
 
## Developed
  ![GitHub contributors](https://img.shields.io/github/contributors/tomgunners/MobileAutomation?color=green&label=Wellington%20de%20Oliveira%20Francisco)
  
 
## Installation
 IDE: [InteliJ](https://www.jetbrains.com/pt-br/idea/download/download-thanks.html?platform=windows&code=IIC)
 
 Appium: [Appium](https://github.com/appium/appium-desktop/releases/download/v1.15.1/Appium-windows-1.15.1.exe)
 
 Android [Android Studio](https://developer.android.com/studio?hl=pt-br#downloads)
 
 JDK: [Java SE Development](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
 
 
## Run
 
 1- Execute o Programa Appium e de **Start Server**:
 
 2- Crie e execute um emulado do android:
  * Abra o Android studio e crie um novo projeto.
      * Escolha a opção Start a new Android Studio project. 
      *Pressione em Next até chegar em Finish. 
  * Na barra de ferramenta vc deve clicar no botão AVD Manager, se este botão não estiver sendo exibido ai vá no menu Tools e escolha a opção AVD Manager.
  * Na janela aberta selecione a opção Create Virtual Devaice. 
  * Na tela a seguir escolha um Device exemplo: Nexus 5x e pressione Next. 
  * Em seguida escolha um sistema operacional (se necessário clique em download) e prossiga até chegar em Finish.
  * Quando o Emulador for criado ele irá ficar disponível para ser iniciado.
  * Em Actions clique em Play para iniciar o emulador.
  
## Linha de comando
  
  1- Utilizando o teminal execute o comando 
  
```
  ./gradlew runFeatures 
```
  
  2- Em seguida se desejar ver o relatório execute o comando
  
  ```
    allure serve 
  ```
  
## Technologies Used
 **JDK** ![version](https://img.shields.io/badge/version-1.8-green)
 
 **Appium** ![version](https://img.shields.io/badge/version-7.3.0-green)
 
 **Android** ![version](https://img.shields.io/badge/version-9.0-green)
 
 **Gradle** ![version](https://img.shields.io/badge/version-6.4.1-green)
 
 **Alure** ![version](https://img.shields.io/badge/version-2.8.1-green)
 
 **Junit** ![version](https://img.shields.io/badge/version-4.12-green)
 
## Programming Language Used ![GitHub language count](https://img.shields.io/github/languages/count/tomgunners/MobileAutomation)
**Java**

**Cucumber**
 
**Gherkin**
 
**Alure**
  
**Android**
   
**Appium**
 
 
