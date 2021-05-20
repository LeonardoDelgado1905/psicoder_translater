grammar Psicoder;
/*
start: (funcion_estructura)* main (funcion_estructura)* EOF;
funcion_estructura
    : estructura funcion_estructura
    | function funcion_estructura
    | ;
main : FUNCION_PRINCIPAL commands FIN_PRINCIPAL;

estructura: ESTRUCTURA ID estruct_body FIN_ESTRUCTURA;
estruct_body
    : data_type declaration estruct_body
    | ;

function : FUNCION data_type ID PAR_IZQ parameters PAR_DER HACER commands return FIN_FUNCION; */
parameters
    : data_type ID (COMA parameters)?
    | ;

data_type
    : BOOLEANO
    | CARACTER
    | ENTERO
    | REAL
    | CADENA
    | ID ;

while : MIENTRAS PAR_IZQ 'a < 0' PAR_DER 'hacer' commands FIN_MIENTRAS;

commands
    : while
    | 'a += 1'
    | ;


FUNCION_PRINCIPAL : 'funcion_principal';
FIN_PRINCIPAL: 'fin_principal';
ESTRUCTURA: 'estructura';
FIN_ESTRUCTURA: 'fin_estructura';
BOOLEANO: 'booleano';
CARACTER: 'caracter';
ENTERO: 'entero';
REAL: 'real';
CADENA: 'cadena';
FUNCION: 'funcion';
FIN_FUNCION: 'fin_funcion';
HACER: 'hacer';
COMA: ',';

MIENTRAS : 'mientras';
PAR_IZQ : '(';
PAR_DER : ')';
FIN_MIENTRAS : 'fin_mientras';
ID: [a-zA-Z][a-zA-Z0-9_]*;
WS		: [ \t\r\n]+ -> skip ;