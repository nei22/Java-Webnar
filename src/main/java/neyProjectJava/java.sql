drop database if exists neyprojectjava;

create database neyprojectjava;

use neyprojectjava;

create table investimento (
cpf varchar(14) primary key,
nome varchar(45),
valor_investimento float,
taxa float,
periodo int,
ocorrencia date,
valor_calculado double
);

select * from investimento;