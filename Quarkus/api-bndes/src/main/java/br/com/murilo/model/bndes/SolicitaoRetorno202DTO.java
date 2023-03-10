package br.com.murilo.model.bndes;

public class SolicitaoRetorno202DTO {

    public OcorrenciaValidacaoDTO[] ocorrencias;

    public SolicitacaoHonraValidaRetornoDTO[] solicitacoesHonra;

    public Integer idSolicitacao;

    public String dataSolicitacao;

    public Status status;

    public String[] erros;

}
