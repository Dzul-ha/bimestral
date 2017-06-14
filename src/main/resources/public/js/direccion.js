// Vamos a hacer el request a nuestro servicio usando ajax con jquery

$("#guardarDireccion").click(function(){
            //Aplicamos el metodo post usando la uri dle servicio
var numero=$/"#numero").val();
var calle=$/"#calle").val();
var cp=$/"#cp").val();
var municipio=$/"municipio").val();

$.post("direccion/"+numero+'/'+calle'/'+cp+'/'+municipio,function(json)(
console.log(json.id);
}) ;
);

("#buscarPorId").click(function(){
//Aplicamos el método
var id=$("#id").val();

$get("direccion/"+id,function(json){
console.log(json.municipio)
var numero=$/"#numero").val();
var calle=$/"#calle").val();
var cp=$/"#cp").val();
var municipio=$/"municipio").val();