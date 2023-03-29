public class AmortizacaoEnvioDTO {

    public String dataVencimento;

    public Integer id;

    public Double valorDevido;

    public Double valorRecebido;

    public Boolean valorRecebimentoInferiorAoDevido;

    public Integer versao;

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorDevido() {
        return valorDevido;
    }

    public void setValorDevido(Double valorDevido) {
        this.valorDevido = valorDevido;
    }

    public Double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(Double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public Boolean getValorRecebimentoInferiorAoDevido() {
        return valorRecebimentoInferiorAoDevido;
    }

    public void setValorRecebimentoInferiorAoDevido(Boolean valorRecebimentoInferiorAoDevido) {
        this.valorRecebimentoInferiorAoDevido = valorRecebimentoInferiorAoDevido;
    }

    public Integer getVersao() {
        return versao;
    }

    public void setVersao(Integer versao) {
        this.versao = versao;
    }

    public AmortizacaoEnvioDTO(String dataVencimento, Double valorDevido, Double valorRecebido) {
        this.dataVencimento = dataVencimento;
        this.valorDevido = valorDevido;
        this.valorRecebido = valorRecebido;
    }

    public AmortizacaoEnvioDTO() {
    }

    

}