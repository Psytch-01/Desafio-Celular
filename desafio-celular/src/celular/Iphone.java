package celular;

public class Iphone implements MusicPlayer, Phone, Browser {

    //Métodos MusicPlayer

    @Override
    public void playMusic() {
       System.out.println("Tocando Música!");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A música Está Pausada!");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecionando Uma Música!");

    }

    //Métodos Phone

    @Override
    public void makeCall() {
        System.out.println("Fazendo Ligação!");

    }

    @Override
    public void acceptCall() {
        System.out.println("Aceitando Ligação!");

    }

    @Override
    public void startVoicemail() {
        System.out.println("Iniciando Correio de Voz!");

    }

    //Métodos Browser

    @Override
    public void showPage() {
        System.out.println("Mostrando Página!");

    }

    @Override
    public void addTab() {
        System.out.println("Adicionando Nova Aba!");

    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando Página!");

    }

}
