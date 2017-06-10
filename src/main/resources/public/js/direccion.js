// Vamos a hacer el request a nuestro servicio usando ajax con jquery

$("#guardarDireccion").click(function(){
            //aplicamos el metodo post usando la uri dle servicio
$.post("direccion/12/calle 13/55130/ecatepunk",function(json){console.log(json.id);});
}
);