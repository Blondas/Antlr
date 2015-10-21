// Generated from Java2.g4 by ANTLR 4.4
package pl.edu.agh.java.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Java2Parser}.
 */
public interface Java2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Java2Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull Java2Parser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull Java2Parser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(@NotNull Java2Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(@NotNull Java2Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull Java2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull Java2Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(@NotNull Java2Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(@NotNull Java2Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#interfaceGenericMethodDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceGenericMethodDecl(@NotNull Java2Parser.InterfaceGenericMethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#interfaceGenericMethodDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceGenericMethodDecl(@NotNull Java2Parser.InterfaceGenericMethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull Java2Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull Java2Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull Java2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull Java2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifiers(@NotNull Java2Parser.VariableModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifiers(@NotNull Java2Parser.VariableModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(@NotNull Java2Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(@NotNull Java2Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull Java2Parser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull Java2Parser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(@NotNull Java2Parser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(@NotNull Java2Parser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#constantDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaratorRest(@NotNull Java2Parser.ConstantDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#constantDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaratorRest(@NotNull Java2Parser.ConstantDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#interfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaratorRest(@NotNull Java2Parser.InterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#interfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaratorRest(@NotNull Java2Parser.InterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(@NotNull Java2Parser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(@NotNull Java2Parser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(@NotNull Java2Parser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(@NotNull Java2Parser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull Java2Parser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull Java2Parser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(@NotNull Java2Parser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(@NotNull Java2Parser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(@NotNull Java2Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(@NotNull Java2Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(@NotNull Java2Parser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(@NotNull Java2Parser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull Java2Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull Java2Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull Java2Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull Java2Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(@NotNull Java2Parser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(@NotNull Java2Parser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(@NotNull Java2Parser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(@NotNull Java2Parser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull Java2Parser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull Java2Parser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(@NotNull Java2Parser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(@NotNull Java2Parser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull Java2Parser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull Java2Parser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDeclsRest(@NotNull Java2Parser.FormalParameterDeclsRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDeclsRest(@NotNull Java2Parser.FormalParameterDeclsRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull Java2Parser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull Java2Parser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(@NotNull Java2Parser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(@NotNull Java2Parser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull Java2Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull Java2Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(@NotNull Java2Parser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(@NotNull Java2Parser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(@NotNull Java2Parser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(@NotNull Java2Parser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull Java2Parser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull Java2Parser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull Java2Parser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull Java2Parser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(@NotNull Java2Parser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(@NotNull Java2Parser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(@NotNull Java2Parser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(@NotNull Java2Parser.MemberContext ctx);
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
	 * Enter a parse tree produced by {@link Java2Parser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(@NotNull Java2Parser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(@NotNull Java2Parser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull Java2Parser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull Java2Parser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull Java2Parser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull Java2Parser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull Java2Parser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull Java2Parser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull Java2Parser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull Java2Parser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull Java2Parser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull Java2Parser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(@NotNull Java2Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(@NotNull Java2Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(@NotNull Java2Parser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(@NotNull Java2Parser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(@NotNull Java2Parser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(@NotNull Java2Parser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#formalParameterDecls}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDecls(@NotNull Java2Parser.FormalParameterDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#formalParameterDecls}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDecls(@NotNull Java2Parser.FormalParameterDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull Java2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull Java2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull Java2Parser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull Java2Parser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(@NotNull Java2Parser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(@NotNull Java2Parser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#voidInterfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterVoidInterfaceMethodDeclaratorRest(@NotNull Java2Parser.VoidInterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#voidInterfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitVoidInterfaceMethodDeclaratorRest(@NotNull Java2Parser.VoidInterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull Java2Parser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull Java2Parser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull Java2Parser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull Java2Parser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(@NotNull Java2Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(@NotNull Java2Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull Java2Parser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull Java2Parser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull Java2Parser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull Java2Parser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(@NotNull Java2Parser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(@NotNull Java2Parser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(@NotNull Java2Parser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(@NotNull Java2Parser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull Java2Parser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull Java2Parser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(@NotNull Java2Parser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(@NotNull Java2Parser.AnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(@NotNull Java2Parser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(@NotNull Java2Parser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(@NotNull Java2Parser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(@NotNull Java2Parser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(@NotNull Java2Parser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(@NotNull Java2Parser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#methodDeclarationRest}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarationRest(@NotNull Java2Parser.MethodDeclarationRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#methodDeclarationRest}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarationRest(@NotNull Java2Parser.MethodDeclarationRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(@NotNull Java2Parser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(@NotNull Java2Parser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull Java2Parser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull Java2Parser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(@NotNull Java2Parser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(@NotNull Java2Parser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull Java2Parser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull Java2Parser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#interfaceMethodOrFieldRest}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodOrFieldRest(@NotNull Java2Parser.InterfaceMethodOrFieldRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#interfaceMethodOrFieldRest}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodOrFieldRest(@NotNull Java2Parser.InterfaceMethodOrFieldRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#constantDeclaratorsRest}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaratorsRest(@NotNull Java2Parser.ConstantDeclaratorsRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#constantDeclaratorsRest}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaratorsRest(@NotNull Java2Parser.ConstantDeclaratorsRestContext ctx);
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
	 * Enter a parse tree produced by {@link Java2Parser#interfaceMethodOrFieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodOrFieldDecl(@NotNull Java2Parser.InterfaceMethodOrFieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#interfaceMethodOrFieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodOrFieldDecl(@NotNull Java2Parser.InterfaceMethodOrFieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(@NotNull Java2Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(@NotNull Java2Parser.AnnotationTypeDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link Java2Parser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(@NotNull Java2Parser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(@NotNull Java2Parser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull Java2Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull Java2Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull Java2Parser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull Java2Parser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(@NotNull Java2Parser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(@NotNull Java2Parser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull Java2Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull Java2Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull Java2Parser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull Java2Parser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(@NotNull Java2Parser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(@NotNull Java2Parser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#voidMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterVoidMethodDeclaratorRest(@NotNull Java2Parser.VoidMethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#voidMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitVoidMethodDeclaratorRest(@NotNull Java2Parser.VoidMethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(@NotNull Java2Parser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(@NotNull Java2Parser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(@NotNull Java2Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(@NotNull Java2Parser.ExplicitConstructorInvocationContext ctx);
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
	 * Enter a parse tree produced by {@link Java2Parser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(@NotNull Java2Parser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(@NotNull Java2Parser.ModifiersContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link Java2Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(@NotNull Java2Parser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(@NotNull Java2Parser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull Java2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull Java2Parser.StatementContext ctx);
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
	 * Enter a parse tree produced by {@link Java2Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull Java2Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull Java2Parser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(@NotNull Java2Parser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(@NotNull Java2Parser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull Java2Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull Java2Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull Java2Parser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull Java2Parser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(@NotNull Java2Parser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(@NotNull Java2Parser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull Java2Parser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull Java2Parser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(@NotNull Java2Parser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(@NotNull Java2Parser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull Java2Parser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull Java2Parser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#interfaceMemberDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDecl(@NotNull Java2Parser.InterfaceMemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#interfaceMemberDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDecl(@NotNull Java2Parser.InterfaceMemberDeclContext ctx);
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
	 * Enter a parse tree produced by {@link Java2Parser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(@NotNull Java2Parser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(@NotNull Java2Parser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull Java2Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull Java2Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(@NotNull Java2Parser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(@NotNull Java2Parser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(@NotNull Java2Parser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(@NotNull Java2Parser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull Java2Parser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull Java2Parser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull Java2Parser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull Java2Parser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull Java2Parser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull Java2Parser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull Java2Parser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull Java2Parser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java2Parser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(@NotNull Java2Parser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java2Parser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(@NotNull Java2Parser.GenericMethodDeclarationContext ctx);
}