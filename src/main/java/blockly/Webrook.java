package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Webrook {

public static final int TIMEOUT = 300;

/**
 *
 * @param json
 * @return Var
 */
// webrook
public static Var webrook(Var json) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(Var.valueOf(json.toString()).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

