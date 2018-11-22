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
	 * @return Var
	 */
	// combo
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			private Var item = Var.VAR_NULL;
			private Var combo = Var.VAR_NULL;

			public Var call() throws Exception {
				item = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.combo"));
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
						item);
				combo = cronapi.database.Operations.query(Var.valueOf("app.entity.Cidade"),
						Var.valueOf("select c.nome from Cidade c where c.estado.nome = :estadoNome"),
						Var.valueOf("estadoNome", item));
				System.out.println(combo.getObjectAsString());
				return combo;
			}
		}.call();
	}

}
