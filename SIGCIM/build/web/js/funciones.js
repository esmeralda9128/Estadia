var peticion = new XMLHttpRequest();
// comentario
var raizVista = window.location.origin + '/SIGCIM';

function clientesAdmin() {
    peticion.onreadystatechange = function () {
        if (this.status === 200) {
            var respuesta = JSON.parse(this.responseText);
            var clientes = respuesta.clientes;
            if (clientes != null) {
                for (var i = 0; i < clientes.length; i++) {
                         $('#clientesAdministrador').append('<tr><th>'+clientes.numCliente+'</th></tr>')
                }
            }
        }
    }
    peticion.open("GET", "http://localhost:9090/SIGCIM/SIGCIM/consultarClientesAdministrador", true);
    peticion.send();
}
