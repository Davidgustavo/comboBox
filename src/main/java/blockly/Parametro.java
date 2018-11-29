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
	 * @param id2
	 * @return Var
	 */
	// Parametro
	public static Var Executar(Var id2) throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"),
						Var.valueOf("#/home/logged/Parametro"),
						cronapi.list.Operations.newList(Var.valueOf("param0", id2)));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
