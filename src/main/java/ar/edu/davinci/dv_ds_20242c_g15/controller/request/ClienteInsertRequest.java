package ar.edu.davinci.dv_ds_20242c_g15.controller.request;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteInsertRequest {
	private String nombre;
	private String apellido;
}
