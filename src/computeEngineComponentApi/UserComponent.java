package computeEngineComponentApi;

public interface UserComponent {

	InitializationResponse initialize(InitializeRequest initilizeRequest);

	ReadResponse read(ReadRequest readRequest);

	WriteResponse write(WriteRequest writeRequest);

	ComputationResponse compute(ComputeRequest computeRequest);

}
