package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class AlteraCampo {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// alteraCampo
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var obterID = Var.VAR_NULL;

   public Var call() throws Exception {
    obterID = cronapi.screen.Operations.getValueOfField(Var.valueOf("params.id"));
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), obterID);
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.input"), obterID);
    return Var.VAR_NULL;
   }
 }.call();
}

}

