grammar Psicoder;

start: (estructura | function)* main (estructura | function)* EOF;
main : FUNCION_PRINCIPAL commands FIN_PRINCIPAL;

estructura: ESTRUCTURA ID estruct_body FIN_ESTRUCTURA;
estruct_body
    : data_type (ID ) (COMA ID)* PYC estruct_body
    | ;

function : FUNCION data_type ID PAR_IZQ parameters PAR_DER HACER commands return FIN_FUNCION;
parameters
    : (data_type ID)(COMA data_type ID)*
    | ;
return: RETURN expr PYC;

commands
    : command commands
    | ;

command
    : read
    | print
    | if
    | while
    | do_while
    | for
//    | switch
    | assign PYC
    | declaration
    | call_function;

read : LEER PAR_IZQ id_c PAR_DER PYC;
print : IMPRIMIR PAR_IZQ expr (COMA expr)* PAR_DER PYC;

if : SI PAR_IZQ expr PAR_DER ENTONCES commands else FIN_SI;
else : SI_NO commands
     | ;

while : MIENTRAS PAR_IZQ expr PAR_DER HACER commands FIN_MIENTRAS;
do_while : HACER commands MIENTRAS PAR_IZQ expr PAR_DER PYC;
for : PARA PAR_IZQ (assign | declaration) PYC expr PYC expr PAR_DER HACER commands FIN_PARA ;

assign : id_c ASIG expr ;
declaration : data_type (ID (ASIG expr)?) (COMA ID (ASIG expr)?)* PYC;

call_function : ID PAR_IZQ send_parameters PAR_DER PYC;
send_parameters
    : expr (COMA expr)*
    | ;

expr
    : data (operator expr)?
    | MENOS expr
    | NEG expr
    | PAR_IZQ expr PAR_DER;

data
    : DATA_ENTERO
    | DATA_REAL
    | DATA_CARACTER
    | DATA_CADENA
    | FALSO
    | VERDADERO
    | call_function
    | id_c ;

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

data_type
    : BOOLEANO
    | CARACTER
    | ENTERO
    | REAL
    | CADENA
    | ID ;

id_c: ID ('.' ID)*;

WS		: [ \t\r\n]+ -> skip ;
FUNCION_PRINCIPAL : 'funcion_principal';
FIN_PRINCIPAL: 'fin_principal';
ESTRUCTURA: 'estructura';
FIN_ESTRUCTURA: 'fin_estructura';
RETURN: 'retornar';
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
SI : 'si';
ENTONCES: 'entonces';
SI_NO : 'si_no';
FIN_SI : 'fin_si';
MIENTRAS : 'mientras';
PAR_IZQ : '(';
PAR_DER : ')';
FIN_MIENTRAS : 'fin_mientras';
PARA: 'para';
FIN_PARA : 'fin_para';
ASIG : '=';
MAS : '+';
MENOS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
MENOR : '<';
MAYOR : '>';
MENOR_IGUAL : '<=';
MAYOR_IGUAL : '>=';
IGUAL : '==';
Y : '&&';
O : '||';
DIF : '!=';
NEG : '!';
ID : [a-zA-Z][a-zA-Z0-9_]*;
DATA_ENTERO : [0-9]+;
DATA_REAL : [0-9]+('.'[0-9]+);
DATA_CARACTER : '\'' [a-zA-Z0-9_ ] '\'';
DATA_CADENA :  '"' ([a-zA-Z0-9_ ])* '"';
FALSO : 'falso';
VERDADERO : 'verdadero';

