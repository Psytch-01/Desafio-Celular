package celular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new Iphone();
        Phone phone = new Iphone();
        Browser browser = new Iphone();

        System.out.println("Bem Vindo ao Sistema! Selecione uma aplicação para ver suas funcionalidades: 1 -> Music Player 2 -> Phone 3 -> Browser 0 -> Sair");
        Scanner scanner = new Scanner(System.in);
        int entrada = scanner.nextInt();

        while (entrada != 0) {
            if (entrada == 1) {
                System.out.println("Você selecionou Music Player. Escolha uma funcionalidade: 1 -> Play music 2 -> Pause music 3 -> Select music  ");
                entrada = scanner.nextInt();

                switch (entrada) {
                    case 1:
                        playMusic(musicPlayer);
                        mensagem();
                        break;
                    case 2:
                        pauseMusic(musicPlayer);
                        mensagem();
                        break;
                    case 3:
                        selectMusic(musicPlayer);
                        mensagem();
                        break;
                }
            }else if (entrada == 2) {
                System.out.println("Você selecionou Phone. Escolha uma funcionalidade: 1 -> Make call 2 -> Accept call 3 -> Start Voicemail");
                entrada = scanner.nextInt();

                switch (entrada) {
                    case 1:
                        makeCall(phone);
                        mensagem();
                        break;
                    case 2:
                        acceptCall(phone);
                        mensagem();
                        break;
                    case 3:
                        startVoicemail(phone);
                        mensagem();
                        break;
                    }
            }else if (entrada == 3) {
                System.out.println("Você selecionou Browser. Escolha uma funcionalidade: 1 -> Show page 2 -> Add new tab 3 -> Refresh page");
                entrada = scanner.nextInt();

                switch (entrada) {
                    case 1:
                        showPage(browser);
                        mensagem();
                        break;
                    case 2:
                        addTab(browser);
                        mensagem();
                        break;
                    case 3:
                        refreshPage(browser);
                        mensagem();
                        break;
                }
            }else if (entrada == 0) {
                System.out.println("Você escolheu sair! Obrigado por usar o celular! <3");
                break;


            }else
                System.out.println("Entrada Inválida! Selecione uma aplicação para ver suas funcionalidades: 1 -> Music Player 2 -> Phone 3 -> Browser 0 -> Sair");
                entrada = scanner.nextInt();

        }

    }

    //Implementação MusicPlayer

    public static void playMusic (MusicPlayer musicPlayer) {
       musicPlayer.playMusic();

    }

    public static void pauseMusic (MusicPlayer musicPlayer) {
        musicPlayer.pauseMusic();
    }

    public static void selectMusic (MusicPlayer musicPlayer) {
        musicPlayer.selectMusic();
    }

    //Implementação Phone

    public static void makeCall (Phone phone) {
        phone.makeCall();
    }

    public static void acceptCall (Phone phone) {
        phone.acceptCall();
    }

    public static void startVoicemail (Phone phone) {
        phone.startVoicemail();
    }

    //Implementação Browser

    public static void showPage (Browser browser) {
        browser.showPage();
    }

    public static void addTab (Browser browser) {
        browser.addTab();
    }

    public static void refreshPage (Browser browser) {
        browser.refreshPage();
    }

    private static void mensagem () {
        System.out.println("Escolha outra funcionalidade a qualquer momento ou precione 0 para sair!");
    }

}