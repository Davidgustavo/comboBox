package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Ticket {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param Dados
	 * @return Var
	 */
	// PaginaUser
	public static Var Estados(Var Dados) throws Exception {
		return new Callable<Var>() {

			private Var state_id = Var.VAR_NULL;
			private Var estados_do_pais = Var.VAR_NULL;
			private Var except = Var.VAR_NULL;

			public Var call() throws Exception {
				state_id = Var.valueOf(cronapi.json.Operations
						.getJsonOrMapField(cronapi.json.Operations.toJson(Dados), Var.valueOf("id")).toString());
				try {
					estados_do_pais = cronapi.database.Operations.query(Var.valueOf("app.entity.State"),
							Var.valueOf(
									"select s from State s where s.countryId = :countryId   order by s.stateName asc"),
							Var.valueOf("countryId", state_id));
				} catch (Exception except_exception) {
					except = Var.valueOf(except_exception);
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("error"), Var.valueOf("Não foi possível obter os estados!"));
				}
				return estados_do_pais;
			}
		}.call();
	}

	/**
	 *
	 * @param Dados
	 * @return Var
	 */
	// Descreva esta função...
	public static Var Cidades(Var Dados) throws Exception {
		return new Callable<Var>() {

			private Var state_id = Var.VAR_NULL;
			private Var except = Var.VAR_NULL;
			private Var cidades_do_estado = Var.VAR_NULL;

			public Var call() throws Exception {
				state_id = Var.valueOf(cronapi.json.Operations
						.getJsonOrMapField(cronapi.json.Operations.toJson(Dados), Var.valueOf("id")).toString());
				try {
					cidades_do_estado = cronapi.database.Operations.query(Var.valueOf("app.entity.City"),
							Var.valueOf("select c from City c where c.stateId = :stateId"),
							Var.valueOf("stateId", state_id));
				} catch (Exception except_exception) {
					except = Var.valueOf(except_exception);
					cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"),
							Var.valueOf("error"), Var.valueOf("Erro ao obter cidades!"));
				}
				return cidades_do_estado;
			}
		}.call();
	}

	/**
	 */
	// Descreva esta função...
	public static void meuOvo() throws Exception {
		new Callable<Var>() {

			private Var item = Var.VAR_NULL;

			public Var call() throws Exception {
				item = cronapi.database.Operations.queryPaged(Var.valueOf("app.entity.Cidade"),
						Var.valueOf("select c from Cidade c limit = 5000"), Var.valueOf(true));
				System.out.println(item.getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

}
