/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  T-
 * Created: 9/06/2017
 */

   create table direccion(id integer primary key auto_increment, 
numero integer, calle varchar(40), cp integer,  municipio varchar(40));


select * from direccion;
   
create table SalaCine(id_sala integer primary key,
 TituloPelicula varchar(80), Clasificacion varchar(20), num_asientos integer);

create table Boleto(id_boleto integer primary key auto_increment, id_sala integer, 
CostoBoleto float, foreign key(id_sala) references  SalaCine(id_sala));
describe SalaCine;
describe boleto;

create table SalaCine1(id_sala1 integer primary key,
 TituloPelicula varchar(80), Clasificacion varchar(20), num_asientos=20);



create table Clientes(id_Cliente interger primary key, nombre varchar(80));
create table TarjetasCredito(id_Tarjeta integer primary key, tipo char(7), saldo float, fecha date, 
foreign key(id_Cliente) references Clientes(id_Ciente));