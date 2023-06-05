package by.bsu.chainofresponsibility.handler;
import by.bsu.chainofresponsibility.BankAccount;

public abstract class AbstractHandler {

	protected AbstractHandler successor = DefaultHandleRequest.getHandleRequest();

	public AbstractHandler(AbstractHandler sucessor) {
		this.successor = sucessor;
	}
	public AbstractHandler() {
	}
	public void setNextSuccessor(AbstractHandler successor) {
		this.successor = successor;
	}
	abstract public void handleRequest(BankAccount account);
	public void chain(BankAccount account) {// не переопределяется в подклассах
			// account verification
            handleRequest(account);
			successor.chain(account);
	}
	private static class DefaultHandleRequest extends AbstractHandler {
		private static DefaultHandleRequest handler = new DefaultHandleRequest();
		private DefaultHandleRequest() {
		}
        public static DefaultHandleRequest getHandleRequest() {
			return handler;
		}
		@Override
		public void chain(BankAccount account) {
            handleRequest(account);// if necessary
		}
		@Override
		public void handleRequest(BankAccount account) {
			// default handler - if exists
		}
	}
}
