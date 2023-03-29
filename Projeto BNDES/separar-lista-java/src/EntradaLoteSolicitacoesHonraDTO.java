public class EntradaLoteSolicitacoesHonraDTO {
    
    public SolicitacaoHonraEnvioDTO[] solicitacoesHonra;

    public SolicitacaoHonraEnvioDTO[] getSolicitacoesHonra() {
        return solicitacoesHonra;
    }

    public void setSolicitacoesHonra(SolicitacaoHonraEnvioDTO[] solicitacoesHonra) {
        this.solicitacoesHonra = solicitacoesHonra;
    }

    public EntradaLoteSolicitacoesHonraDTO(SolicitacaoHonraEnvioDTO[] solicitacoesHonra) {
        this.solicitacoesHonra = solicitacoesHonra;
    }

    

}
