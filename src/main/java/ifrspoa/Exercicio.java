package ifrspoa;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cupom")
public class Exercicio {

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String calculaCupom(@FormParam("valor") float valor, @FormParam("cupom") String cupom) {
        if (cupom.equals("CUPOM10")){
            valor = (valor/10) * 9;
        } else if (cupom.equals("CUPOM15")){
            valor = (valor/100) * 85;
        }
        // arredonda o valor para inteiro antes de converter para centavos
        int valorCentavos = Math.round(valor * 100);
        return String.valueOf(valorCentavos);
    }


}