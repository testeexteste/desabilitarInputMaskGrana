package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ExibirCombo {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// exibirCombo
	public static Var exibirCombo() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.showComponent"),
						Var.valueOf("ComboItem"));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
