package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Selecione {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// selecione
	public static Var selecione() throws Exception {
		return new Callable<Var>() {

			private Var campo = Var.VAR_NULL;
			private Var id_cod = Var.VAR_NULL;

			public Var call() throws Exception {
				campo = cronapi.screen.Operations.getValueOfField(Var.valueOf("Item_Produto.active.cod_produto"));
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
						campo);
				id_cod = cronapi.database.Operations.query(Var.valueOf("app.entity.Item_Produto"),
						Var.valueOf("select i.id from Item_Produto i where i.cod_produto = :cod_produto"),
						Var.valueOf("cod_produto", campo));
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
						Var.valueOf("Produto.active.cod_produto"), id_cod);
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.hideComponent"),
						Var.valueOf("ComboItem"));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
