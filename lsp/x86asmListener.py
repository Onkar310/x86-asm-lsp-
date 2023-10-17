# Generated from x86asm.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .x86asmParser import x86asmParser
else:
    from x86asmParser import x86asmParser

# This class defines a complete listener for a parse tree produced by x86asmParser.
class x86asmListener(ParseTreeListener):

    # Enter a parse tree produced by x86asmParser#prog.
    def enterProg(self, ctx:x86asmParser.ProgContext):
        pass

    # Exit a parse tree produced by x86asmParser#prog.
    def exitProg(self, ctx:x86asmParser.ProgContext):
        pass


    # Enter a parse tree produced by x86asmParser#line.
    def enterLine(self, ctx:x86asmParser.LineContext):
        pass

    # Exit a parse tree produced by x86asmParser#line.
    def exitLine(self, ctx:x86asmParser.LineContext):
        pass


    # Enter a parse tree produced by x86asmParser#instruction.
    def enterInstruction(self, ctx:x86asmParser.InstructionContext):
        pass

    # Exit a parse tree produced by x86asmParser#instruction.
    def exitInstruction(self, ctx:x86asmParser.InstructionContext):
        pass


    # Enter a parse tree produced by x86asmParser#lbl.
    def enterLbl(self, ctx:x86asmParser.LblContext):
        pass

    # Exit a parse tree produced by x86asmParser#lbl.
    def exitLbl(self, ctx:x86asmParser.LblContext):
        pass


    # Enter a parse tree produced by x86asmParser#assemblerdirective.
    def enterAssemblerdirective(self, ctx:x86asmParser.AssemblerdirectiveContext):
        pass

    # Exit a parse tree produced by x86asmParser#assemblerdirective.
    def exitAssemblerdirective(self, ctx:x86asmParser.AssemblerdirectiveContext):
        pass


    # Enter a parse tree produced by x86asmParser#rw.
    def enterRw(self, ctx:x86asmParser.RwContext):
        pass

    # Exit a parse tree produced by x86asmParser#rw.
    def exitRw(self, ctx:x86asmParser.RwContext):
        pass


    # Enter a parse tree produced by x86asmParser#rb.
    def enterRb(self, ctx:x86asmParser.RbContext):
        pass

    # Exit a parse tree produced by x86asmParser#rb.
    def exitRb(self, ctx:x86asmParser.RbContext):
        pass


    # Enter a parse tree produced by x86asmParser#rs.
    def enterRs(self, ctx:x86asmParser.RsContext):
        pass

    # Exit a parse tree produced by x86asmParser#rs.
    def exitRs(self, ctx:x86asmParser.RsContext):
        pass


    # Enter a parse tree produced by x86asmParser#cseg.
    def enterCseg(self, ctx:x86asmParser.CsegContext):
        pass

    # Exit a parse tree produced by x86asmParser#cseg.
    def exitCseg(self, ctx:x86asmParser.CsegContext):
        pass


    # Enter a parse tree produced by x86asmParser#dseg.
    def enterDseg(self, ctx:x86asmParser.DsegContext):
        pass

    # Exit a parse tree produced by x86asmParser#dseg.
    def exitDseg(self, ctx:x86asmParser.DsegContext):
        pass


    # Enter a parse tree produced by x86asmParser#dw.
    def enterDw(self, ctx:x86asmParser.DwContext):
        pass

    # Exit a parse tree produced by x86asmParser#dw.
    def exitDw(self, ctx:x86asmParser.DwContext):
        pass


    # Enter a parse tree produced by x86asmParser#db.
    def enterDb(self, ctx:x86asmParser.DbContext):
        pass

    # Exit a parse tree produced by x86asmParser#db.
    def exitDb(self, ctx:x86asmParser.DbContext):
        pass


    # Enter a parse tree produced by x86asmParser#dd.
    def enterDd(self, ctx:x86asmParser.DdContext):
        pass

    # Exit a parse tree produced by x86asmParser#dd.
    def exitDd(self, ctx:x86asmParser.DdContext):
        pass


    # Enter a parse tree produced by x86asmParser#equ.
    def enterEqu(self, ctx:x86asmParser.EquContext):
        pass

    # Exit a parse tree produced by x86asmParser#equ.
    def exitEqu(self, ctx:x86asmParser.EquContext):
        pass


    # Enter a parse tree produced by x86asmParser#if_.
    def enterIf_(self, ctx:x86asmParser.If_Context):
        pass

    # Exit a parse tree produced by x86asmParser#if_.
    def exitIf_(self, ctx:x86asmParser.If_Context):
        pass


    # Enter a parse tree produced by x86asmParser#assemblerexpression.
    def enterAssemblerexpression(self, ctx:x86asmParser.AssemblerexpressionContext):
        pass

    # Exit a parse tree produced by x86asmParser#assemblerexpression.
    def exitAssemblerexpression(self, ctx:x86asmParser.AssemblerexpressionContext):
        pass


    # Enter a parse tree produced by x86asmParser#assemblerlogical.
    def enterAssemblerlogical(self, ctx:x86asmParser.AssemblerlogicalContext):
        pass

    # Exit a parse tree produced by x86asmParser#assemblerlogical.
    def exitAssemblerlogical(self, ctx:x86asmParser.AssemblerlogicalContext):
        pass


    # Enter a parse tree produced by x86asmParser#assemblerterm.
    def enterAssemblerterm(self, ctx:x86asmParser.AssemblertermContext):
        pass

    # Exit a parse tree produced by x86asmParser#assemblerterm.
    def exitAssemblerterm(self, ctx:x86asmParser.AssemblertermContext):
        pass


    # Enter a parse tree produced by x86asmParser#endif_.
    def enterEndif_(self, ctx:x86asmParser.Endif_Context):
        pass

    # Exit a parse tree produced by x86asmParser#endif_.
    def exitEndif_(self, ctx:x86asmParser.Endif_Context):
        pass


    # Enter a parse tree produced by x86asmParser#end.
    def enterEnd(self, ctx:x86asmParser.EndContext):
        pass

    # Exit a parse tree produced by x86asmParser#end.
    def exitEnd(self, ctx:x86asmParser.EndContext):
        pass


    # Enter a parse tree produced by x86asmParser#org.
    def enterOrg(self, ctx:x86asmParser.OrgContext):
        pass

    # Exit a parse tree produced by x86asmParser#org.
    def exitOrg(self, ctx:x86asmParser.OrgContext):
        pass


    # Enter a parse tree produced by x86asmParser#title.
    def enterTitle(self, ctx:x86asmParser.TitleContext):
        pass

    # Exit a parse tree produced by x86asmParser#title.
    def exitTitle(self, ctx:x86asmParser.TitleContext):
        pass


    # Enter a parse tree produced by x86asmParser#include_.
    def enterInclude_(self, ctx:x86asmParser.Include_Context):
        pass

    # Exit a parse tree produced by x86asmParser#include_.
    def exitInclude_(self, ctx:x86asmParser.Include_Context):
        pass


    # Enter a parse tree produced by x86asmParser#expressionlist.
    def enterExpressionlist(self, ctx:x86asmParser.ExpressionlistContext):
        pass

    # Exit a parse tree produced by x86asmParser#expressionlist.
    def exitExpressionlist(self, ctx:x86asmParser.ExpressionlistContext):
        pass


    # Enter a parse tree produced by x86asmParser#label.
    def enterLabel(self, ctx:x86asmParser.LabelContext):
        pass

    # Exit a parse tree produced by x86asmParser#label.
    def exitLabel(self, ctx:x86asmParser.LabelContext):
        pass


    # Enter a parse tree produced by x86asmParser#expression.
    def enterExpression(self, ctx:x86asmParser.ExpressionContext):
        pass

    # Exit a parse tree produced by x86asmParser#expression.
    def exitExpression(self, ctx:x86asmParser.ExpressionContext):
        pass


    # Enter a parse tree produced by x86asmParser#multiplyingExpression.
    def enterMultiplyingExpression(self, ctx:x86asmParser.MultiplyingExpressionContext):
        pass

    # Exit a parse tree produced by x86asmParser#multiplyingExpression.
    def exitMultiplyingExpression(self, ctx:x86asmParser.MultiplyingExpressionContext):
        pass


    # Enter a parse tree produced by x86asmParser#argument.
    def enterArgument(self, ctx:x86asmParser.ArgumentContext):
        pass

    # Exit a parse tree produced by x86asmParser#argument.
    def exitArgument(self, ctx:x86asmParser.ArgumentContext):
        pass


    # Enter a parse tree produced by x86asmParser#ptr.
    def enterPtr(self, ctx:x86asmParser.PtrContext):
        pass

    # Exit a parse tree produced by x86asmParser#ptr.
    def exitPtr(self, ctx:x86asmParser.PtrContext):
        pass


    # Enter a parse tree produced by x86asmParser#dollar.
    def enterDollar(self, ctx:x86asmParser.DollarContext):
        pass

    # Exit a parse tree produced by x86asmParser#dollar.
    def exitDollar(self, ctx:x86asmParser.DollarContext):
        pass


    # Enter a parse tree produced by x86asmParser#register_.
    def enterRegister_(self, ctx:x86asmParser.Register_Context):
        pass

    # Exit a parse tree produced by x86asmParser#register_.
    def exitRegister_(self, ctx:x86asmParser.Register_Context):
        pass


    # Enter a parse tree produced by x86asmParser#string_.
    def enterString_(self, ctx:x86asmParser.String_Context):
        pass

    # Exit a parse tree produced by x86asmParser#string_.
    def exitString_(self, ctx:x86asmParser.String_Context):
        pass


    # Enter a parse tree produced by x86asmParser#name.
    def enterName(self, ctx:x86asmParser.NameContext):
        pass

    # Exit a parse tree produced by x86asmParser#name.
    def exitName(self, ctx:x86asmParser.NameContext):
        pass


    # Enter a parse tree produced by x86asmParser#number.
    def enterNumber(self, ctx:x86asmParser.NumberContext):
        pass

    # Exit a parse tree produced by x86asmParser#number.
    def exitNumber(self, ctx:x86asmParser.NumberContext):
        pass


    # Enter a parse tree produced by x86asmParser#opcode.
    def enterOpcode(self, ctx:x86asmParser.OpcodeContext):
        pass

    # Exit a parse tree produced by x86asmParser#opcode.
    def exitOpcode(self, ctx:x86asmParser.OpcodeContext):
        pass


    # Enter a parse tree produced by x86asmParser#rep.
    def enterRep(self, ctx:x86asmParser.RepContext):
        pass

    # Exit a parse tree produced by x86asmParser#rep.
    def exitRep(self, ctx:x86asmParser.RepContext):
        pass


    # Enter a parse tree produced by x86asmParser#sign.
    def enterSign(self, ctx:x86asmParser.SignContext):
        pass

    # Exit a parse tree produced by x86asmParser#sign.
    def exitSign(self, ctx:x86asmParser.SignContext):
        pass



del x86asmParser