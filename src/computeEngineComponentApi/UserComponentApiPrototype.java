package computeEngineComponentApi;

public class UserComponentApiPrototype {
	public void prototype(UserComponent userComponent) {
	//initialize
	InitializationResponse initializeResponse = userComponent.initialize(new InitializeRequest());
	
	//read
	ReadResponse readResponse = userComponent.read(new ReadRequest());
	
	//write
	WriteResponse writeResponse = userComponent.write(new WriteRequest());
	
	//compute
	ComputationResponse computeResponse = userComponent.compute(new ComputeRequest());
			
	}
}
