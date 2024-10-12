package pe.edu.cibertec.CL2_service_Clientes.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.CL2_service_Clientes.remoteservice.ServicePedidoClient;


@RequiredArgsConstructor
@RestController
public class GestionClienteController {

    private final ServicePedidoClient servicePedidoClient;


    @GetMapping("/añadir-cliente")
    public String crearCliente(@RequestParam String nombre){
        return "Cliente  " + nombre + "  Creado con exito";
    }

    @GetMapping("/listar-clientes")
    public String listarClientes(){
        return "Lista de clientes: " +
                " Escanor Yasutora " +
                " Draken Tsubasa " +
                " Chad Sunshine ";
    }

    @GetMapping("/prueba-cliente")
    public String obtenerClientes(){
        return "Respuesta del Servicio Gestion Cliente";
    }

    @GetMapping("/cliente-pedido")
    public String obtenerClientePedido(){
        return servicePedidoClient.obtenerPedidos();
    }



}
