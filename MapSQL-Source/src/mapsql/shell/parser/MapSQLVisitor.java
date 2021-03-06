/* Generated By:JavaCC: Do not edit this line. MapSQLVisitor.java Version 5.0 */
package mapsql.shell.parser;

public interface MapSQLVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTStart node, Object data);
  public Object visit(ASTCreateTable node, Object data);
  public Object visit(ASTSelect node, Object data);
  public Object visit(ASTInsert node, Object data);
  public Object visit(ASTUpdate node, Object data);
  public Object visit(ASTDelete node, Object data);
  public Object visit(ASTDropTable node, Object data);
  public Object visit(ASTSource node, Object data);
  public Object visit(ASTQuit node, Object data);
  public Object visit(ASTAssignments node, Object data);
  public Object visit(ASTAssignment node, Object data);
  public Object visit(ASTField node, Object data);
  public Object visit(ASTColumns node, Object data);
  public Object visit(ASTValues node, Object data);
  public Object visit(ASTOrCondition node, Object data);
  public Object visit(ASTAndCondition node, Object data);
  public Object visit(ASTCondition node, Object data);
  public Object visit(ASTWildcard node, Object data);
  public Object visit(ASTModifier node, Object data);
  public Object visit(ASTIdentifier node, Object data);
  public Object visit(ASTChar node, Object data);
  public Object visit(ASTInt node, Object data);
  public Object visit(ASTString node, Object data);
  public Object visit(ASTNumber node, Object data);
  public Object visit(ASTUnsignedNumber node, Object data);
}
/* JavaCC - OriginalChecksum=4e45b80fe0c2d12251319851c0f53898 (do not edit this line) */
