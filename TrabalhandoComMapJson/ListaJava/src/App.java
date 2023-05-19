import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;
import org.json.*;;




public class App {

    
    public static void main(String[] args) throws Exception {

        String t = "TESTE";

        Solicitacoes solicitacoes = new Solicitacoes();
        AmortizacaoEnvioDTO amortizacaoEnvioDTO = new AmortizacaoEnvioDTO();
        List<Solicitacoes> listSolicitacoes = new ArrayList<>();

        // Criando operações que serão inseridas na minha aplicação
        Operacoes operacoes = new Operacoes("1", 11, 10, 10, "17/05/2023", 50, 6);
        Operacoes operacoes1 = new Operacoes("1", 12, 10, 10, "17/05/2023", 50, 6);
        Operacoes operacoes4 = new Operacoes("2", 11, 10, 10, "17/05/2023", 50, 6);
        Operacoes operacoes5 = new Operacoes("2", 12, 10, 10, "17/05/2023", 50, 6);

        // Criando estrutura de lista para armezenar minhas operações
        List<Operacoes> listaOperacoes = new ArrayList<>();

        // Inserindo as operações na lista
        listaOperacoes.add(operacoes);
        listaOperacoes.add(operacoes1);
        listaOperacoes.add(operacoes4);
        listaOperacoes.add(operacoes5);

        // Criando Map para separar operações da lista através do código identificador
        Map<String, List<Operacoes>> operacoesMap = new HashMap<>();

        // Percorrendo lista e inserindo no map de acordo com o código identificador
        for (Operacoes op : listaOperacoes) {

            // Validando se não contem o código identificador no mapa
            if (!operacoesMap.containsKey(op.getCodigoIdentificadorOperacaoAgente())) {
                List<Operacoes> listOperacoes = new ArrayList<>();
                listOperacoes.add(op);
                operacoesMap.put(op.getCodigoIdentificadorOperacaoAgente(), listOperacoes);

            }
            // caso já tenha ele adiciona a lista no map
            else {
                operacoesMap.get(op.getCodigoIdentificadorOperacaoAgente()).add(op);
            }

        }

        Set<String> keySet = operacoesMap.keySet();

        for (String codigoOperacao : keySet) {

            List<Operacoes> listoOperacoes = operacoesMap.get(codigoOperacao);

            solicitacoes.setIdOperacaoAgenteCreditoLivre(listoOperacoes.get(1).getCodigoIdentificadorOperacaoAgente());
            solicitacoes.setValorSaldoDevedorDePrincipal(listoOperacoes.get(1).getValorSaldoDevedor());
            solicitacoes.setValorSaldoDeJurosNaNormalidade(listoOperacoes.get(1).getValorSaldoJuro());
            solicitacoes.setValorEncargosMoratorios(listoOperacoes.get(1).getValorEncargo());

            List<AmortizacaoEnvioDTO> amortizacaoEnvioDTOs = new ArrayList<>();

            for (Operacoes op : listoOperacoes) {
                amortizacaoEnvioDTO.setDataVencimento(op.getDataVencimento());
                amortizacaoEnvioDTO.setValorDevido(op.getValorDevido());
                amortizacaoEnvioDTO.setValorRecebido(op.getValorRecebido());
                amortizacaoEnvioDTOs.add(amortizacaoEnvioDTO);

            }

            solicitacoes.setAmortizacoesAteADataDaSolicitacaoDeHonra(amortizacaoEnvioDTOs);
            listSolicitacoes.add(solicitacoes);

        }

        JSONArray array = new JSONArray();

        System.out.println(array.put(listSolicitacoes));

        

        // System.out.println(put);

    }
}
