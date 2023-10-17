grammer asm;
assemblerdirective
   : if_
   | endif_
   | include_
   ;

if_
   : IF expression
   ;

endif_
   : ENDIF
   ;

include_
   : INCLUDE name
   ;

argument
   : name
   | string_
   | number
   | register_
   ;

string_
   : STRING
   ;

name
   : NAME
   ;

number
   : sign NUMBER
   ;
register_
   : AH
   | AL
   | BH
   | BL
   | CH
   | CL
   | DH
   | DL
   | AX
   | BX
   | CX
   | DX
   | CI
   | DI
   | BP
   | SP
   | IP
   | CS
   | DS
   | ES
   | SS
   ;

sign : PLUS | MINUS ;

BYTE: 'BYTE';
WORD: 'WORD';
INCLUDE: 'INCLUDE';
ENDIF: 'ENDIF';
IF: 'IF';

AH: 'AH';
AL: 'AL';
BH: 'BH';
BL: 'BL';
CH: 'CH';
CL: 'CL';
DH: 'DH';
DL: 'DL';
AX: 'AX';
BX: 'BX';
CX: 'CX';
DX: 'DX';
CI: 'CI';
DI: 'DI';
BP: 'BP';
SP: 'SP';
IP: 'IP';
CS: 'CS';
DS: 'DS';
ES: 'ES';
SS: 'SS';

DOLLAR : '$' ;
PLUS : '+' ;
MINUS : '-' ;


NAME
   : [.A-Z] [A-Z0-9."_]*
   ;

NUMBER
   : [0-9A-F] + 'H'?
   ;

STRING
   : '\u0027' ~'\u0027'* '\u0027'
   ;
