package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Desabilitar {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Desabilitar
	public static Var Desabilitar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.disableComponent"),
						Var.valueOf("comboboxDavid"));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
