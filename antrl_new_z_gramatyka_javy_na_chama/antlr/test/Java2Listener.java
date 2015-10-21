// Generated from Java2.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Java2Parser}.
 */
public interface Java2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Java2Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull Java2Parser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull Java2Parser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull Java2Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull Java2Parser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(@NotNull Java2Parser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(@NotNull Java2Parser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(@NotNull Java2Parser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(@NotNull Java2Parser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull Java2Parser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull Java2Parser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#classTotal}.
	 * @param ctx the parse tree
	 */
	void enterClassTotal(@NotNull Java2Parser.ClassTotalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#classTotal}.
	 * @param ctx the parse tree
	 */
	void exitClassTotal(@NotNull Java2Parser.ClassTotalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull Java2Parser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull Java2Parser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull Java2Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull Java2Parser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#anychar}.
	 * @param ctx the parse tree
	 */
	void enterAnychar(@NotNull Java2Parser.AnycharContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#anychar}.
	 * @param ctx the parse tree
	 */
	void exitAnychar(@NotNull Java2Parser.AnycharContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull Java2Parser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull Java2Parser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull Java2Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull Java2Parser.ClassDeclarationContext ctx);
}