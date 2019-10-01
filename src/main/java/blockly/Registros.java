package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Registros {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// 1000Registros
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item = cronapi.database.Operations.query(Var.valueOf("app.entity.Cidade"),Var.valueOf("select c from Cidade c"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

