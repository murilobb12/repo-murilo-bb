import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        

        List<Operacoes> operacoes = new ArrayList<>();


        operacoes.add(new Operacoes("332003251", 1508022, 0, 0, "23.05.2021", 222222, 0));
        operacoes.add(new Operacoes("332003251", 1508022, 0, 0, "23.06.2021", 222222, 0));
        operacoes.add(new Operacoes("875502139", 129687, 29454, 0, "16.09.2021", 4472, 4472));
        operacoes.add(new Operacoes("875502139", 129687, 29454, 0, "16.10.2021", 4472, 4472));



        Set<String> listaCodigos = new HashSet<>();

        operacoes.stream().forEach(op -> listaCodigos.add(op.codigoIdentificador));
    
        SolicitacaoHonraEnvioDTO solicitacao = new SolicitacaoHonraEnvioDTO();

        AmortizacaoEnvioDTO[] amortizacao;

        for (Operacoes op : operacoes) {

            solicitacao.setIdOperacaoAgenteCreditoLivre(op.getCodigoIdentificador());
            solicitacao.setValorSaldoDevedorDePrincipal(op.getValorSaldoDevedor());
            solicitacao.setValorSaldoDeJurosNaNormalidade(op.getValorSaldoJuro());
            solicitacao.setValorEncargosMoratorios(op.getValorEncargo());
            solicitacao.setAmortizacoesAteADataDaSolicitacaoDeHonra(amortizacao[0].setDataVencimento(op.getDataVencimento()));
            for (int i = 0; i < operacoes.size(); i++) {
                solicitacao.setAmortizacoesAteADataDaSolicitacaoDeHonra(amortizacao[i].setDataVencimento(op.getDataVencimento()));
            }
            
            
        }

        System.out.println(solicitacao);






        // Map<String, List<Operacoes>> map = new HashMap<>();

        // for (Operacoes op : operacoes) {
        //     String codigoIdentificadorOperacaoAgente = op.getCodigoIdentificador();
        //     if (!map.containsKey(codigoIdentificadorOperacaoAgente)) {
        //         map.put(codigoIdentificadorOperacaoAgente, new ArrayList<>());
        //     }
        //     map.get(codigoIdentificadorOperacaoAgente).add(op);
        // }

        // System.out.println(map);

        // for (Operacoes operacoes2 : operacoes) {
            
        //     System.out.println(map.get(operacoes2.codigoIdentificador));

            
        // }
        

        // for (Map.Entry<String, List<Operacoes>> entry : map.entrySet()) {
        //     String codigoIdentificadorOperacaoAgente = entry.getKey();
        //     List<Operacoes> lista = entry.getValue();
            
            
        //     for (Operacoes obj : lista) {
                
                

        //     }
        // }




    }
}
