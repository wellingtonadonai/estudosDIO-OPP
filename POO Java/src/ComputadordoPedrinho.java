
public class ComputadordoPedrinho {
	
		public static void main(String[] args) {
			
			//abrindo MSN Messenger
			System.out.println("Mensseger");
			
			MSNmensseger msn = new MSNmensseger();
			msn.enviarMensagem();
			msn.receberMensagem();
			
			System.out.println("Facebook");
			
			Facebook fcb = new Facebook();
			fcb.enviarMensagem();
			fcb.receberMensagem();
			
			System.out.println("Telegram");
			
			Telegram tlg = new Telegram();
			tlg.enviarMensagem();
			tlg.receberMensagem();
		}
}
