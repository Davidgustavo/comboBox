package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.Iterator;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ConsultaObjeto {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// ConsultaObjeto
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;
   private Var i = Var.VAR_NULL;
   private Var estado = Var.VAR_NULL;
   private Var uf = Var.VAR_NULL;

   public Var call() throws Exception {
    System.out.println(Var.valueOf("abc").getObjectAsString());
    item = cronapi.database.Operations.query(Var.valueOf("app.entity.Cidade"),Var.valueOf("select c from Cidade c where c.estado.nome = :estadoNome"),Var.valueOf("estadoNome",Var.valueOf("Espírito Santo")));
    System.out.println(item.getObjectAsString());
    for (Iterator it_i = item.iterator(); it_i.hasNext();) {
        i = Var.valueOf(it_i.next());
        estado = cronapi.json.Operations.getJsonOrMapField(i, Var.valueOf("nome"));
        uf = cronapi.json.Operations.getJsonOrMapField(i, Var.valueOf("uf"));
        System.out.println(estado.getObjectAsString());
        System.out.println(uf.getObjectAsString());
    } // end for
    return Var.VAR_NULL;
   }
 }.call();
}

}

