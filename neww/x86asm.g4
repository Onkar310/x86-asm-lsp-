grammar x86asm;

options { caseInsensitive = true; }

prog
   : line* EOF
   ;

line
   : lbl? (assemblerdirective | instruction)? ('!' instruction)* EOL
   ;

instruction
   : rep? opcode expressionlist?
   ;

lbl
   : label COLON?
   ;

assemblerdirective
   : 'ORG'
   | 'END'
   | 'IF'
   | 'ENDIF'
   | 'EQU'
   | 'DB'
   | 'DW'
   | 'CSEG'
   | 'DD'
   | 'DSEG'
   | 'TITLE'
   | 'INCLUDE'
   | 'RW'
   | 'RB'
   | 'RS'
   | 'DOT'
   ;

rw
   : name? 'RW' expression
   ;

rb
   : name? 'RB' expression
   ;

rs
   : name? 'RS' expression
   ;

cseg
   : 'CSEG' expression?
   ;

dseg
   : 'DSEG' expression?
   ;

dw
   : 'DW' expressionlist
   ;

db
   : 'DB' expressionlist
   ;

dd
   : 'DD' expressionlist
   ;

equ
   : name 'EQU' expression
   ;

if_
   : 'IF' assemblerexpression
   ;

assemblerexpression
   : assemblerterm (assemblerlogical assemblerterm)*
   | RP assemblerexpression LP
   ;

assemblerlogical
   : 'EQ'
   | 'NE'
   ;

assemblerterm
   : name
   | number
   | 'NOT' assemblerterm
   ;

endif_
   : 'ENDIF'
   ;

end
   : 'END'
   ;

org
   : 'ORG' expression
   ;

title
   : 'TITLE' string_
   ;

include_
   : 'INCLUDE' name
   ;

expressionlist
   : expression (COMMA expression)*
   ;

label
   : name
   ;

expression
   : multiplyingExpression (sign multiplyingExpression)*
   ;

multiplyingExpression
   : argument ((STAR | SLASH | 'MOD' | 'AND') argument)*
   ;

argument
   : number
   | dollar
   | register_
   | name
   | string_
   | RP expression LP
   | (number | name)? LB expression RB_
   | ptr expression
   | 'NOT' expression
   | 'OFFSET' expression
   | 'LENGTH' expression
   | register_ COLON expression
   ;

ptr
   : ('BYTE' | 'WORD' | 'DWORD')? 'PTR'
   ;

dollar
   : '$'
   ;

register_
   : 'AH'
   | 'AL'
   | 'BH'
   | 'BL'
   | 'CH'
   | 'CL'
   | 'DH'
   | 'DL'
   | 'AX'
   | 'BX'
   | 'CX'
   | 'DX'
   | 'CI'
   | 'DI'
   | 'BP'
   | 'SP'
   | 'IP'
   | 'CS'
   | 'DS'
   | 'ES'
   | 'SS'
   ;

string_
   : STRING
   ;

name
   : NAME
   ;

number
   : sign? NUMBER
   ;

opcode
   : 'AAA'
   | 'AAD'
   | 'AAM'
   | 'AAS'
   | 'ADC'
   | 'ADD'
   | 'AND'
   | 'CALL'
   | 'CBW'
   | 'CLC'
   | 'CLD'
   | 'CLI'
   | 'CMC'
   | 'CMP'
   | 'CMPSB'
   | 'CMPSW'
   | 'CWD'
   | 'DAA'
   | 'DAS'
   | 'DEC'
   | 'DIV'
   | 'ESC'
   | 'HLT'
   | 'IDIV'
   | 'IMUL'
   | 'IN'
   | 'INC'
   | 'INT'
   | 'INTO'
   | 'IRET'
   | 'JA'
   | 'JAE'
   | 'JB'
   | 'JBE'
   | 'JC'
   | 'JE'
   | 'JG'
   | 'JGE'
   | 'JL'
   | 'JLE'
   | 'JNA'
   | 'JNAE'
   | 'JNB'
   | 'JNBE'
   | 'JNC'
   | 'JNE'
   | 'JNG'
   | 'JNGE'
   | 'JNL'
   | 'JNLE'
   | 'JNO'
   | 'JNP'
   | 'JNS'
   | 'JNZ'
   | 'JO'
   | 'JP'
   | 'JPE'
   | 'JPO'
   | 'JS'
   | 'JZ'
   | 'JCXZ'
   | 'JMP'
   | 'JMPS'
   | 'JMPF'
   | 'LAHF'
   | 'LDS'
   | 'LEA'
   | 'LES'
   | 'LOCK'
   | 'LODS'
   | 'LODSB'
   | 'LODSW'
   | 'LOOP'
   | 'LOOPE'
   | 'LOOPNE'
   | 'LOOPNZ'
   | 'LOOPZ'
   | 'MOV'
   | 'MOVS'
   | 'MOVSB'
   | 'MOVSW'
   | 'MUL'
   | 'NEG'
   | 'NOP'
   | 'NOT'
   | 'OR'
   | 'OUT'
   | 'POP'
   | 'POPF'
   | 'PUSH'
   | 'PUSHF'
   | 'RCL'
   | 'RCR'
   | 'RET'
   | 'RETN'
   | 'RETF'
   | 'ROL'
   | 'ROR'
   | 'SAHF'
   | 'SAL'
   | 'SAR'
   | 'SALC'
   | 'SBB'
   | 'SCASB'
   | 'SCASW'
   | 'SHL'
   | 'SHR'
   | 'STC'
   | 'STD'
   | 'STI'
   | 'STOSB'
   | 'STOSW'
   | 'SUB'
   | 'TEST'
   | 'WAIT'
   | 'XCHG'
   | 'XLAT'
   | 'XOR'
   ;

rep
   : 'REP'
   | 'REPE'
   | 'REPNE'
   | 'REPNZ'
   | 'REPZ'
   ;

sign : PLUS | MINUS ;


COMMENT
   : ';' ~ [\r\n]* -> skip
   ;


STAR : '*' ;
SLASH : '/' ;
DOLLAR : '$' ;
PLUS : '+' ;
MINUS : '-' ;
NOT_ : '!' ;
COLON : ':' ;
DOT : '.' ;
RP : '(' ;
LP : ')' ;
COMMA : ',' ;
SEMI : ';' ;
LB : '[' ;
RB_ : ']' ;

NAME
   : [.A-Z] [A-Z0-9."_]*
   ;

NUMBER
   : [0-9A-F] + 'H'?
   ;

STRING
   : '\u0027' ~'\u0027'* '\u0027'
   ;

EOL
   : [\r\n] +
   ;

WS
   : [ \t] -> skip
   ;
