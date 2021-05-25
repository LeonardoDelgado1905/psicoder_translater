// Generated from R:/Documentos/Unal/7mo Semestre/TradIntrp/grammar\Psicoder.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PsicoderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PsicoderVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(PsicoderParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(PsicoderParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura(PsicoderParser.EstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#estruct_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstruct_body(PsicoderParser.Estruct_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(PsicoderParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(PsicoderParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#return_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_(PsicoderParser.Return_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(PsicoderParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(PsicoderParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(PsicoderParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(PsicoderParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(PsicoderParser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#else_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_(PsicoderParser.Else_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_(PsicoderParser.While_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#do_while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_(PsicoderParser.Do_while_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#for_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_(PsicoderParser.For_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#switch_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_(PsicoderParser.Switch_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(PsicoderParser.CasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#defect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefect(PsicoderParser.DefectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(PsicoderParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(PsicoderParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function(PsicoderParser.Call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#send_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSend_parameters(PsicoderParser.Send_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PsicoderParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(PsicoderParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(PsicoderParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(PsicoderParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#id_c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_c(PsicoderParser.Id_cContext ctx);
}