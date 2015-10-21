grammar Java2;

// plik z kodem
compilationUnit : 
	packageDeclaration? importDeclaration* typeDeclaration
	EOF
;

// nazwa paczki
packageDeclaration :   
	'package' qualifiedName ';'
;

// importowane rzeczy
importDeclaration :   
	'import' 'static'? qualifiedName ('.*')? ';'
;
    
// typ deklarowanej rzeczy: klasa, interfejs, enum
typeDeclaration
	: (ClassOrInterfaceModifier)* 'class' qualifiedName ('extends' qualifiedName)? ('implements' qualifiedName)* 
//	(ClassOrInterfaceModifier)* classTotal 
//        (   classTotal
//        |   interfaceDeclaration
//        |   enumDeclaration
//        )
//    |   ';'
;

classTotal : 
	classDeclaration classBody
;

classDeclaration :   
	 'class' qualifiedName ('extends' qualifiedName)? ('implements' qualifiedName)*
;

classBody : 
	'{' (field | method | Identifier)* '}'
; 

field :
	ClassOrInterfaceModifier* Identifier Identifier ('[' ']')* anychar ';'
;

//method:
//	ClassOrInterfaceModifier* Identifier Identifier 
//	'(' Identifier Identifier ('[' ']')* (Identifier Identifier ('[' ']')* ',')* ')'
//	 '{' (. | WS)* '}'
//;

method:
	ClassOrInterfaceModifier* Identifier ('[' ']')* Identifier ('[' ']')* '(' Identifier Identifier ('[' ']')* (Identifier Identifier ('[' ']')* ',')* ')' '{' (anychar | ';')* '}' 
; 

// nazwa klasy lub paczki
qualifiedName     :   
	Identifier ('.' Identifier)*
;

anychar:  
	Letter | Digit | Sign
  ;


ClassOrInterfaceModifier
    :   'public'     
    |   'protected' 
    |   'private'   
    |   'abstract'   
    |   'static'    
    |   'final'     
    ;


Identifier : Letter (Letter|Digit)* ;

Letter: [a-zA-Z];

Digit: [0-9];

Sign: ('=' | '"' | '(' | ')' | ',' | '[' | ']' | '<' | '>');

WS:   [ \r\t\u000C\n]+ -> skip ;

    