import java.sql.Date;

public class AmortizacaoEnvioDTO {

    public String dataVencimento;

    public int valorDevido;

    public int valorRecebido;

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public int getValorDevido() {
        return valorDevido;
    }

    public void setValorDevido(int valorDevido) {
        this.valorDevido = valorDevido;
    }

    public int getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(int valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    @Override
    public String toString() {
        return "AmortizacaoEnvioDTO [dataVencimento=" + dataVencimento + ", valorDevido=" + valorDevido
                + ", valorRecebido=" + valorRecebido + "]";
    }

}