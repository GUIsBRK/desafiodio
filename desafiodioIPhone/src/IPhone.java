// Classe que implementa o iPhone
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean isPlaying = false;
    private String currentSong = "";
    private boolean isCallInProgress = false;
    private String callNumber = "";
    private boolean isBrowserOpen = false;
    private String currentURL = "";

    @Override
    public void tocar() {
        isPlaying = true;
        // Implementação específica para tocar música no iPhone
    }

    @Override
    public void pausar() {
        isPlaying = false;
        // Implementação específica para pausar música no iPhone
    }

    @Override
    public void selecionarMusica(String musica) {
        currentSong = musica;
        // Implementação específica para selecionar música no iPhone
    }

    @Override
    public void ligar(String numero) {
        callNumber = numero;
        // Implementação específica para ligar no iPhone
    }

    @Override
    public void atender() {
        isCallInProgress = true;
        // Implementação específica para atender chamadas no iPhone
    }

    @Override
    public void iniciarConversaVoz() {
        // Implementação específica para iniciar conversa de voz no iPhone
    }

    @Override
    public void exibirPagina(String url) {
        currentURL = url;
        isBrowserOpen = true;
        // Implementação específica para exibir página web no iPhone
    }

    @Override
    public void adicionarNovaAba(String url) {
        // Implementação específica para adicionar nova aba no navegador do iPhone
    }

    @Override
    public void atualizarPagina() {
        // Implementação específica para atualizar página no navegador do iPhone
    }
}