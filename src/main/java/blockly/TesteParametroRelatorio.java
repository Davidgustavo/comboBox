package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class TesteParametroRelatorio {

public static final int TIMEOUT = 300;

/**
 *
 * @param parametro
 * @return Var
 */
// testeParametroRelatorio
public static Var Executar(Var parametro) throws Exception {
 return new Callable<Var>() {

   private Var consulta = Var.VAR_NULL;

   public Var call() throws Exception {
    consulta = cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.name from User u where u.name = :name"),Var.valueOf("name",parametro));
    System.out.println(consulta.getObjectAsString());
    return consulta;
   }
 }.call();
}

}

