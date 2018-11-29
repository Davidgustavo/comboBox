package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Teste {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Teste
	public static Var Teste() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
						Var.valueOf("vars.idparam"), Var.valueOf("tttttttttt"));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
