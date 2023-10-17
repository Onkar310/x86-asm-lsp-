# Generated from x86asm.g4 by ANTLR 4.13.0
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,188,289,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,
        7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,
        13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,
        20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,
        26,2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,
        33,7,33,2,34,7,34,2,35,7,35,2,36,7,36,1,0,5,0,76,8,0,10,0,12,0,79,
        9,0,1,0,1,0,1,1,3,1,84,8,1,1,1,1,1,3,1,88,8,1,1,1,1,1,5,1,92,8,1,
        10,1,12,1,95,9,1,1,1,1,1,1,2,3,2,100,8,2,1,2,1,2,3,2,104,8,2,1,3,
        1,3,3,3,108,8,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,
        1,4,1,4,1,4,1,4,3,4,126,8,4,1,5,3,5,129,8,5,1,5,1,5,1,5,1,6,3,6,
        135,8,6,1,6,1,6,1,6,1,7,3,7,141,8,7,1,7,1,7,1,7,1,8,1,8,3,8,148,
        8,8,1,9,1,9,3,9,152,8,9,1,10,1,10,1,10,1,11,1,11,1,11,1,12,1,12,
        1,12,1,13,1,13,1,13,1,13,1,14,1,14,1,14,1,15,1,15,1,15,1,15,5,15,
        174,8,15,10,15,12,15,177,9,15,1,15,1,15,1,15,1,15,3,15,183,8,15,
        1,16,1,16,1,17,1,17,1,17,1,17,3,17,191,8,17,1,18,1,18,1,19,1,19,
        1,20,1,20,1,20,1,21,1,21,1,21,1,22,1,22,1,22,1,23,1,23,1,23,5,23,
        209,8,23,10,23,12,23,212,9,23,1,24,1,24,1,25,1,25,1,25,1,25,5,25,
        220,8,25,10,25,12,25,223,9,25,1,26,1,26,1,26,5,26,228,8,26,10,26,
        12,26,231,9,26,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,
        1,27,3,27,244,8,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,
        1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,27,3,27,263,8,27,1,28,3,28,
        266,8,28,1,28,1,28,1,29,1,29,1,30,1,30,1,31,1,31,1,32,1,32,1,33,
        3,33,279,8,33,1,33,1,33,1,34,1,34,1,35,1,35,1,36,1,36,1,36,0,0,37,
        0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,
        46,48,50,52,54,56,58,60,62,64,66,68,70,72,0,7,1,0,22,23,3,0,24,24,
        53,53,170,171,1,0,1,3,1,0,26,46,1,0,47,164,1,0,165,169,1,0,173,174,
        301,0,77,1,0,0,0,2,83,1,0,0,0,4,99,1,0,0,0,6,105,1,0,0,0,8,125,1,
        0,0,0,10,128,1,0,0,0,12,134,1,0,0,0,14,140,1,0,0,0,16,145,1,0,0,
        0,18,149,1,0,0,0,20,153,1,0,0,0,22,156,1,0,0,0,24,159,1,0,0,0,26,
        162,1,0,0,0,28,166,1,0,0,0,30,182,1,0,0,0,32,184,1,0,0,0,34,190,
        1,0,0,0,36,192,1,0,0,0,38,194,1,0,0,0,40,196,1,0,0,0,42,199,1,0,
        0,0,44,202,1,0,0,0,46,205,1,0,0,0,48,213,1,0,0,0,50,215,1,0,0,0,
        52,224,1,0,0,0,54,262,1,0,0,0,56,265,1,0,0,0,58,269,1,0,0,0,60,271,
        1,0,0,0,62,273,1,0,0,0,64,275,1,0,0,0,66,278,1,0,0,0,68,282,1,0,
        0,0,70,284,1,0,0,0,72,286,1,0,0,0,74,76,3,2,1,0,75,74,1,0,0,0,76,
        79,1,0,0,0,77,75,1,0,0,0,77,78,1,0,0,0,78,80,1,0,0,0,79,77,1,0,0,
        0,80,81,5,0,0,1,81,1,1,0,0,0,82,84,3,6,3,0,83,82,1,0,0,0,83,84,1,
        0,0,0,84,87,1,0,0,0,85,88,3,8,4,0,86,88,3,4,2,0,87,85,1,0,0,0,87,
        86,1,0,0,0,87,88,1,0,0,0,88,93,1,0,0,0,89,90,5,175,0,0,90,92,3,4,
        2,0,91,89,1,0,0,0,92,95,1,0,0,0,93,91,1,0,0,0,93,94,1,0,0,0,94,96,
        1,0,0,0,95,93,1,0,0,0,96,97,5,187,0,0,97,3,1,0,0,0,98,100,3,70,35,
        0,99,98,1,0,0,0,99,100,1,0,0,0,100,101,1,0,0,0,101,103,3,68,34,0,
        102,104,3,46,23,0,103,102,1,0,0,0,103,104,1,0,0,0,104,5,1,0,0,0,
        105,107,3,48,24,0,106,108,5,176,0,0,107,106,1,0,0,0,107,108,1,0,
        0,0,108,7,1,0,0,0,109,126,3,40,20,0,110,126,3,38,19,0,111,126,3,
        28,14,0,112,126,3,36,18,0,113,126,3,26,13,0,114,126,3,22,11,0,115,
        126,3,20,10,0,116,126,3,16,8,0,117,126,3,24,12,0,118,126,3,18,9,
        0,119,126,3,42,21,0,120,126,3,44,22,0,121,126,3,10,5,0,122,126,3,
        12,6,0,123,126,3,14,7,0,124,126,5,177,0,0,125,109,1,0,0,0,125,110,
        1,0,0,0,125,111,1,0,0,0,125,112,1,0,0,0,125,113,1,0,0,0,125,114,
        1,0,0,0,125,115,1,0,0,0,125,116,1,0,0,0,125,117,1,0,0,0,125,118,
        1,0,0,0,125,119,1,0,0,0,125,120,1,0,0,0,125,121,1,0,0,0,125,122,
        1,0,0,0,125,123,1,0,0,0,125,124,1,0,0,0,126,9,1,0,0,0,127,129,3,
        64,32,0,128,127,1,0,0,0,128,129,1,0,0,0,129,130,1,0,0,0,130,131,
        5,18,0,0,131,132,3,50,25,0,132,11,1,0,0,0,133,135,3,64,32,0,134,
        133,1,0,0,0,134,135,1,0,0,0,135,136,1,0,0,0,136,137,5,19,0,0,137,
        138,3,50,25,0,138,13,1,0,0,0,139,141,3,64,32,0,140,139,1,0,0,0,140,
        141,1,0,0,0,141,142,1,0,0,0,142,143,5,20,0,0,143,144,3,50,25,0,144,
        15,1,0,0,0,145,147,5,5,0,0,146,148,3,50,25,0,147,146,1,0,0,0,147,
        148,1,0,0,0,148,17,1,0,0,0,149,151,5,4,0,0,150,152,3,50,25,0,151,
        150,1,0,0,0,151,152,1,0,0,0,152,19,1,0,0,0,153,154,5,13,0,0,154,
        155,3,46,23,0,155,21,1,0,0,0,156,157,5,14,0,0,157,158,3,46,23,0,
        158,23,1,0,0,0,159,160,5,15,0,0,160,161,3,46,23,0,161,25,1,0,0,0,
        162,163,3,64,32,0,163,164,5,12,0,0,164,165,3,50,25,0,165,27,1,0,
        0,0,166,167,5,11,0,0,167,168,3,30,15,0,168,29,1,0,0,0,169,175,3,
        34,17,0,170,171,3,32,16,0,171,172,3,34,17,0,172,174,1,0,0,0,173,
        170,1,0,0,0,174,177,1,0,0,0,175,173,1,0,0,0,175,176,1,0,0,0,176,
        183,1,0,0,0,177,175,1,0,0,0,178,179,5,178,0,0,179,180,3,30,15,0,
        180,181,5,179,0,0,181,183,1,0,0,0,182,169,1,0,0,0,182,178,1,0,0,
        0,183,31,1,0,0,0,184,185,7,0,0,0,185,33,1,0,0,0,186,191,3,64,32,
        0,187,191,3,66,33,0,188,189,5,131,0,0,189,191,3,34,17,0,190,186,
        1,0,0,0,190,187,1,0,0,0,190,188,1,0,0,0,191,35,1,0,0,0,192,193,5,
        10,0,0,193,37,1,0,0,0,194,195,5,8,0,0,195,39,1,0,0,0,196,197,5,9,
        0,0,197,198,3,50,25,0,198,41,1,0,0,0,199,200,5,7,0,0,200,201,3,62,
        31,0,201,43,1,0,0,0,202,203,5,6,0,0,203,204,3,64,32,0,204,45,1,0,
        0,0,205,210,3,50,25,0,206,207,5,180,0,0,207,209,3,50,25,0,208,206,
        1,0,0,0,209,212,1,0,0,0,210,208,1,0,0,0,210,211,1,0,0,0,211,47,1,
        0,0,0,212,210,1,0,0,0,213,214,3,64,32,0,214,49,1,0,0,0,215,221,3,
        52,26,0,216,217,3,72,36,0,217,218,3,52,26,0,218,220,1,0,0,0,219,
        216,1,0,0,0,220,223,1,0,0,0,221,219,1,0,0,0,221,222,1,0,0,0,222,
        51,1,0,0,0,223,221,1,0,0,0,224,229,3,54,27,0,225,226,7,1,0,0,226,
        228,3,54,27,0,227,225,1,0,0,0,228,231,1,0,0,0,229,227,1,0,0,0,229,
        230,1,0,0,0,230,53,1,0,0,0,231,229,1,0,0,0,232,263,3,66,33,0,233,
        263,3,58,29,0,234,263,3,60,30,0,235,263,3,64,32,0,236,263,3,62,31,
        0,237,238,5,178,0,0,238,239,3,50,25,0,239,240,5,179,0,0,240,263,
        1,0,0,0,241,244,3,66,33,0,242,244,3,64,32,0,243,241,1,0,0,0,243,
        242,1,0,0,0,243,244,1,0,0,0,244,245,1,0,0,0,245,246,5,182,0,0,246,
        247,3,50,25,0,247,248,5,183,0,0,248,263,1,0,0,0,249,250,3,56,28,
        0,250,251,3,50,25,0,251,263,1,0,0,0,252,253,5,131,0,0,253,263,3,
        50,25,0,254,255,5,17,0,0,255,263,3,50,25,0,256,257,5,21,0,0,257,
        263,3,50,25,0,258,259,3,60,30,0,259,260,5,176,0,0,260,261,3,50,25,
        0,261,263,1,0,0,0,262,232,1,0,0,0,262,233,1,0,0,0,262,234,1,0,0,
        0,262,235,1,0,0,0,262,236,1,0,0,0,262,237,1,0,0,0,262,243,1,0,0,
        0,262,249,1,0,0,0,262,252,1,0,0,0,262,254,1,0,0,0,262,256,1,0,0,
        0,262,258,1,0,0,0,263,55,1,0,0,0,264,266,7,2,0,0,265,264,1,0,0,0,
        265,266,1,0,0,0,266,267,1,0,0,0,267,268,5,16,0,0,268,57,1,0,0,0,
        269,270,5,172,0,0,270,59,1,0,0,0,271,272,7,3,0,0,272,61,1,0,0,0,
        273,274,5,186,0,0,274,63,1,0,0,0,275,276,5,184,0,0,276,65,1,0,0,
        0,277,279,3,72,36,0,278,277,1,0,0,0,278,279,1,0,0,0,279,280,1,0,
        0,0,280,281,5,185,0,0,281,67,1,0,0,0,282,283,7,4,0,0,283,69,1,0,
        0,0,284,285,7,5,0,0,285,71,1,0,0,0,286,287,7,6,0,0,287,73,1,0,0,
        0,23,77,83,87,93,99,103,107,125,128,134,140,147,151,175,182,190,
        210,221,229,243,262,265,278
    ]

class x86asmParser ( Parser ):

    grammarFileName = "x86asm.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'BYTE'", "'WORD'", "'DWORD'", "'DSEG'", 
                     "'CSEG'", "'INCLUDE'", "'TITLE'", "'END'", "'ORG'", 
                     "'ENDIF'", "'IF'", "'EQU'", "'DW'", "'DB'", "'DD'", 
                     "'PTR'", "'OFFSET'", "'RW'", "'RB'", "'RS'", "'LENGTH'", 
                     "'EQ'", "'NE'", "'MOD'", "<INVALID>", "'AH'", "'AL'", 
                     "'BH'", "'BL'", "'CH'", "'CL'", "'DH'", "'DL'", "'AX'", 
                     "'BX'", "'CX'", "'DX'", "'CI'", "'DI'", "'BP'", "'SP'", 
                     "'IP'", "'CS'", "'DS'", "'ES'", "'SS'", "'AAA'", "'AAD'", 
                     "'AAM'", "'AAS'", "'ADC'", "'ADD'", "'AND'", "'CALL'", 
                     "'CBW'", "'CLC'", "'CLD'", "'CLI'", "'CMC'", "'CMP'", 
                     "'CMPSB'", "'CMPSW'", "'CWD'", "'DAA'", "'DAS'", "'DEC'", 
                     "'DIV'", "'ESC'", "'HLT'", "'IDIV'", "'IMUL'", "'IN'", 
                     "'INC'", "'INT'", "'INTO'", "'IRET'", "'JA'", "'JAE'", 
                     "'JB'", "'JBE'", "'JC'", "'JE'", "'JG'", "'JGE'", "'JL'", 
                     "'JLE'", "'JNA'", "'JNAE'", "'JNB'", "'JNBE'", "'JNC'", 
                     "'JNE'", "'JNG'", "'JNGE'", "'JNL'", "'JNLE'", "'JNO'", 
                     "'JNP'", "'JNS'", "'JNZ'", "'JO'", "'JP'", "'JPE'", 
                     "'JPO'", "'JS'", "'JZ'", "'JCXZ'", "'JMP'", "'JMPS'", 
                     "'JMPF'", "'LAHF'", "'LDS'", "'LEA'", "'LES'", "'LOCK'", 
                     "'LODS'", "'LODSB'", "'LODSW'", "'LOOP'", "'LOOPE'", 
                     "'LOOPNE'", "'LOOPNZ'", "'LOOPZ'", "'MOV'", "'MOVS'", 
                     "'MOVSB'", "'MOVSW'", "'MUL'", "'NEG'", "'NOP'", "'NOT'", 
                     "'OR'", "'OUT'", "'POP'", "'POPF'", "'PUSH'", "'PUSHF'", 
                     "'RCL'", "'RCR'", "'RET'", "'RETN'", "'RETF'", "'ROL'", 
                     "'ROR'", "'SAHF'", "'SAL'", "'SAR'", "'SALC'", "'SBB'", 
                     "'SCASB'", "'SCASW'", "'SHL'", "'SHR'", "'STC'", "'STD'", 
                     "'STI'", "'STOSB'", "'STOSW'", "'SUB'", "'TEST'", "'WAIT'", 
                     "'XCHG'", "'XLAT'", "'XOR'", "'REP'", "'REPE'", "'REPNE'", 
                     "'REPNZ'", "'REPZ'", "'*'", "'/'", "'$'", "'+'", "'-'", 
                     "'!'", "':'", "'.'", "'('", "')'", "','", "';'", "'['", 
                     "']'" ]

    symbolicNames = [ "<INVALID>", "BYTE", "WORD", "DWORD", "DSEG", "CSEG", 
                      "INCLUDE", "TITLE", "END", "ORG", "ENDIF", "IF", "EQU", 
                      "DW", "DB", "DD", "PTR", "OFFSET", "RW", "RB", "RS", 
                      "LENGTH", "EQ", "NE", "MOD", "COMMENT", "AH", "AL", 
                      "BH", "BL", "CH", "CL", "DH", "DL", "AX", "BX", "CX", 
                      "DX", "CI", "DI", "BP", "SP", "IP", "CS", "DS", "ES", 
                      "SS", "AAA", "AAD", "AAM", "AAS", "ADC", "ADD", "AND", 
                      "CALL", "CBW", "CLC", "CLD", "CLI", "CMC", "CMP", 
                      "CMPSB", "CMPSW", "CWD", "DAA", "DAS", "DEC", "DIV", 
                      "ESC", "HLT", "IDIV", "IMUL", "IN", "INC", "INT", 
                      "INTO", "IRET", "JA", "JAE", "JB", "JBE", "JC", "JE", 
                      "JG", "JGE", "JL", "JLE", "JNA", "JNAE", "JNB", "JNBE", 
                      "JNC", "JNE", "JNG", "JNGE", "JNL", "JNLE", "JNO", 
                      "JNP", "JNS", "JNZ", "JO", "JP", "JPE", "JPO", "JS", 
                      "JZ", "JCXZ", "JMP", "JMPS", "JMPF", "LAHF", "LDS", 
                      "LEA", "LES", "LOCK", "LODS", "LODSB", "LODSW", "LOOP", 
                      "LOOPE", "LOOPNE", "LOOPNZ", "LOOPZ", "MOV", "MOVS", 
                      "MOVSB", "MOVSW", "MUL", "NEG", "NOP", "NOT", "OR", 
                      "OUT", "POP", "POPF", "PUSH", "PUSHF", "RCL", "RCR", 
                      "RET", "RETN", "RETF", "ROL", "ROR", "SAHF", "SAL", 
                      "SAR", "SALC", "SBB", "SCASB", "SCASW", "SHL", "SHR", 
                      "STC", "STD", "STI", "STOSB", "STOSW", "SUB", "TEST", 
                      "WAIT", "XCHG", "XLAT", "XOR", "REP", "REPE", "REPNE", 
                      "REPNZ", "REPZ", "STAR", "SLASH", "DOLLAR", "PLUS", 
                      "MINUS", "NOT_", "COLON", "DOT", "RP", "LP", "COMMA", 
                      "SEMI", "LB", "RB_", "NAME", "NUMBER", "STRING", "EOL", 
                      "WS" ]

    RULE_prog = 0
    RULE_line = 1
    RULE_instruction = 2
    RULE_lbl = 3
    RULE_assemblerdirective = 4
    RULE_rw = 5
    RULE_rb = 6
    RULE_rs = 7
    RULE_cseg = 8
    RULE_dseg = 9
    RULE_dw = 10
    RULE_db = 11
    RULE_dd = 12
    RULE_equ = 13
    RULE_if_ = 14
    RULE_assemblerexpression = 15
    RULE_assemblerlogical = 16
    RULE_assemblerterm = 17
    RULE_endif_ = 18
    RULE_end = 19
    RULE_org = 20
    RULE_title = 21
    RULE_include_ = 22
    RULE_expressionlist = 23
    RULE_label = 24
    RULE_expression = 25
    RULE_multiplyingExpression = 26
    RULE_argument = 27
    RULE_ptr = 28
    RULE_dollar = 29
    RULE_register_ = 30
    RULE_string_ = 31
    RULE_name = 32
    RULE_number = 33
    RULE_opcode = 34
    RULE_rep = 35
    RULE_sign = 36

    ruleNames =  [ "prog", "line", "instruction", "lbl", "assemblerdirective", 
                   "rw", "rb", "rs", "cseg", "dseg", "dw", "db", "dd", "equ", 
                   "if_", "assemblerexpression", "assemblerlogical", "assemblerterm", 
                   "endif_", "end", "org", "title", "include_", "expressionlist", 
                   "label", "expression", "multiplyingExpression", "argument", 
                   "ptr", "dollar", "register_", "string_", "name", "number", 
                   "opcode", "rep", "sign" ]

    EOF = Token.EOF
    BYTE=1
    WORD=2
    DWORD=3
    DSEG=4
    CSEG=5
    INCLUDE=6
    TITLE=7
    END=8
    ORG=9
    ENDIF=10
    IF=11
    EQU=12
    DW=13
    DB=14
    DD=15
    PTR=16
    OFFSET=17
    RW=18
    RB=19
    RS=20
    LENGTH=21
    EQ=22
    NE=23
    MOD=24
    COMMENT=25
    AH=26
    AL=27
    BH=28
    BL=29
    CH=30
    CL=31
    DH=32
    DL=33
    AX=34
    BX=35
    CX=36
    DX=37
    CI=38
    DI=39
    BP=40
    SP=41
    IP=42
    CS=43
    DS=44
    ES=45
    SS=46
    AAA=47
    AAD=48
    AAM=49
    AAS=50
    ADC=51
    ADD=52
    AND=53
    CALL=54
    CBW=55
    CLC=56
    CLD=57
    CLI=58
    CMC=59
    CMP=60
    CMPSB=61
    CMPSW=62
    CWD=63
    DAA=64
    DAS=65
    DEC=66
    DIV=67
    ESC=68
    HLT=69
    IDIV=70
    IMUL=71
    IN=72
    INC=73
    INT=74
    INTO=75
    IRET=76
    JA=77
    JAE=78
    JB=79
    JBE=80
    JC=81
    JE=82
    JG=83
    JGE=84
    JL=85
    JLE=86
    JNA=87
    JNAE=88
    JNB=89
    JNBE=90
    JNC=91
    JNE=92
    JNG=93
    JNGE=94
    JNL=95
    JNLE=96
    JNO=97
    JNP=98
    JNS=99
    JNZ=100
    JO=101
    JP=102
    JPE=103
    JPO=104
    JS=105
    JZ=106
    JCXZ=107
    JMP=108
    JMPS=109
    JMPF=110
    LAHF=111
    LDS=112
    LEA=113
    LES=114
    LOCK=115
    LODS=116
    LODSB=117
    LODSW=118
    LOOP=119
    LOOPE=120
    LOOPNE=121
    LOOPNZ=122
    LOOPZ=123
    MOV=124
    MOVS=125
    MOVSB=126
    MOVSW=127
    MUL=128
    NEG=129
    NOP=130
    NOT=131
    OR=132
    OUT=133
    POP=134
    POPF=135
    PUSH=136
    PUSHF=137
    RCL=138
    RCR=139
    RET=140
    RETN=141
    RETF=142
    ROL=143
    ROR=144
    SAHF=145
    SAL=146
    SAR=147
    SALC=148
    SBB=149
    SCASB=150
    SCASW=151
    SHL=152
    SHR=153
    STC=154
    STD=155
    STI=156
    STOSB=157
    STOSW=158
    SUB=159
    TEST=160
    WAIT=161
    XCHG=162
    XLAT=163
    XOR=164
    REP=165
    REPE=166
    REPNE=167
    REPNZ=168
    REPZ=169
    STAR=170
    SLASH=171
    DOLLAR=172
    PLUS=173
    MINUS=174
    NOT_=175
    COLON=176
    DOT=177
    RP=178
    LP=179
    COMMA=180
    SEMI=181
    LB=182
    RB_=183
    NAME=184
    NUMBER=185
    STRING=186
    EOL=187
    WS=188

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.0")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(x86asmParser.EOF, 0)

        def line(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(x86asmParser.LineContext)
            else:
                return self.getTypedRuleContext(x86asmParser.LineContext,i)


        def getRuleIndex(self):
            return x86asmParser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)




    def prog(self):

        localctx = x86asmParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 77
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & -140737486458896) != 0) or ((((_la - 64)) & ~0x3f) == 0 and ((1 << (_la - 64)) & -1) != 0) or ((((_la - 128)) & ~0x3f) == 0 and ((1 << (_la - 128)) & 649226431829639167) != 0):
                self.state = 74
                self.line()
                self.state = 79
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 80
            self.match(x86asmParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LineContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOL(self):
            return self.getToken(x86asmParser.EOL, 0)

        def lbl(self):
            return self.getTypedRuleContext(x86asmParser.LblContext,0)


        def assemblerdirective(self):
            return self.getTypedRuleContext(x86asmParser.AssemblerdirectiveContext,0)


        def instruction(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(x86asmParser.InstructionContext)
            else:
                return self.getTypedRuleContext(x86asmParser.InstructionContext,i)


        def NOT_(self, i:int=None):
            if i is None:
                return self.getTokens(x86asmParser.NOT_)
            else:
                return self.getToken(x86asmParser.NOT_, i)

        def getRuleIndex(self):
            return x86asmParser.RULE_line

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLine" ):
                listener.enterLine(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLine" ):
                listener.exitLine(self)




    def line(self):

        localctx = x86asmParser.LineContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_line)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 83
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.state = 82
                self.lbl()


            self.state = 87
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 18, 19, 20, 177, 184]:
                self.state = 85
                self.assemblerdirective()
                pass
            elif token in [47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169]:
                self.state = 86
                self.instruction()
                pass
            elif token in [175, 187]:
                pass
            else:
                pass
            self.state = 93
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==175:
                self.state = 89
                self.match(x86asmParser.NOT_)
                self.state = 90
                self.instruction()
                self.state = 95
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 96
            self.match(x86asmParser.EOL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InstructionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def opcode(self):
            return self.getTypedRuleContext(x86asmParser.OpcodeContext,0)


        def rep(self):
            return self.getTypedRuleContext(x86asmParser.RepContext,0)


        def expressionlist(self):
            return self.getTypedRuleContext(x86asmParser.ExpressionlistContext,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_instruction

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInstruction" ):
                listener.enterInstruction(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInstruction" ):
                listener.exitInstruction(self)




    def instruction(self):

        localctx = x86asmParser.InstructionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_instruction)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 99
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if ((((_la - 165)) & ~0x3f) == 0 and ((1 << (_la - 165)) & 31) != 0):
                self.state = 98
                self.rep()


            self.state = 101
            self.opcode()
            self.state = 103
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 140737423540238) != 0) or ((((_la - 131)) & ~0x3f) == 0 and ((1 << (_la - 131)) & 65458325248016385) != 0):
                self.state = 102
                self.expressionlist()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LblContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def label(self):
            return self.getTypedRuleContext(x86asmParser.LabelContext,0)


        def COLON(self):
            return self.getToken(x86asmParser.COLON, 0)

        def getRuleIndex(self):
            return x86asmParser.RULE_lbl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLbl" ):
                listener.enterLbl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLbl" ):
                listener.exitLbl(self)




    def lbl(self):

        localctx = x86asmParser.LblContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_lbl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 105
            self.label()
            self.state = 107
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==176:
                self.state = 106
                self.match(x86asmParser.COLON)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssemblerdirectiveContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def org(self):
            return self.getTypedRuleContext(x86asmParser.OrgContext,0)


        def end(self):
            return self.getTypedRuleContext(x86asmParser.EndContext,0)


        def if_(self):
            return self.getTypedRuleContext(x86asmParser.If_Context,0)


        def endif_(self):
            return self.getTypedRuleContext(x86asmParser.Endif_Context,0)


        def equ(self):
            return self.getTypedRuleContext(x86asmParser.EquContext,0)


        def db(self):
            return self.getTypedRuleContext(x86asmParser.DbContext,0)


        def dw(self):
            return self.getTypedRuleContext(x86asmParser.DwContext,0)


        def cseg(self):
            return self.getTypedRuleContext(x86asmParser.CsegContext,0)


        def dd(self):
            return self.getTypedRuleContext(x86asmParser.DdContext,0)


        def dseg(self):
            return self.getTypedRuleContext(x86asmParser.DsegContext,0)


        def title(self):
            return self.getTypedRuleContext(x86asmParser.TitleContext,0)


        def include_(self):
            return self.getTypedRuleContext(x86asmParser.Include_Context,0)


        def rw(self):
            return self.getTypedRuleContext(x86asmParser.RwContext,0)


        def rb(self):
            return self.getTypedRuleContext(x86asmParser.RbContext,0)


        def rs(self):
            return self.getTypedRuleContext(x86asmParser.RsContext,0)


        def DOT(self):
            return self.getToken(x86asmParser.DOT, 0)

        def getRuleIndex(self):
            return x86asmParser.RULE_assemblerdirective

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssemblerdirective" ):
                listener.enterAssemblerdirective(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssemblerdirective" ):
                listener.exitAssemblerdirective(self)




    def assemblerdirective(self):

        localctx = x86asmParser.AssemblerdirectiveContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_assemblerdirective)
        try:
            self.state = 125
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 109
                self.org()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 110
                self.end()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 111
                self.if_()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 112
                self.endif_()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 113
                self.equ()
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 114
                self.db()
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 115
                self.dw()
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 116
                self.cseg()
                pass

            elif la_ == 9:
                self.enterOuterAlt(localctx, 9)
                self.state = 117
                self.dd()
                pass

            elif la_ == 10:
                self.enterOuterAlt(localctx, 10)
                self.state = 118
                self.dseg()
                pass

            elif la_ == 11:
                self.enterOuterAlt(localctx, 11)
                self.state = 119
                self.title()
                pass

            elif la_ == 12:
                self.enterOuterAlt(localctx, 12)
                self.state = 120
                self.include_()
                pass

            elif la_ == 13:
                self.enterOuterAlt(localctx, 13)
                self.state = 121
                self.rw()
                pass

            elif la_ == 14:
                self.enterOuterAlt(localctx, 14)
                self.state = 122
                self.rb()
                pass

            elif la_ == 15:
                self.enterOuterAlt(localctx, 15)
                self.state = 123
                self.rs()
                pass

            elif la_ == 16:
                self.enterOuterAlt(localctx, 16)
                self.state = 124
                self.match(x86asmParser.DOT)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RwContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RW(self):
            return self.getToken(x86asmParser.RW, 0)

        def expression(self):
            return self.getTypedRuleContext(x86asmParser.ExpressionContext,0)


        def name(self):
            return self.getTypedRuleContext(x86asmParser.NameContext,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_rw

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRw" ):
                listener.enterRw(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRw" ):
                listener.exitRw(self)




    def rw(self):

        localctx = x86asmParser.RwContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_rw)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 128
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==184:
                self.state = 127
                self.name()


            self.state = 130
            self.match(x86asmParser.RW)
            self.state = 131
            self.expression()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RbContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RB(self):
            return self.getToken(x86asmParser.RB, 0)

        def expression(self):
            return self.getTypedRuleContext(x86asmParser.ExpressionContext,0)


        def name(self):
            return self.getTypedRuleContext(x86asmParser.NameContext,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_rb

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRb" ):
                listener.enterRb(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRb" ):
                listener.exitRb(self)




    def rb(self):

        localctx = x86asmParser.RbContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_rb)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 134
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==184:
                self.state = 133
                self.name()


            self.state = 136
            self.match(x86asmParser.RB)
            self.state = 137
            self.expression()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RS(self):
            return self.getToken(x86asmParser.RS, 0)

        def expression(self):
            return self.getTypedRuleContext(x86asmParser.ExpressionContext,0)


        def name(self):
            return self.getTypedRuleContext(x86asmParser.NameContext,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_rs

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRs" ):
                listener.enterRs(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRs" ):
                listener.exitRs(self)




    def rs(self):

        localctx = x86asmParser.RsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_rs)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 140
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==184:
                self.state = 139
                self.name()


            self.state = 142
            self.match(x86asmParser.RS)
            self.state = 143
            self.expression()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CsegContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CSEG(self):
            return self.getToken(x86asmParser.CSEG, 0)

        def expression(self):
            return self.getTypedRuleContext(x86asmParser.ExpressionContext,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_cseg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCseg" ):
                listener.enterCseg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCseg" ):
                listener.exitCseg(self)




    def cseg(self):

        localctx = x86asmParser.CsegContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_cseg)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 145
            self.match(x86asmParser.CSEG)
            self.state = 147
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 140737423540238) != 0) or ((((_la - 131)) & ~0x3f) == 0 and ((1 << (_la - 131)) & 65458325248016385) != 0):
                self.state = 146
                self.expression()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DsegContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DSEG(self):
            return self.getToken(x86asmParser.DSEG, 0)

        def expression(self):
            return self.getTypedRuleContext(x86asmParser.ExpressionContext,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_dseg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDseg" ):
                listener.enterDseg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDseg" ):
                listener.exitDseg(self)




    def dseg(self):

        localctx = x86asmParser.DsegContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_dseg)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 149
            self.match(x86asmParser.DSEG)
            self.state = 151
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 140737423540238) != 0) or ((((_la - 131)) & ~0x3f) == 0 and ((1 << (_la - 131)) & 65458325248016385) != 0):
                self.state = 150
                self.expression()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DwContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DW(self):
            return self.getToken(x86asmParser.DW, 0)

        def expressionlist(self):
            return self.getTypedRuleContext(x86asmParser.ExpressionlistContext,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_dw

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDw" ):
                listener.enterDw(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDw" ):
                listener.exitDw(self)




    def dw(self):

        localctx = x86asmParser.DwContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_dw)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 153
            self.match(x86asmParser.DW)
            self.state = 154
            self.expressionlist()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DbContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DB(self):
            return self.getToken(x86asmParser.DB, 0)

        def expressionlist(self):
            return self.getTypedRuleContext(x86asmParser.ExpressionlistContext,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_db

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDb" ):
                listener.enterDb(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDb" ):
                listener.exitDb(self)




    def db(self):

        localctx = x86asmParser.DbContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_db)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 156
            self.match(x86asmParser.DB)
            self.state = 157
            self.expressionlist()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DdContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DD(self):
            return self.getToken(x86asmParser.DD, 0)

        def expressionlist(self):
            return self.getTypedRuleContext(x86asmParser.ExpressionlistContext,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_dd

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDd" ):
                listener.enterDd(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDd" ):
                listener.exitDd(self)




    def dd(self):

        localctx = x86asmParser.DdContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_dd)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 159
            self.match(x86asmParser.DD)
            self.state = 160
            self.expressionlist()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EquContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def name(self):
            return self.getTypedRuleContext(x86asmParser.NameContext,0)


        def EQU(self):
            return self.getToken(x86asmParser.EQU, 0)

        def expression(self):
            return self.getTypedRuleContext(x86asmParser.ExpressionContext,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_equ

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEqu" ):
                listener.enterEqu(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEqu" ):
                listener.exitEqu(self)




    def equ(self):

        localctx = x86asmParser.EquContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_equ)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 162
            self.name()
            self.state = 163
            self.match(x86asmParser.EQU)
            self.state = 164
            self.expression()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class If_Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(x86asmParser.IF, 0)

        def assemblerexpression(self):
            return self.getTypedRuleContext(x86asmParser.AssemblerexpressionContext,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_if_

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIf_" ):
                listener.enterIf_(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIf_" ):
                listener.exitIf_(self)




    def if_(self):

        localctx = x86asmParser.If_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_if_)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 166
            self.match(x86asmParser.IF)
            self.state = 167
            self.assemblerexpression()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssemblerexpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def assemblerterm(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(x86asmParser.AssemblertermContext)
            else:
                return self.getTypedRuleContext(x86asmParser.AssemblertermContext,i)


        def assemblerlogical(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(x86asmParser.AssemblerlogicalContext)
            else:
                return self.getTypedRuleContext(x86asmParser.AssemblerlogicalContext,i)


        def RP(self):
            return self.getToken(x86asmParser.RP, 0)

        def assemblerexpression(self):
            return self.getTypedRuleContext(x86asmParser.AssemblerexpressionContext,0)


        def LP(self):
            return self.getToken(x86asmParser.LP, 0)

        def getRuleIndex(self):
            return x86asmParser.RULE_assemblerexpression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssemblerexpression" ):
                listener.enterAssemblerexpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssemblerexpression" ):
                listener.exitAssemblerexpression(self)




    def assemblerexpression(self):

        localctx = x86asmParser.AssemblerexpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_assemblerexpression)
        self._la = 0 # Token type
        try:
            self.state = 182
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [131, 173, 174, 184, 185]:
                self.enterOuterAlt(localctx, 1)
                self.state = 169
                self.assemblerterm()
                self.state = 175
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==22 or _la==23:
                    self.state = 170
                    self.assemblerlogical()
                    self.state = 171
                    self.assemblerterm()
                    self.state = 177
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass
            elif token in [178]:
                self.enterOuterAlt(localctx, 2)
                self.state = 178
                self.match(x86asmParser.RP)
                self.state = 179
                self.assemblerexpression()
                self.state = 180
                self.match(x86asmParser.LP)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssemblerlogicalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EQ(self):
            return self.getToken(x86asmParser.EQ, 0)

        def NE(self):
            return self.getToken(x86asmParser.NE, 0)

        def getRuleIndex(self):
            return x86asmParser.RULE_assemblerlogical

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssemblerlogical" ):
                listener.enterAssemblerlogical(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssemblerlogical" ):
                listener.exitAssemblerlogical(self)




    def assemblerlogical(self):

        localctx = x86asmParser.AssemblerlogicalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_assemblerlogical)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 184
            _la = self._input.LA(1)
            if not(_la==22 or _la==23):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssemblertermContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def name(self):
            return self.getTypedRuleContext(x86asmParser.NameContext,0)


        def number(self):
            return self.getTypedRuleContext(x86asmParser.NumberContext,0)


        def NOT(self):
            return self.getToken(x86asmParser.NOT, 0)

        def assemblerterm(self):
            return self.getTypedRuleContext(x86asmParser.AssemblertermContext,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_assemblerterm

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssemblerterm" ):
                listener.enterAssemblerterm(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssemblerterm" ):
                listener.exitAssemblerterm(self)




    def assemblerterm(self):

        localctx = x86asmParser.AssemblertermContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_assemblerterm)
        try:
            self.state = 190
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [184]:
                self.enterOuterAlt(localctx, 1)
                self.state = 186
                self.name()
                pass
            elif token in [173, 174, 185]:
                self.enterOuterAlt(localctx, 2)
                self.state = 187
                self.number()
                pass
            elif token in [131]:
                self.enterOuterAlt(localctx, 3)
                self.state = 188
                self.match(x86asmParser.NOT)
                self.state = 189
                self.assemblerterm()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Endif_Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ENDIF(self):
            return self.getToken(x86asmParser.ENDIF, 0)

        def getRuleIndex(self):
            return x86asmParser.RULE_endif_

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEndif_" ):
                listener.enterEndif_(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEndif_" ):
                listener.exitEndif_(self)




    def endif_(self):

        localctx = x86asmParser.Endif_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_endif_)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 192
            self.match(x86asmParser.ENDIF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EndContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def END(self):
            return self.getToken(x86asmParser.END, 0)

        def getRuleIndex(self):
            return x86asmParser.RULE_end

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEnd" ):
                listener.enterEnd(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEnd" ):
                listener.exitEnd(self)




    def end(self):

        localctx = x86asmParser.EndContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_end)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 194
            self.match(x86asmParser.END)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OrgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ORG(self):
            return self.getToken(x86asmParser.ORG, 0)

        def expression(self):
            return self.getTypedRuleContext(x86asmParser.ExpressionContext,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_org

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOrg" ):
                listener.enterOrg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOrg" ):
                listener.exitOrg(self)




    def org(self):

        localctx = x86asmParser.OrgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_org)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 196
            self.match(x86asmParser.ORG)
            self.state = 197
            self.expression()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TitleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TITLE(self):
            return self.getToken(x86asmParser.TITLE, 0)

        def string_(self):
            return self.getTypedRuleContext(x86asmParser.String_Context,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_title

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTitle" ):
                listener.enterTitle(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTitle" ):
                listener.exitTitle(self)




    def title(self):

        localctx = x86asmParser.TitleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_title)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 199
            self.match(x86asmParser.TITLE)
            self.state = 200
            self.string_()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Include_Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INCLUDE(self):
            return self.getToken(x86asmParser.INCLUDE, 0)

        def name(self):
            return self.getTypedRuleContext(x86asmParser.NameContext,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_include_

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInclude_" ):
                listener.enterInclude_(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInclude_" ):
                listener.exitInclude_(self)




    def include_(self):

        localctx = x86asmParser.Include_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_include_)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 202
            self.match(x86asmParser.INCLUDE)
            self.state = 203
            self.name()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionlistContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(x86asmParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(x86asmParser.ExpressionContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(x86asmParser.COMMA)
            else:
                return self.getToken(x86asmParser.COMMA, i)

        def getRuleIndex(self):
            return x86asmParser.RULE_expressionlist

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionlist" ):
                listener.enterExpressionlist(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionlist" ):
                listener.exitExpressionlist(self)




    def expressionlist(self):

        localctx = x86asmParser.ExpressionlistContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_expressionlist)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 205
            self.expression()
            self.state = 210
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==180:
                self.state = 206
                self.match(x86asmParser.COMMA)
                self.state = 207
                self.expression()
                self.state = 212
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LabelContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def name(self):
            return self.getTypedRuleContext(x86asmParser.NameContext,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_label

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLabel" ):
                listener.enterLabel(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLabel" ):
                listener.exitLabel(self)




    def label(self):

        localctx = x86asmParser.LabelContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_label)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 213
            self.name()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def multiplyingExpression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(x86asmParser.MultiplyingExpressionContext)
            else:
                return self.getTypedRuleContext(x86asmParser.MultiplyingExpressionContext,i)


        def sign(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(x86asmParser.SignContext)
            else:
                return self.getTypedRuleContext(x86asmParser.SignContext,i)


        def getRuleIndex(self):
            return x86asmParser.RULE_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpression" ):
                listener.enterExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpression" ):
                listener.exitExpression(self)




    def expression(self):

        localctx = x86asmParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_expression)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 215
            self.multiplyingExpression()
            self.state = 221
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,17,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 216
                    self.sign()
                    self.state = 217
                    self.multiplyingExpression() 
                self.state = 223
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,17,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MultiplyingExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def argument(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(x86asmParser.ArgumentContext)
            else:
                return self.getTypedRuleContext(x86asmParser.ArgumentContext,i)


        def STAR(self, i:int=None):
            if i is None:
                return self.getTokens(x86asmParser.STAR)
            else:
                return self.getToken(x86asmParser.STAR, i)

        def SLASH(self, i:int=None):
            if i is None:
                return self.getTokens(x86asmParser.SLASH)
            else:
                return self.getToken(x86asmParser.SLASH, i)

        def MOD(self, i:int=None):
            if i is None:
                return self.getTokens(x86asmParser.MOD)
            else:
                return self.getToken(x86asmParser.MOD, i)

        def AND(self, i:int=None):
            if i is None:
                return self.getTokens(x86asmParser.AND)
            else:
                return self.getToken(x86asmParser.AND, i)

        def getRuleIndex(self):
            return x86asmParser.RULE_multiplyingExpression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMultiplyingExpression" ):
                listener.enterMultiplyingExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMultiplyingExpression" ):
                listener.exitMultiplyingExpression(self)




    def multiplyingExpression(self):

        localctx = x86asmParser.MultiplyingExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_multiplyingExpression)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 224
            self.argument()
            self.state = 229
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,18,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 225
                    _la = self._input.LA(1)
                    if not(_la==24 or _la==53 or _la==170 or _la==171):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 226
                    self.argument() 
                self.state = 231
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,18,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgumentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def number(self):
            return self.getTypedRuleContext(x86asmParser.NumberContext,0)


        def dollar(self):
            return self.getTypedRuleContext(x86asmParser.DollarContext,0)


        def register_(self):
            return self.getTypedRuleContext(x86asmParser.Register_Context,0)


        def name(self):
            return self.getTypedRuleContext(x86asmParser.NameContext,0)


        def string_(self):
            return self.getTypedRuleContext(x86asmParser.String_Context,0)


        def RP(self):
            return self.getToken(x86asmParser.RP, 0)

        def expression(self):
            return self.getTypedRuleContext(x86asmParser.ExpressionContext,0)


        def LP(self):
            return self.getToken(x86asmParser.LP, 0)

        def LB(self):
            return self.getToken(x86asmParser.LB, 0)

        def RB_(self):
            return self.getToken(x86asmParser.RB_, 0)

        def ptr(self):
            return self.getTypedRuleContext(x86asmParser.PtrContext,0)


        def NOT(self):
            return self.getToken(x86asmParser.NOT, 0)

        def OFFSET(self):
            return self.getToken(x86asmParser.OFFSET, 0)

        def LENGTH(self):
            return self.getToken(x86asmParser.LENGTH, 0)

        def COLON(self):
            return self.getToken(x86asmParser.COLON, 0)

        def getRuleIndex(self):
            return x86asmParser.RULE_argument

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArgument" ):
                listener.enterArgument(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArgument" ):
                listener.exitArgument(self)




    def argument(self):

        localctx = x86asmParser.ArgumentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_argument)
        try:
            self.state = 262
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,20,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 232
                self.number()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 233
                self.dollar()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 234
                self.register_()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 235
                self.name()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 236
                self.string_()
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 237
                self.match(x86asmParser.RP)
                self.state = 238
                self.expression()
                self.state = 239
                self.match(x86asmParser.LP)
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 243
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [173, 174, 185]:
                    self.state = 241
                    self.number()
                    pass
                elif token in [184]:
                    self.state = 242
                    self.name()
                    pass
                elif token in [182]:
                    pass
                else:
                    pass
                self.state = 245
                self.match(x86asmParser.LB)
                self.state = 246
                self.expression()
                self.state = 247
                self.match(x86asmParser.RB_)
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 249
                self.ptr()
                self.state = 250
                self.expression()
                pass

            elif la_ == 9:
                self.enterOuterAlt(localctx, 9)
                self.state = 252
                self.match(x86asmParser.NOT)
                self.state = 253
                self.expression()
                pass

            elif la_ == 10:
                self.enterOuterAlt(localctx, 10)
                self.state = 254
                self.match(x86asmParser.OFFSET)
                self.state = 255
                self.expression()
                pass

            elif la_ == 11:
                self.enterOuterAlt(localctx, 11)
                self.state = 256
                self.match(x86asmParser.LENGTH)
                self.state = 257
                self.expression()
                pass

            elif la_ == 12:
                self.enterOuterAlt(localctx, 12)
                self.state = 258
                self.register_()
                self.state = 259
                self.match(x86asmParser.COLON)
                self.state = 260
                self.expression()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PtrContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PTR(self):
            return self.getToken(x86asmParser.PTR, 0)

        def BYTE(self):
            return self.getToken(x86asmParser.BYTE, 0)

        def WORD(self):
            return self.getToken(x86asmParser.WORD, 0)

        def DWORD(self):
            return self.getToken(x86asmParser.DWORD, 0)

        def getRuleIndex(self):
            return x86asmParser.RULE_ptr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPtr" ):
                listener.enterPtr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPtr" ):
                listener.exitPtr(self)




    def ptr(self):

        localctx = x86asmParser.PtrContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_ptr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 265
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 14) != 0):
                self.state = 264
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 14) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()


            self.state = 267
            self.match(x86asmParser.PTR)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DollarContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DOLLAR(self):
            return self.getToken(x86asmParser.DOLLAR, 0)

        def getRuleIndex(self):
            return x86asmParser.RULE_dollar

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDollar" ):
                listener.enterDollar(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDollar" ):
                listener.exitDollar(self)




    def dollar(self):

        localctx = x86asmParser.DollarContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_dollar)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 269
            self.match(x86asmParser.DOLLAR)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Register_Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def AH(self):
            return self.getToken(x86asmParser.AH, 0)

        def AL(self):
            return self.getToken(x86asmParser.AL, 0)

        def BH(self):
            return self.getToken(x86asmParser.BH, 0)

        def BL(self):
            return self.getToken(x86asmParser.BL, 0)

        def CH(self):
            return self.getToken(x86asmParser.CH, 0)

        def CL(self):
            return self.getToken(x86asmParser.CL, 0)

        def DH(self):
            return self.getToken(x86asmParser.DH, 0)

        def DL(self):
            return self.getToken(x86asmParser.DL, 0)

        def AX(self):
            return self.getToken(x86asmParser.AX, 0)

        def BX(self):
            return self.getToken(x86asmParser.BX, 0)

        def CX(self):
            return self.getToken(x86asmParser.CX, 0)

        def DX(self):
            return self.getToken(x86asmParser.DX, 0)

        def CI(self):
            return self.getToken(x86asmParser.CI, 0)

        def DI(self):
            return self.getToken(x86asmParser.DI, 0)

        def BP(self):
            return self.getToken(x86asmParser.BP, 0)

        def SP(self):
            return self.getToken(x86asmParser.SP, 0)

        def IP(self):
            return self.getToken(x86asmParser.IP, 0)

        def CS(self):
            return self.getToken(x86asmParser.CS, 0)

        def DS(self):
            return self.getToken(x86asmParser.DS, 0)

        def ES(self):
            return self.getToken(x86asmParser.ES, 0)

        def SS(self):
            return self.getToken(x86asmParser.SS, 0)

        def getRuleIndex(self):
            return x86asmParser.RULE_register_

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRegister_" ):
                listener.enterRegister_(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRegister_" ):
                listener.exitRegister_(self)




    def register_(self):

        localctx = x86asmParser.Register_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_register_)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 271
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 140737421246464) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class String_Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(x86asmParser.STRING, 0)

        def getRuleIndex(self):
            return x86asmParser.RULE_string_

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterString_" ):
                listener.enterString_(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitString_" ):
                listener.exitString_(self)




    def string_(self):

        localctx = x86asmParser.String_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 62, self.RULE_string_)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 273
            self.match(x86asmParser.STRING)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NAME(self):
            return self.getToken(x86asmParser.NAME, 0)

        def getRuleIndex(self):
            return x86asmParser.RULE_name

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterName" ):
                listener.enterName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitName" ):
                listener.exitName(self)




    def name(self):

        localctx = x86asmParser.NameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 64, self.RULE_name)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 275
            self.match(x86asmParser.NAME)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NumberContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(x86asmParser.NUMBER, 0)

        def sign(self):
            return self.getTypedRuleContext(x86asmParser.SignContext,0)


        def getRuleIndex(self):
            return x86asmParser.RULE_number

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNumber" ):
                listener.enterNumber(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNumber" ):
                listener.exitNumber(self)




    def number(self):

        localctx = x86asmParser.NumberContext(self, self._ctx, self.state)
        self.enterRule(localctx, 66, self.RULE_number)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 278
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==173 or _la==174:
                self.state = 277
                self.sign()


            self.state = 280
            self.match(x86asmParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OpcodeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def AAA(self):
            return self.getToken(x86asmParser.AAA, 0)

        def AAD(self):
            return self.getToken(x86asmParser.AAD, 0)

        def AAM(self):
            return self.getToken(x86asmParser.AAM, 0)

        def AAS(self):
            return self.getToken(x86asmParser.AAS, 0)

        def ADC(self):
            return self.getToken(x86asmParser.ADC, 0)

        def ADD(self):
            return self.getToken(x86asmParser.ADD, 0)

        def AND(self):
            return self.getToken(x86asmParser.AND, 0)

        def CALL(self):
            return self.getToken(x86asmParser.CALL, 0)

        def CBW(self):
            return self.getToken(x86asmParser.CBW, 0)

        def CLC(self):
            return self.getToken(x86asmParser.CLC, 0)

        def CLD(self):
            return self.getToken(x86asmParser.CLD, 0)

        def CLI(self):
            return self.getToken(x86asmParser.CLI, 0)

        def CMC(self):
            return self.getToken(x86asmParser.CMC, 0)

        def CMP(self):
            return self.getToken(x86asmParser.CMP, 0)

        def CMPSB(self):
            return self.getToken(x86asmParser.CMPSB, 0)

        def CMPSW(self):
            return self.getToken(x86asmParser.CMPSW, 0)

        def CWD(self):
            return self.getToken(x86asmParser.CWD, 0)

        def DAA(self):
            return self.getToken(x86asmParser.DAA, 0)

        def DAS(self):
            return self.getToken(x86asmParser.DAS, 0)

        def DEC(self):
            return self.getToken(x86asmParser.DEC, 0)

        def DIV(self):
            return self.getToken(x86asmParser.DIV, 0)

        def ESC(self):
            return self.getToken(x86asmParser.ESC, 0)

        def HLT(self):
            return self.getToken(x86asmParser.HLT, 0)

        def IDIV(self):
            return self.getToken(x86asmParser.IDIV, 0)

        def IMUL(self):
            return self.getToken(x86asmParser.IMUL, 0)

        def IN(self):
            return self.getToken(x86asmParser.IN, 0)

        def INC(self):
            return self.getToken(x86asmParser.INC, 0)

        def INT(self):
            return self.getToken(x86asmParser.INT, 0)

        def INTO(self):
            return self.getToken(x86asmParser.INTO, 0)

        def IRET(self):
            return self.getToken(x86asmParser.IRET, 0)

        def JA(self):
            return self.getToken(x86asmParser.JA, 0)

        def JAE(self):
            return self.getToken(x86asmParser.JAE, 0)

        def JB(self):
            return self.getToken(x86asmParser.JB, 0)

        def JBE(self):
            return self.getToken(x86asmParser.JBE, 0)

        def JC(self):
            return self.getToken(x86asmParser.JC, 0)

        def JE(self):
            return self.getToken(x86asmParser.JE, 0)

        def JG(self):
            return self.getToken(x86asmParser.JG, 0)

        def JGE(self):
            return self.getToken(x86asmParser.JGE, 0)

        def JL(self):
            return self.getToken(x86asmParser.JL, 0)

        def JLE(self):
            return self.getToken(x86asmParser.JLE, 0)

        def JNA(self):
            return self.getToken(x86asmParser.JNA, 0)

        def JNAE(self):
            return self.getToken(x86asmParser.JNAE, 0)

        def JNB(self):
            return self.getToken(x86asmParser.JNB, 0)

        def JNBE(self):
            return self.getToken(x86asmParser.JNBE, 0)

        def JNC(self):
            return self.getToken(x86asmParser.JNC, 0)

        def JNE(self):
            return self.getToken(x86asmParser.JNE, 0)

        def JNG(self):
            return self.getToken(x86asmParser.JNG, 0)

        def JNGE(self):
            return self.getToken(x86asmParser.JNGE, 0)

        def JNL(self):
            return self.getToken(x86asmParser.JNL, 0)

        def JNLE(self):
            return self.getToken(x86asmParser.JNLE, 0)

        def JNO(self):
            return self.getToken(x86asmParser.JNO, 0)

        def JNP(self):
            return self.getToken(x86asmParser.JNP, 0)

        def JNS(self):
            return self.getToken(x86asmParser.JNS, 0)

        def JNZ(self):
            return self.getToken(x86asmParser.JNZ, 0)

        def JO(self):
            return self.getToken(x86asmParser.JO, 0)

        def JP(self):
            return self.getToken(x86asmParser.JP, 0)

        def JPE(self):
            return self.getToken(x86asmParser.JPE, 0)

        def JPO(self):
            return self.getToken(x86asmParser.JPO, 0)

        def JS(self):
            return self.getToken(x86asmParser.JS, 0)

        def JZ(self):
            return self.getToken(x86asmParser.JZ, 0)

        def JCXZ(self):
            return self.getToken(x86asmParser.JCXZ, 0)

        def JMP(self):
            return self.getToken(x86asmParser.JMP, 0)

        def JMPS(self):
            return self.getToken(x86asmParser.JMPS, 0)

        def JMPF(self):
            return self.getToken(x86asmParser.JMPF, 0)

        def LAHF(self):
            return self.getToken(x86asmParser.LAHF, 0)

        def LDS(self):
            return self.getToken(x86asmParser.LDS, 0)

        def LEA(self):
            return self.getToken(x86asmParser.LEA, 0)

        def LES(self):
            return self.getToken(x86asmParser.LES, 0)

        def LOCK(self):
            return self.getToken(x86asmParser.LOCK, 0)

        def LODS(self):
            return self.getToken(x86asmParser.LODS, 0)

        def LODSB(self):
            return self.getToken(x86asmParser.LODSB, 0)

        def LODSW(self):
            return self.getToken(x86asmParser.LODSW, 0)

        def LOOP(self):
            return self.getToken(x86asmParser.LOOP, 0)

        def LOOPE(self):
            return self.getToken(x86asmParser.LOOPE, 0)

        def LOOPNE(self):
            return self.getToken(x86asmParser.LOOPNE, 0)

        def LOOPNZ(self):
            return self.getToken(x86asmParser.LOOPNZ, 0)

        def LOOPZ(self):
            return self.getToken(x86asmParser.LOOPZ, 0)

        def MOV(self):
            return self.getToken(x86asmParser.MOV, 0)

        def MOVS(self):
            return self.getToken(x86asmParser.MOVS, 0)

        def MOVSB(self):
            return self.getToken(x86asmParser.MOVSB, 0)

        def MOVSW(self):
            return self.getToken(x86asmParser.MOVSW, 0)

        def MUL(self):
            return self.getToken(x86asmParser.MUL, 0)

        def NEG(self):
            return self.getToken(x86asmParser.NEG, 0)

        def NOP(self):
            return self.getToken(x86asmParser.NOP, 0)

        def NOT(self):
            return self.getToken(x86asmParser.NOT, 0)

        def OR(self):
            return self.getToken(x86asmParser.OR, 0)

        def OUT(self):
            return self.getToken(x86asmParser.OUT, 0)

        def POP(self):
            return self.getToken(x86asmParser.POP, 0)

        def POPF(self):
            return self.getToken(x86asmParser.POPF, 0)

        def PUSH(self):
            return self.getToken(x86asmParser.PUSH, 0)

        def PUSHF(self):
            return self.getToken(x86asmParser.PUSHF, 0)

        def RCL(self):
            return self.getToken(x86asmParser.RCL, 0)

        def RCR(self):
            return self.getToken(x86asmParser.RCR, 0)

        def RET(self):
            return self.getToken(x86asmParser.RET, 0)

        def RETN(self):
            return self.getToken(x86asmParser.RETN, 0)

        def RETF(self):
            return self.getToken(x86asmParser.RETF, 0)

        def ROL(self):
            return self.getToken(x86asmParser.ROL, 0)

        def ROR(self):
            return self.getToken(x86asmParser.ROR, 0)

        def SAHF(self):
            return self.getToken(x86asmParser.SAHF, 0)

        def SAL(self):
            return self.getToken(x86asmParser.SAL, 0)

        def SAR(self):
            return self.getToken(x86asmParser.SAR, 0)

        def SALC(self):
            return self.getToken(x86asmParser.SALC, 0)

        def SBB(self):
            return self.getToken(x86asmParser.SBB, 0)

        def SCASB(self):
            return self.getToken(x86asmParser.SCASB, 0)

        def SCASW(self):
            return self.getToken(x86asmParser.SCASW, 0)

        def SHL(self):
            return self.getToken(x86asmParser.SHL, 0)

        def SHR(self):
            return self.getToken(x86asmParser.SHR, 0)

        def STC(self):
            return self.getToken(x86asmParser.STC, 0)

        def STD(self):
            return self.getToken(x86asmParser.STD, 0)

        def STI(self):
            return self.getToken(x86asmParser.STI, 0)

        def STOSB(self):
            return self.getToken(x86asmParser.STOSB, 0)

        def STOSW(self):
            return self.getToken(x86asmParser.STOSW, 0)

        def SUB(self):
            return self.getToken(x86asmParser.SUB, 0)

        def TEST(self):
            return self.getToken(x86asmParser.TEST, 0)

        def WAIT(self):
            return self.getToken(x86asmParser.WAIT, 0)

        def XCHG(self):
            return self.getToken(x86asmParser.XCHG, 0)

        def XLAT(self):
            return self.getToken(x86asmParser.XLAT, 0)

        def XOR(self):
            return self.getToken(x86asmParser.XOR, 0)

        def getRuleIndex(self):
            return x86asmParser.RULE_opcode

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpcode" ):
                listener.enterOpcode(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpcode" ):
                listener.exitOpcode(self)




    def opcode(self):

        localctx = x86asmParser.OpcodeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 68, self.RULE_opcode)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 282
            _la = self._input.LA(1)
            if not(((((_la - 47)) & ~0x3f) == 0 and ((1 << (_la - 47)) & -1) != 0) or ((((_la - 111)) & ~0x3f) == 0 and ((1 << (_la - 111)) & 18014398509481983) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RepContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def REP(self):
            return self.getToken(x86asmParser.REP, 0)

        def REPE(self):
            return self.getToken(x86asmParser.REPE, 0)

        def REPNE(self):
            return self.getToken(x86asmParser.REPNE, 0)

        def REPNZ(self):
            return self.getToken(x86asmParser.REPNZ, 0)

        def REPZ(self):
            return self.getToken(x86asmParser.REPZ, 0)

        def getRuleIndex(self):
            return x86asmParser.RULE_rep

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRep" ):
                listener.enterRep(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRep" ):
                listener.exitRep(self)




    def rep(self):

        localctx = x86asmParser.RepContext(self, self._ctx, self.state)
        self.enterRule(localctx, 70, self.RULE_rep)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 284
            _la = self._input.LA(1)
            if not(((((_la - 165)) & ~0x3f) == 0 and ((1 << (_la - 165)) & 31) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SignContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PLUS(self):
            return self.getToken(x86asmParser.PLUS, 0)

        def MINUS(self):
            return self.getToken(x86asmParser.MINUS, 0)

        def getRuleIndex(self):
            return x86asmParser.RULE_sign

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSign" ):
                listener.enterSign(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSign" ):
                listener.exitSign(self)




    def sign(self):

        localctx = x86asmParser.SignContext(self, self._ctx, self.state)
        self.enterRule(localctx, 72, self.RULE_sign)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 286
            _la = self._input.LA(1)
            if not(_la==173 or _la==174):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





