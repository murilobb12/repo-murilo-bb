import java.util.Arrays;

public class SolicitacaoHonraEnvioDTO {

    public String contratoRepasse;

    public String idOperacaoAgenteCreditoLivre;

    public String sistemaRepasse;

    public Double valorEncargosMoratorios;

    public Double valorSaldoDeJurosNaNormalidade;

    public String teste;

    public Double valorSaldoDevedorDePrincipal;

    public AmortizacaoEnvioDTO[] amortizacoesAteADataDaSolicitacaoDeHonra;

    public String getContratoRepasse() {
        return contratoRepasse;
    }

    public void setContratoRepasse(String contratoRepasse) {
        this.contratoRepasse = contratoRepasse;
    }

    public String getIdOperacaoAgenteCreditoLivre() {
        return idOperacaoAgenteCreditoLivre;
    }

    public void setIdOperacaoAgenteCreditoLivre(String idOperacaoAgenteCreditoLivre) {
        this.idOperacaoAgenteCreditoLivre = idOperacaoAgenteCreditoLivre;
    }

    public String getSistemaRepasse() {
        return sistemaRepasse;
    }

    public void setSistemaRepasse(String sistemaRepasse) {
        this.sistemaRepasse = sistemaRepasse;
    }

    public Double getValorEncargosMoratorios() {
        return valorEncargosMoratorios;
    }

    public void setValorEncargosMoratorios(Double valorEncargosMoratorios) {
        this.valorEncargosMoratorios = valorEncargosMoratorios;
    }

    public Double getValorSaldoDeJurosNaNormalidade() {
        return valorSaldoDeJurosNaNormalidade;
    }

    public void setValorSaldoDeJurosNaNormalidade(Double valorSaldoDeJurosNaNormalidade) {
        this.valorSaldoDeJurosNaNormalidade = valorSaldoDeJurosNaNormalidade;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    public Double getValorSaldoDevedorDePrincipal() {
        return valorSaldoDevedorDePrincipal;
    }

    public void setValorSaldoDevedorDePrincipal(Double valorSaldoDevedorDePrincipal) {
        this.valorSaldoDevedorDePrincipal = valorSaldoDevedorDePrincipal;
    }

    public AmortizacaoEnvioDTO[] getAmortizacoesAteADataDaSolicitacaoDeHonra() {
        return amortizacoesAteADataDaSolicitacaoDeHonra;
    }

    public void setAmortizacoesAteADataDaSolicitacaoDeHonra(
            AmortizacaoEnvioDTO[] amortizacoesAteADataDaSolicitacaoDeHonra) {
        this.amortizacoesAteADataDaSolicitacaoDeHonra = amortizacoesAteADataDaSolicitacaoDeHonra;
    }

    public SolicitacaoHonraEnvioDTO(String idOperacaoAgenteCreditoLivre, Double valorEncargosMoratorios,
            Double valorSaldoDeJurosNaNormalidade, Double valorSaldoDevedorDePrincipal,
            AmortizacaoEnvioDTO[] amortizacoesAteADataDaSolicitacaoDeHonra) {
        this.idOperacaoAgenteCreditoLivre = idOperacaoAgenteCreditoLivre;
        this.valorEncargosMoratorios = valorEncargosMoratorios;
        this.valorSaldoDeJurosNaNormalidade = valorSaldoDeJurosNaNormalidade;
        this.valorSaldoDevedorDePrincipal = valorSaldoDevedorDePrincipal;
        this.amortizacoesAteADataDaSolicitacaoDeHonra = amortizacoesAteADataDaSolicitacaoDeHonra;
    }

    public SolicitacaoHonraEnvioDTO() {
    }

    @Override
    public String toString() {
        return "[contratoRepasse=" + contratoRepasse + ", idOperacaoAgenteCreditoLivre="
                + idOperacaoAgenteCreditoLivre + ", sistemaRepasse=" + sistemaRepasse + ", valorEncargosMoratorios="
                + valorEncargosMoratorios + ", valorSaldoDeJurosNaNormalidade=" + valorSaldoDeJurosNaNormalidade
                + ", teste=" + teste + ", valorSaldoDevedorDePrincipal=" + valorSaldoDevedorDePrincipal
                + ", amortizacoesAteADataDaSolicitacaoDeHonra="
                + Arrays.toString(amortizacoesAteADataDaSolicitacaoDeHonra) + "]";
    }

    
    

    


}