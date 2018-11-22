package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class SelecioneCidade {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param param_nomeEstado
	 * @return Var
	 */
	// selecioneCidade
	public static Var Executar(Var param_nomeEstado) throws Exception {
		return new Callable<Var>() {

			// param
			private Var nomeEstado = param_nomeEstado;
			// end

			public Var call() throws Exception {
				nomeEstado = nomeEstado;
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
						nomeEstado);
				return Var.VAR_NULL;
			}
		}.call();
	}

}
