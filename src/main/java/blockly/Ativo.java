package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Ativo {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param atv
	 * @return Var
	 */
	// ativo
	public static Var Executar(Var atv) throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
						atv);
				return Var.VAR_NULL;
			}
		}.call();
	}

}
