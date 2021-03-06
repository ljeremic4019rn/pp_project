
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Sun Jan 09 12:52:06 CET 2022
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;

/** CUP v0.10k generated parser.
  * @version Sun Jan 09 12:52:06 CET 2022
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\055\000\002\003\006\000\002\002\004\000\002\004" +
    "\006\000\002\005\004\000\002\005\003\000\002\006\005" +
    "\000\002\010\005\000\002\010\003\000\002\011\004\000" +
    "\002\012\004\000\002\012\002\000\002\013\005\000\002" +
    "\007\003\000\002\007\003\000\002\007\003\000\002\015" +
    "\004\000\002\015\003\000\002\014\003\000\002\014\006" +
    "\000\002\014\007\000\002\014\007\000\002\014\003\000" +
    "\002\016\007\000\002\023\005\000\002\023\003\000\002" +
    "\024\005\000\002\020\005\000\002\020\003\000\002\025" +
    "\003\000\002\025\003\000\002\026\005\000\002\026\003" +
    "\000\002\027\003\000\002\027\003\000\002\030\003\000" +
    "\002\030\003\000\002\030\005\000\002\017\004\000\002" +
    "\031\004\000\002\031\002\000\002\032\005\000\002\021" +
    "\005\000\002\021\003\000\002\022\005\000\002\022\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\124\000\004\004\005\001\002\000\004\002\126\001" +
    "\002\000\004\027\006\001\002\000\004\030\007\001\002" +
    "\000\004\033\010\001\002\000\010\005\012\006\016\007" +
    "\017\001\002\000\004\002\001\001\002\000\004\021\ufff5" +
    "\001\002\000\022\005\012\006\016\007\017\010\033\011" +
    "\042\016\044\021\041\033\010\001\002\000\004\021\021" +
    "\001\002\000\022\005\ufffd\006\ufffd\007\ufffd\010\ufffd\011" +
    "\ufffd\016\ufffd\021\ufffd\033\ufffd\001\002\000\004\021\ufff4" +
    "\001\002\000\004\021\ufff3\001\002\000\006\023\ufffa\025" +
    "\ufffa\001\002\000\010\023\ufff7\025\ufff7\031\ufff7\001\002" +
    "\000\006\023\024\025\023\001\002\000\004\021\021\001" +
    "\002\000\022\005\ufffc\006\ufffc\007\ufffc\010\ufffc\011\ufffc" +
    "\016\ufffc\021\ufffc\033\ufffc\001\002\000\006\023\ufffb\025" +
    "\ufffb\001\002\000\010\023\ufff9\025\ufff9\031\030\001\002" +
    "\000\010\023\ufff8\025\ufff8\031\ufff8\001\002\000\004\022" +
    "\031\001\002\000\004\032\032\001\002\000\010\023\ufff6" +
    "\025\ufff6\031\ufff6\001\002\000\004\027\117\001\002\000" +
    "\004\026\114\001\002\000\022\010\uffec\011\uffec\016\uffec" +
    "\020\uffec\021\uffec\023\uffec\033\uffec\034\uffec\001\002\000" +
    "\016\010\033\011\042\016\044\021\041\033\010\034\113" +
    "\001\002\000\022\005\ufffe\006\ufffe\007\ufffe\010\ufffe\011" +
    "\ufffe\016\ufffe\021\ufffe\033\ufffe\001\002\000\016\010\ufff1" +
    "\011\ufff1\016\ufff1\021\ufff1\033\ufff1\034\ufff1\001\002\000" +
    "\030\012\uffda\013\uffda\014\uffda\015\uffda\017\uffda\023\uffda" +
    "\025\uffda\026\uffda\030\uffda\031\uffda\032\uffda\001\002\000" +
    "\004\027\076\001\002\000\022\010\ufff0\011\ufff0\016\ufff0" +
    "\020\ufff0\021\ufff0\023\ufff0\033\ufff0\034\ufff0\001\002\000" +
    "\010\021\041\022\045\027\052\001\002\000\024\012\uffde" +
    "\013\uffde\014\uffde\015\uffde\017\uffde\023\uffde\025\uffde\030" +
    "\uffde\032\uffde\001\002\000\024\012\uffe6\013\uffe6\014\061" +
    "\015\063\017\uffe6\023\uffe6\025\uffe6\030\uffe6\032\uffe6\001" +
    "\002\000\024\012\uffe2\013\uffe2\014\uffe2\015\uffe2\017\uffe2" +
    "\023\uffe2\025\uffe2\030\uffe2\032\uffe2\001\002\000\024\012" +
    "\uffdf\013\uffdf\014\uffdf\015\uffdf\017\uffdf\023\uffdf\025\uffdf" +
    "\030\uffdf\032\uffdf\001\002\000\010\012\057\013\055\017" +
    "\065\001\002\000\010\021\041\022\045\027\052\001\002" +
    "\000\010\012\057\013\055\030\054\001\002\000\024\012" +
    "\uffdd\013\uffdd\014\uffdd\015\uffdd\017\uffdd\023\uffdd\025\uffdd" +
    "\030\uffdd\032\uffdd\001\002\000\010\021\uffe4\022\uffe4\027" +
    "\uffe4\001\002\000\010\021\041\022\045\027\052\001\002" +
    "\000\010\021\uffe5\022\uffe5\027\uffe5\001\002\000\024\012" +
    "\uffe7\013\uffe7\014\061\015\063\017\uffe7\023\uffe7\025\uffe7" +
    "\030\uffe7\032\uffe7\001\002\000\010\021\uffe1\022\uffe1\027" +
    "\uffe1\001\002\000\010\021\041\022\045\027\052\001\002" +
    "\000\010\021\uffe0\022\uffe0\027\uffe0\001\002\000\024\012" +
    "\uffe3\013\uffe3\014\uffe3\015\uffe3\017\uffe3\023\uffe3\025\uffe3" +
    "\030\uffe3\032\uffe3\001\002\000\004\022\066\001\002\000" +
    "\004\024\074\001\002\000\006\020\072\023\071\001\002" +
    "\000\006\020\uffe9\023\uffe9\001\002\000\004\022\066\001" +
    "\002\000\022\010\uffeb\011\uffeb\016\uffeb\020\uffeb\021\uffeb" +
    "\023\uffeb\033\uffeb\034\uffeb\001\002\000\006\020\uffea\023" +
    "\uffea\001\002\000\014\010\033\011\042\016\044\021\041" +
    "\033\010\001\002\000\006\020\uffe8\023\uffe8\001\002\000" +
    "\010\021\041\022\045\027\052\001\002\000\012\012\057" +
    "\013\055\025\uffd5\030\uffd5\001\002\000\006\025\101\030" +
    "\102\001\002\000\010\021\041\022\045\027\052\001\002" +
    "\000\004\023\103\001\002\000\022\010\uffed\011\uffed\016" +
    "\uffed\020\uffed\021\uffed\023\uffed\033\uffed\034\uffed\001\002" +
    "\000\012\012\057\013\055\025\uffd6\030\uffd6\001\002\000" +
    "\030\012\uffdc\013\uffdc\014\uffdc\015\uffdc\017\uffdc\023\uffdc" +
    "\025\uffdc\026\uffdc\030\uffdc\031\107\032\uffdc\001\002\000" +
    "\030\012\uffdb\013\uffdb\014\uffdb\015\uffdb\017\uffdb\023\uffdb" +
    "\025\uffdb\026\uffdb\030\uffdb\031\uffdb\032\uffdb\001\002\000" +
    "\010\021\041\022\045\027\052\001\002\000\010\012\057" +
    "\013\055\032\111\001\002\000\030\012\uffd9\013\uffd9\014" +
    "\uffd9\015\uffd9\017\uffd9\023\uffd9\025\uffd9\026\uffd9\030\uffd9" +
    "\031\uffd9\032\uffd9\001\002\000\016\010\ufff2\011\ufff2\016" +
    "\ufff2\021\ufff2\033\ufff2\034\ufff2\001\002\000\024\002\uffff" +
    "\010\uffff\011\uffff\016\uffff\020\uffff\021\uffff\023\uffff\033" +
    "\uffff\034\uffff\001\002\000\010\021\041\022\045\027\052" +
    "\001\002\000\010\012\057\013\055\023\116\001\002\000" +
    "\022\010\uffef\011\uffef\016\uffef\020\uffef\021\uffef\023\uffef" +
    "\033\uffef\034\uffef\001\002\000\004\021\041\001\002\000" +
    "\006\025\uffd7\030\uffd7\001\002\000\006\025\122\030\123" +
    "\001\002\000\004\021\041\001\002\000\004\023\124\001" +
    "\002\000\022\010\uffee\011\uffee\016\uffee\020\uffee\021\uffee" +
    "\023\uffee\033\uffee\034\uffee\001\002\000\006\025\uffd8\030" +
    "\uffd8\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\124\000\004\003\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\010\001\001" +
    "\000\010\005\012\006\014\007\013\001\001\000\002\001" +
    "\001\000\002\001\001\000\020\004\034\006\036\007\013" +
    "\014\037\015\035\016\042\017\033\001\001\000\006\010" +
    "\021\011\017\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\012\025\001" +
    "\001\000\002\001\001\000\004\011\024\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\013\026\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\012\004\034\014\111\016\042\017\033\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\031\104\001" +
    "\001\000\002\001\001\000\002\001\001\000\012\017\047" +
    "\020\050\026\045\030\046\001\001\000\002\001\001\000" +
    "\004\027\061\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\025\055\001\001\000\012\017\047\020\052\026" +
    "\045\030\046\001\001\000\004\025\055\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\017\047\026\057\030" +
    "\046\001\001\000\002\001\001\000\004\027\061\001\001" +
    "\000\002\001\001\000\006\017\047\030\063\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\023\066\024\067" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\024\072\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\004\034\014\074\016\042\017\033\001" +
    "\001\000\002\001\001\000\014\017\047\020\076\022\077" +
    "\026\045\030\046\001\001\000\004\025\055\001\001\000" +
    "\002\001\001\000\012\017\047\020\103\026\045\030\046" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\025" +
    "\055\001\001\000\004\032\105\001\001\000\002\001\001" +
    "\000\012\017\047\020\107\026\045\030\046\001\001\000" +
    "\004\025\055\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\012\017\047\020\114\026\045\030" +
    "\046\001\001\000\004\025\055\001\001\000\002\001\001" +
    "\000\006\017\117\021\120\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\017\124\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



   
   public static void main( String[] args ) {
      try {
		   FileReader file = new FileReader( args[0] );
		   Scanner scanner = new Lexer( file );
		   Parser parser = new Parser( scanner );
		   parser.debug_parse();
	  }
	  catch( Exception e ) {
		   System.out.println(e);
	  }
   }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // ExpressionList ::= Expression 
            {
              Object RESULT = null;
		
              System.out.println( "Smena 44." );
           
              CUP$Parser$result = new java_cup.runtime.Symbol(16/*ExpressionList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // ExpressionList ::= ExpressionList COMMA Expression 
            {
              Object RESULT = null;
		
              System.out.println( "Smena 43." );
           
              CUP$Parser$result = new java_cup.runtime.Symbol(16/*ExpressionList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // VarList ::= Variable 
            {
              Object RESULT = null;
		
             System.out.println( "Smena 42." );
          
              CUP$Parser$result = new java_cup.runtime.Symbol(15/*VarList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // VarList ::= VarList COMMA Variable 
            {
              Object RESULT = null;
		
             System.out.println( "Smena 41." );
          
              CUP$Parser$result = new java_cup.runtime.Symbol(15/*VarList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // Index ::= LEFTBOX Expression RIGHTBOX 
            {
              Object RESULT = null;
		
             System.out.println( "Smena 40." );
          
              CUP$Parser$result = new java_cup.runtime.Symbol(24/*Index*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // IndexList ::= 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 39." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(23/*IndexList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // IndexList ::= IndexList Index 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 38." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(23/*IndexList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // Variable ::= ID IndexList 
            {
              Object RESULT = null;
		
            System.out.println( "Smena 37." );
         
              CUP$Parser$result = new java_cup.runtime.Symbol(13/*Variable*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // Factor ::= LEFTPAR Expression RIGHTPAR 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 36." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(22/*Factor*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // Factor ::= CONST 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 35." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(22/*Factor*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // Factor ::= Variable 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 34." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(22/*Factor*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // MulOperator ::= DIV 
            {
              Object RESULT = null;
		
			System.out.println("Smena 33");
		
              CUP$Parser$result = new java_cup.runtime.Symbol(21/*MulOperator*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // MulOperator ::= MUL 
            {
              Object RESULT = null;
		
			System.out.println("Smena 32");
		
              CUP$Parser$result = new java_cup.runtime.Symbol(21/*MulOperator*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // Term ::= Factor 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 31." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(20/*Term*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // Term ::= Term MulOperator Factor 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 30." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(20/*Term*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // AddOperator ::= SUB 
            {
              Object RESULT = null;
		
            System.out.println("Smena 29");
        
              CUP$Parser$result = new java_cup.runtime.Symbol(19/*AddOperator*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // AddOperator ::= PLUS 
            {
              Object RESULT = null;
		
            System.out.println("Smena 28");
        
              CUP$Parser$result = new java_cup.runtime.Symbol(19/*AddOperator*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // Expression ::= Term 
            {
              Object RESULT = null;
		
			System.out.println("Smena 27");
		
              CUP$Parser$result = new java_cup.runtime.Symbol(14/*Expression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // Expression ::= Expression AddOperator Term 
            {
              Object RESULT = null;
		
			System.out.println("Smena 26");
		
              CUP$Parser$result = new java_cup.runtime.Symbol(14/*Expression*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // Alternative ::= CONST DOTDOT Statement 
            {
              Object RESULT = null;
		
			System.out.println("Smena 25");
		
              CUP$Parser$result = new java_cup.runtime.Symbol(18/*Alternative*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // AlternativeList ::= Alternative 
            {
              Object RESULT = null;
		
			System.out.println("Smena 24");
		
              CUP$Parser$result = new java_cup.runtime.Symbol(17/*AlternativeList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // AlternativeList ::= AlternativeList SEMI Alternative 
            {
              Object RESULT = null;
		
			System.out.println("Smena 23");
		
              CUP$Parser$result = new java_cup.runtime.Symbol(17/*AlternativeList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // CaseStatement ::= CASE Expression OF AlternativeList END 
            {
              Object RESULT = null;
		
			System.out.println("Smena 22");
		
              CUP$Parser$result = new java_cup.runtime.Symbol(12/*CaseStatement*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Statement ::= Block 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 21." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(10/*Statement*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Statement ::= WRITE LEFTPAR ExpressionList RIGHTPAR SEMI 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 20." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(10/*Statement*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Statement ::= READ LEFTPAR VarList RIGHTPAR SEMI 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 19." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(10/*Statement*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Statement ::= Variable ASSIGN Expression SEMI 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 18." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(10/*Statement*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Statement ::= CaseStatement 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 17." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(10/*Statement*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // StatementList ::= Statement 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 16." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(11/*StatementList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // StatementList ::= StatementList Statement 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 15." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(11/*StatementList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Type ::= CHAR 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 14." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(5/*Type*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Type ::= REAL 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 13." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(5/*Type*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Type ::= INTEGER 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 12." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(5/*Type*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Dimenssion ::= LEFTBOX CONST RIGHTBOX 
            {
              Object RESULT = null;
		
           System.out.println( "Smena 11." );
        
              CUP$Parser$result = new java_cup.runtime.Symbol(9/*Dimenssion*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // DimList ::= 
            {
              Object RESULT = null;
		
              System.out.println( "Smena 10." );
           
              CUP$Parser$result = new java_cup.runtime.Symbol(8/*DimList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DimList ::= DimList Dimenssion 
            {
              Object RESULT = null;
		
              System.out.println( "Smena 9." );
           
              CUP$Parser$result = new java_cup.runtime.Symbol(8/*DimList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Name ::= ID DimList 
            {
              Object RESULT = null;
		
           System.out.println( "Smena 8." );
        
              CUP$Parser$result = new java_cup.runtime.Symbol(7/*Name*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NameList ::= Name 
            {
              Object RESULT = null;
		
                System.out.println( "Smena 7." );
             
              CUP$Parser$result = new java_cup.runtime.Symbol(6/*NameList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // NameList ::= NameList COMMA Name 
            {
              Object RESULT = null;
		
                System.out.println( "Smena 6." );
             
              CUP$Parser$result = new java_cup.runtime.Symbol(6/*NameList*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // VarDecl ::= Type NameList SEMI 
            {
              Object RESULT = null;
		
                   System.out.println( "Smena 5." );
                
              CUP$Parser$result = new java_cup.runtime.Symbol(4/*VarDecl*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // VarSection ::= VarDecl 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 4." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(3/*VarSection*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // VarSection ::= VarSection VarDecl 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 3." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(3/*VarSection*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Block ::= LEFTBRACE VarSection StatementList RIGHTBRACE 
            {
              Object RESULT = null;
		
                System.out.println( "Smena 2." );
             
              CUP$Parser$result = new java_cup.runtime.Symbol(2/*Block*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Program EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Program ::= MAIN LEFTPAR RIGHTPAR Block 
            {
              Object RESULT = null;
		
               System.out.println( "Smena 1." );
            
              CUP$Parser$result = new java_cup.runtime.Symbol(1/*Program*/, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-0)).right, RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

