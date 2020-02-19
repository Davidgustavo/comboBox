package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Registros100 {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// 100Registros
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var my_100registros = Var.VAR_NULL;

   public Var call() throws Exception {
    my_100registros = cronapi.database.Operations.queryPaged(Var.valueOf("app.entity.Cidade"),Var.valueOf("select c from Cidade c"),Var.valueOf(false),Var.valueOf("limit",cronapi.list.Operations.getLast((cronapi.database.Operations.query(Var.valueOf("app.entity.Cidade"),Var.valueOf("select COUNT(c.id) from Cidade c"))))),Var.valueOf("offset",Var.valueOf(0)));
    return my_100registros;
   }
 }.call();
}

}

