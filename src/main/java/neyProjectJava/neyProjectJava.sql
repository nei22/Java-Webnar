drop database if exists neyProjectJava;

create database neyProjectJava;

use neyProjectJava;

create table Investimento (
cpf varchar(14) primary key,
nome varchar(45),
valor_investimento float,
taxa float,
periodo int,
ocorrencia date,
valor_calculado double
);

select * from Investimento;
	
           
           