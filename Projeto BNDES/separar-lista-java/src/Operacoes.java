public class Operacoes {

    
    public Operacoes(String codigoIdentificador, double valorSaldoDevedor, double valorSaldoJuro, double valorEncargo,
            String dataVencimento, double valorDevido, double valorRecebido) {
        this.codigoIdentificador = codigoIdentificador;
        this.valorSaldoDevedor = valorSaldoDevedor;
        this.valorSaldoJuro = valorSaldoJuro;
        this.valorEncargo = valorEncargo;
        this.dataVencimento = dataVencimento;
        this.valorDevido = valorDevido;
        this.valorRecebido = valorRecebido;
    }

    public String codigoIdentificador;

    public double valorSaldoDevedor;

    public double valorSaldoJuro;

    public double valorEncargo;

    public String dataVencimento;

    public double valorDevido;

    public double valorRecebido;

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public double getValorSaldoDevedor() {
        return valorSaldoDevedor;
    }

    public void setValorSaldoDevedor(double valorSaldoDevedor) {
        this.valorSaldoDevedor = valorSaldoDevedor;
    }

    public double getValorSaldoJuro() {
        return valorSaldoJuro;
    }

    public void setValorSaldoJuro(double valorSaldoJuro) {
        this.valorSaldoJuro = valorSaldoJuro;
    }

    public double getValorEncargo() {
        return valorEncargo;
    }

    public void setValorEncargo(double valorEncargo) {
        this.valorEncargo = valorEncargo;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValorDevido() {
        return valorDevido;
    }

    public void setValorDevido(double valorDevido) {
        this.valorDevido = valorDevido;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    @Override
    public String toString() {
        return "[codigoIdentificador=" + codigoIdentificador + ", valorSaldoDevedor=" + valorSaldoDevedor
                + ", valorSaldoJuro=" + valorSaldoJuro + ", valorEncargo=" + valorEncargo + ", dataVencimento="
                + dataVencimento + ", valorDevido=" + valorDevido + ", valorRecebido=" + valorRecebido + "]";
    }

}
