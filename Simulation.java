package transport;

public class Simulation {
	
	public void runSimulation() {
		Hub hub = new Hub();
		
		for (int i=0;i < 1000;i++){
			Receiver receiver = new Receiver();
			Shipper shipper = new Shipper();
			Order order = new Order();
			receiver.sendOrderToShipper(order, shipper);
			shipper.sendOrderToHub(order,hub);
			hub.sendOrderToReceiver(order,receiver);
		
	}
	
}}
