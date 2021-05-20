grammar Psicoder;
/*
start : (funcion_estructura)* main (funcion_estructura)* EOF;
funcion_estructura
    : estructura funcion_estructura
    | function funcion_estructura
    | ;*/
main : FUNCION_PRINCIPAL commands FIN_PRINCIPAL;

estructura: ESTRUCTURA ID estruct_body FIN_ESTRUCTURA;
estruct_body
    : data_type declaration estruct_body
    | ;

function : FUNCION data_type ID PAR_IZQ parameters PAR_DER HACER commands return FIN_FUNCION;
return: RETURN expr PYC;
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

commands
    : command commands
    | ;

command
    : read
    | print
   // | if
    | while
    | do_while
    | for
//    | switch
    | assign
    | declaration
    | call_function;

read : LEER PAR_IZQ ID PAR_DER PYC;
print : IMPRIMIR PAR_IZQ expr (COMA expr)* PAR_DER PYC;
//if : SI PAR_IZQ expr PAR_DER ENTONCES commands else FIN_SI;
//else : si_no commands
//     | ;
//switch : SELECCIONAR PAR_IZQ ID_C PAR_DER ENTRE switch_ ENTONCES;
//switch_ :

while : MIENTRAS PAR_IZQ expr PAR_DER HACER commands FIN_MIENTRAS;
do_while : HACER commands MIENTRAS PAR_IZQ expr PAR_DER PYC;
for : PARA PAR_IZQ (assign | declaration) PYC expr PYC expr PAR_DER HACER commands FIN_PARA ;

assign : ID_C ASIG expr PYC;
declaration : (data_type) ID ASIG expr PYC;
call_function : ID PAR_IZQ send_parameters PAR_DER PYC;
send_parameters
    : expr (COMA expr send_parameters)?
    | ;

expr
    : data (operator expr)?
    | MENOS expr
    | NEG expr
    | PAR_IZQ expr PAR_DER
    | ;

data
    : ENTERO
    | REAL
    | CARACTER
    | CADENA
    | FALSO
    | VERDADERO
    | call_function
    | ID_C ;

operator
    : MAS
    | MENOS
    | MULT
    | DIV
    | MOD
    | MENOR
    | MAYOR
    | MENOR_IGUAL
    | MAYOR_IGUAL
    | IGUAL
    | Y
    | O
    | DIF
    | NEG;
//id_c : ID PUNTO
WS		: [ \t\r\n]+ -> skip ;
FUNCION_PRINCIPAL : 'funcion_principal';
FIN_PRINCIPAL: 'fin_principal';
ESTRUCTURA: 'estructura';
FIN_ESTRUCTURA: 'fin_estructura';
RETURN: 'retorno';
BOOLEANO: 'booleano';
CARACTER: 'caracter';
ENTERO: 'entero';
REAL: 'real';
CADENA: 'cadena';
FUNCION: 'funcion';
FIN_FUNCION: 'fin_funcion';
HACER: 'hacer';
COMA: ',';
PYC: ';';
LEER: 'leer';
IMPRIMIR: 'imprimir';
MIENTRAS : 'mientras';
PAR_IZQ : '(';
PAR_DER : ')';
FIN_MIENTRAS : 'fin_mientras';
PARA: 'para';
FIN_PARA : 'fin_para';
ASIG : '=';

ID_C: [a-zA-Z][a-zA-Z0-9_]* ('.' ID_C)?;
ID : [a-zA-Z][a-zA-Z0-9_]*;
