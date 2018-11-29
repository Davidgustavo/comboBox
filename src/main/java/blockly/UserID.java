package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class UserID {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// userID
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			private Var user = Var.VAR_NULL;

			public Var call() throws Exception {
				user = cronapi.database.Operations.query(Var.valueOf("app.entity.User"),
						Var.valueOf("select u from User u where u.login = :login"),
						Var.valueOf("login", cronapi.util.Operations.getCurrentUserName()));
				return cronapi.database.Operations.getField(user, Var.valueOf("this[0].id"));
			}
		}.call();
	}

}
