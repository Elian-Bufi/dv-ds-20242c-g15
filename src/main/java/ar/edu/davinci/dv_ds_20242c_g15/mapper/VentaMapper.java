package ar.edu.davinci.dv_ds_20242c_g15.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ar.edu.davinci.dv_ds_20242c_g15.controller.request.VentaEfectivoRequest;
import ar.edu.davinci.dv_ds_20242c_g15.controller.request.VentaTarjetaRequest;
import ar.edu.davinci.dv_ds_20242c_g15.controller.response.VentaEfectivoResponse;
import ar.edu.davinci.dv_ds_20242c_g15.controller.response.VentaTarjetaResponse;
import ar.edu.davinci.dv_ds_20242c_g15.controller.web.request.VentaEfectivoCreateRequest;
import ar.edu.davinci.dv_ds_20242c_g15.controller.web.request.VentaTarjetaCreateRequest;
import ar.edu.davinci.dv_ds_20242c_g15.domain.VentaEfectivo;
import ar.edu.davinci.dv_ds_20242c_g15.domain.VentaTarjeta;
@Mapper(uses= {DateMapper.class, ItemMapper.class})
public interface VentaMapper {
	VentaMapper instance = Mappers.getMapper(VentaMapper.class);
	// VENTA EFECTIVO
	@Mapping(target = "cliente", source = "cliente")
	@Mapping(target = "items", source = "items")
	@Mapping(target = "importeFinal", expression = "java(new java.math.BigDecimal(ventaEfectivo.importeFinal().doubleValue()))")
	VentaEfectivoResponse mapToVentaEfectivoResponse(VentaEfectivo ventaEfectivo);
	@Mapping(target = "cliente.id", source = "clienteId")
	VentaEfectivo matToVentaEfectivo(VentaEfectivoRequest ventaEfectivoRequest);
	@Mapping(target = "cliente.id", source = "clienteId")
	VentaEfectivo matToVentaEfectivo(VentaEfectivoCreateRequest ventaEfectivoCreateRequest);
	// VENTA TARJETA
	@Mapping(target = "cliente", source = "cliente")
	@Mapping(target = "items", source = "items")
	@Mapping(target = "importeFinal", expression = "java(new java.math.BigDecimal(ventaTarjeta.importeFinal().doubleValue()))")
	VentaTarjetaResponse mapToVentaTarjetaResponse(VentaTarjeta ventaTarjeta);
	@Mapping(target = "cliente.id", source = "clienteId")
	VentaTarjeta matToVentaTarjeta(VentaTarjetaRequest ventaTarjetaRequest);
	@Mapping(target = "cliente.id", source = "clienteId")
	@Mapping(target = "fecha", source = "fecha")
	VentaTarjeta matToVentaTarjeta(VentaTarjetaCreateRequest ventaTarjetaCreateRequest);
}
