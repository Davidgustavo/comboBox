package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Ticket3 {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// ticket3
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
						Var.valueOf(""), Var.VAR_NULL);
				return Var.VAR_NULL;
			}
		}.call();
	}

}
