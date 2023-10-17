// Generated from x86asm.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link x86asmParser}.
 */
public interface x86asmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link x86asmParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(x86asmParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(x86asmParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(x86asmParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(x86asmParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(x86asmParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(x86asmParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#lbl}.
	 * @param ctx the parse tree
	 */
	void enterLbl(x86asmParser.LblContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#lbl}.
	 * @param ctx the parse tree
	 */
	void exitLbl(x86asmParser.LblContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#assemblerdirective}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerdirective(x86asmParser.AssemblerdirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#assemblerdirective}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerdirective(x86asmParser.AssemblerdirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#rw}.
	 * @param ctx the parse tree
	 */
	void enterRw(x86asmParser.RwContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#rw}.
	 * @param ctx the parse tree
	 */
	void exitRw(x86asmParser.RwContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#rb}.
	 * @param ctx the parse tree
	 */
	void enterRb(x86asmParser.RbContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#rb}.
	 * @param ctx the parse tree
	 */
	void exitRb(x86asmParser.RbContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#rs}.
	 * @param ctx the parse tree
	 */
	void enterRs(x86asmParser.RsContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#rs}.
	 * @param ctx the parse tree
	 */
	void exitRs(x86asmParser.RsContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#cseg}.
	 * @param ctx the parse tree
	 */
	void enterCseg(x86asmParser.CsegContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#cseg}.
	 * @param ctx the parse tree
	 */
	void exitCseg(x86asmParser.CsegContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#dseg}.
	 * @param ctx the parse tree
	 */
	void enterDseg(x86asmParser.DsegContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#dseg}.
	 * @param ctx the parse tree
	 */
	void exitDseg(x86asmParser.DsegContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#dw}.
	 * @param ctx the parse tree
	 */
	void enterDw(x86asmParser.DwContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#dw}.
	 * @param ctx the parse tree
	 */
	void exitDw(x86asmParser.DwContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#db}.
	 * @param ctx the parse tree
	 */
	void enterDb(x86asmParser.DbContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#db}.
	 * @param ctx the parse tree
	 */
	void exitDb(x86asmParser.DbContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#dd}.
	 * @param ctx the parse tree
	 */
	void enterDd(x86asmParser.DdContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#dd}.
	 * @param ctx the parse tree
	 */
	void exitDd(x86asmParser.DdContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#equ}.
	 * @param ctx the parse tree
	 */
	void enterEqu(x86asmParser.EquContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#equ}.
	 * @param ctx the parse tree
	 */
	void exitEqu(x86asmParser.EquContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(x86asmParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(x86asmParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#assemblerexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerexpression(x86asmParser.AssemblerexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#assemblerexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerexpression(x86asmParser.AssemblerexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#assemblerlogical}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerlogical(x86asmParser.AssemblerlogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#assemblerlogical}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerlogical(x86asmParser.AssemblerlogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#assemblerterm}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerterm(x86asmParser.AssemblertermContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#assemblerterm}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerterm(x86asmParser.AssemblertermContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#endif_}.
	 * @param ctx the parse tree
	 */
	void enterEndif_(x86asmParser.Endif_Context ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#endif_}.
	 * @param ctx the parse tree
	 */
	void exitEndif_(x86asmParser.Endif_Context ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(x86asmParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(x86asmParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#org}.
	 * @param ctx the parse tree
	 */
	void enterOrg(x86asmParser.OrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#org}.
	 * @param ctx the parse tree
	 */
	void exitOrg(x86asmParser.OrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(x86asmParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(x86asmParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#include_}.
	 * @param ctx the parse tree
	 */
	void enterInclude_(x86asmParser.Include_Context ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#include_}.
	 * @param ctx the parse tree
	 */
	void exitInclude_(x86asmParser.Include_Context ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void enterExpressionlist(x86asmParser.ExpressionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void exitExpressionlist(x86asmParser.ExpressionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(x86asmParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(x86asmParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(x86asmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(x86asmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(x86asmParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(x86asmParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(x86asmParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(x86asmParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#ptr}.
	 * @param ctx the parse tree
	 */
	void enterPtr(x86asmParser.PtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#ptr}.
	 * @param ctx the parse tree
	 */
	void exitPtr(x86asmParser.PtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#dollar}.
	 * @param ctx the parse tree
	 */
	void enterDollar(x86asmParser.DollarContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#dollar}.
	 * @param ctx the parse tree
	 */
	void exitDollar(x86asmParser.DollarContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#register_}.
	 * @param ctx the parse tree
	 */
	void enterRegister_(x86asmParser.Register_Context ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#register_}.
	 * @param ctx the parse tree
	 */
	void exitRegister_(x86asmParser.Register_Context ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#string_}.
	 * @param ctx the parse tree
	 */
	void enterString_(x86asmParser.String_Context ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#string_}.
	 * @param ctx the parse tree
	 */
	void exitString_(x86asmParser.String_Context ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(x86asmParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(x86asmParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(x86asmParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(x86asmParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#opcode}.
	 * @param ctx the parse tree
	 */
	void enterOpcode(x86asmParser.OpcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#opcode}.
	 * @param ctx the parse tree
	 */
	void exitOpcode(x86asmParser.OpcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#rep}.
	 * @param ctx the parse tree
	 */
	void enterRep(x86asmParser.RepContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#rep}.
	 * @param ctx the parse tree
	 */
	void exitRep(x86asmParser.RepContext ctx);
	/**
	 * Enter a parse tree produced by {@link x86asmParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(x86asmParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link x86asmParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(x86asmParser.SignContext ctx);
}