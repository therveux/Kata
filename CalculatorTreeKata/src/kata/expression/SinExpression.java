package kata.expression;

import kata.interfaces.ASTVisitor;

public class SinExpression extends UnaryExpression {

	public SinExpression(Expression expression) {
		super(expression);
	}

	@Override
	public Double evaluate() {
		return Math.sin(_expression.evaluate());
	}

	@Override
	public String toRPN() {
		String rhs = _expression.toRPN();
		return rhs + " " + "sin";
	}

	@Override
	public void accept(ASTVisitor v) {
		// TODO Auto-generated method stub
		_expression.accept(v);
		v.visit(this);
	}
}
