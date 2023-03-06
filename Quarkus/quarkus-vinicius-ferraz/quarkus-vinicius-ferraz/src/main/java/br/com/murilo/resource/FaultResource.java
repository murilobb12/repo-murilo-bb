package br.com.murilo.resource;





import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.faulttolerance.Timeout;

import javax.validation.constraints.Null;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Path("/fault")
public class FaultResource {

    /*
    Iremos colocar um timeout na aplicação, caso ela demore x milisegundos.
     */
    @GET
    @Path("/timeout")
    @Timeout(value = 100)
    public String timeout() throws InterruptedException {
        Thread.sleep(200);

        return "Timeout";
    }

    /*
    Iremos forçar que a aplicação tente refazer a chamada, devemos passar a quantidade de
    tentativas que deverá realizar a nova chamada.
     */
    @GET
    @Path("/retry")
    @Retry(maxRetries = 2)
    @Timeout(value = 100)
    public String retry() throws InterruptedException {
        if(new Random().nextBoolean()){

            throw new NullPointerException();
        }

        return "Retry";
    }

    /*
    As anotações de circuit breaker, serve para caso ocorra alguma porcentagem de erros na nossa chamada
    devemos interromper o circuito deixando ele aberto, e só iremos deixar seguir caso as próximas
    chamadas definidas obtiverem sucesso.


    FallBack, só serve se estivermos do lado do servidor, isso serve caso quando o cliente
    for acessar a nossa aplicação, e tiver algum erro de retorno, devemos usar o fallback
    para chamarmos outro médodo, como uma solução paliativa. Normalmente usamos ele juntos de
    outras tratativas, como o retry ou timeout.
     */




}
