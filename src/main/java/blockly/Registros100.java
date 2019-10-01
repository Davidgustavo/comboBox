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
   private Var cidade = Var.VAR_NULL;

   public Var call() throws Exception {
    my_100registros = cronapi.database.Operations.query(Var.valueOf("app.entity.Cidade"),Var.valueOf("select c from Cidade c"));
    while (cronapi.logic.Operations.isNullOrEmpty(cronapi.database.Operations.hasElement(my_100registros)).negate().getObjectAsBoolean()) {
        cronapi.database.Operations.next(my_100registros);
        cidade = cronapi.object.Operations.getObjectField(my_100registros, Var.valueOf("nome"));
        System.out.println(cidade.getObjectAsString());
    } // end while
    return Var.VAR_NULL;
   }
 }.call();
}

}

