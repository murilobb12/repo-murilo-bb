import java.util.List;

public class Solicitacoes {
    
    public String idOperacaoAgenteCreditoLivre;

    public int valorEncargosMoratorios;

    public int valorSaldoDeJurosNaNormalidade;

    public int valorSaldoDevedorDePrincipal;

    public List<AmortizacaoEnvioDTO> amortizacoesAteADataDaSolicitacaoDeHonra;

    public String getIdOperacaoAgenteCreditoLivre() {
        return idOperacaoAgenteCreditoLivre;
    }

    public void setIdOperacaoAgenteCreditoLivre(String idOperacaoAgenteCreditoLivre) {
        this.idOperacaoAgenteCreditoLivre = idOperacaoAgenteCreditoLivre;
    }

    public int getValorEncargosMoratorios() {
        return valorEncargosMoratorios;
    }

    public void setValorEncargosMoratorios(int valorEncargosMoratorios) {
        this.valorEncargosMoratorios = valorEncargosMoratorios;
    }

    public int getValorSaldoDeJurosNaNormalidade() {
        return valorSaldoDeJurosNaNormalidade;
    }

    public void setValorSaldoDeJurosNaNormalidade(int valorSaldoDeJurosNaNormalidade) {
        this.valorSaldoDeJurosNaNormalidade = valorSaldoDeJurosNaNormalidade;
    }

    public int getValorSaldoDevedorDePrincipal() {
        return valorSaldoDevedorDePrincipal;
    }

    public void setValorSaldoDevedorDePrincipal(int valorSaldoDevedorDePrincipal) {
        this.valorSaldoDevedorDePrincipal = valorSaldoDevedorDePrincipal;
    }

    public List<AmortizacaoEnvioDTO> getAmortizacoesAteADataDaSolicitacaoDeHonra() {
        return amortizacoesAteADataDaSolicitacaoDeHonra;
    }

    public void setAmortizacoesAteADataDaSolicitacaoDeHonra(
            List<AmortizacaoEnvioDTO> amortizacoesAteADataDaSolicitacaoDeHonra) {
        this.amortizacoesAteADataDaSolicitacaoDeHonra = amortizacoesAteADataDaSolicitacaoDeHonra;
    }

    @Override
    public String toString() {
        return "Solicitacoes [idOperacaoAgenteCreditoLivre=" + idOperacaoAgenteCreditoLivre
                + ", valorEncargosMoratorios=" + valorEncargosMoratorios + ", valorSaldoDeJurosNaNormalidade="
                + valorSaldoDeJurosNaNormalidade + ", valorSaldoDevedorDePrincipal=" + valorSaldoDevedorDePrincipal
                + ", amortizacoesAteADataDaSolicitacaoDeHonra=" + amortizacoesAteADataDaSolicitacaoDeHonra + "]";
    }

}
