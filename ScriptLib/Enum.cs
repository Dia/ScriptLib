namespace ScriptLib
{
    public enum OP
    {
        OP_END,
        OP_EQUAL,
        OP_NOTEQUAL,
        OP_LARGE,
        OP_SMALL,
        OP_AND,
        OP_OR,
        OP_ADD,
        OP_SUB,
        OP_MUL,
        OP_DIV,
        OP_MOD,
        OP_LARGE_OR_EQUAL,
        OP_SMALL_OR_EQUAL,
    };

    public enum CMD
    {
        CMD_END,
        CMD_VAR,
        CMD_IF,
        CMD_ELSEIF,
        CMD_ELSE,
        CMD_ENDIF,
        CMD_DECLARE,
        CMD_DEFINE,
        CMD_SWITCH,
        CMD_CASE,
        CMD_BREAK,
        CMD_DEFAULT,
        CMD_ENDSWITCH,
        CMD_DEFCMD,
        CMD_BLOCKBREAK,
        CMD_WHILE,
        CMD_ENDWHILE,
        CMD_EXITWHILE,
    };

    public enum CODE
    {
        CODE_END,       // end		

        CODE_MOV,       // mov var var/data
        CODE_ADD,       // add var var/data
        CODE_SUB,       // sub var var/data
        CODE_MUL,       // mul var var/data
        CODE_DIV,       // div var var/data

        CODE_MOD,       // mod var var/data
        CODE_INC,       // inc var 
        CODE_DEC,       // dec var 
        CODE_CMP,       // cmp var notgotoblock
        CODE_GOTO,      // goto block

        CODE_FUNC,
        CODE_CASE,
        CODE_PUSH,
        CODE_POP,
    };

    public enum TOKENTYPE
    {
        TOKENTYPE_NONE,
        TOKENTYPE_COMMAND,
        TOKENTYPE_FUNC,
        TOKENTYPE_VAR,
        TOKENTYPE_DEFINE,
    };
}
