public class Operacoes {
    

    private String codigoIdentificadorOperacaoAgente;
    private int valorSaldoDevedor;
    private int valorSaldoJuro;
    private int valorEncargo;
    private String dataVencimento;
    private int valorDevido;
    private int valorRecebido;

    

    public Operacoes(String codigoIdentificadorOperacaoAgente, int valorSaldoDevedor, int valorSaldoJuro,
            int valorEncargo, String dataVencimento, int valorDevido, int valorRecebido) {
        this.codigoIdentificadorOperacaoAgente = codigoIdentificadorOperacaoAgente;
        this.valorSaldoDevedor = valorSaldoDevedor;
        this.valorSaldoJuro = valorSaldoJuro;
        this.valorEncargo = valorEncargo;
        this.dataVencimento = dataVencimento;
        this.valorDevido = valorDevido;
        this.valorRecebido = valorRecebido;
    }

    public String getCodigoIdentificadorOperacaoAgente() {
        return codigoIdentificadorOperacaoAgente;
    }
    public void setCodigoIdentificadorOperacaoAgente(String codigoIdentificadorOperacaoAgente) {
        this.codigoIdentificadorOperacaoAgente = codigoIdentificadorOperacaoAgente;
    }
    public int getValorSaldoDevedor() {
        return valorSaldoDevedor;
    }
    public void setValorSaldoDevedor(int valorSaldoDevedor) {
        this.valorSaldoDevedor = valorSaldoDevedor;
    }
    public int getValorSaldoJuro() {
        return valorSaldoJuro;
    }
    public void setValorSaldoJuro(int valorSaldoJuro) {
        this.valorSaldoJuro = valorSaldoJuro;
    }
    public int getValorEncargo() {
        return valorEncargo;
    }
    public void setValorEncargo(int valorEncargo) {
        this.valorEncargo = valorEncargo;
    }
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
        return "[codigoIdentificadorOperacaoAgente=" + codigoIdentificadorOperacaoAgente
                + ", valorSaldoDevedor=" + valorSaldoDevedor + ", valorSaldoJuro=" + valorSaldoJuro + ", valorEncargo="
                + valorEncargo + ", dataVencimento=" + dataVencimento + ", valorDevido=" + valorDevido
                + ", valorRecebido=" + valorRecebido + "]";
    }

}
