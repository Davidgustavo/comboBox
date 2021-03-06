package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Parametro {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Parametro
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.id"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("#/home/logged/p"), cronapi.list.Operations.newList(Var.valueOf("id",item)));
    return Var.VAR_NULL;
   }
 }.call();
}

}

