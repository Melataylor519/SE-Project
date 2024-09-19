package usercomputeengineapi;

public class UserComputeEngineApiPrototype {
	
	public void prototype(UserEngine userEngine) {
		//receive source
		SourceResponse sourceResponse = userEngine.receiveSource(new SourceRequest());
		
		//receive  characters
		CharResponse charResponse = userEngine.receiveChars(new CharRequest());
		
		//delimiter characters
		DelimiterResponse delimiterResponse = userEngine.receiveDelimiterChoice(new DelimiterRequest());
		if(delimiterResponse.choiceStatus().delimiterChoice()) {
			delimiterResponse = userEngine.delimiterChars(new DelimiterCharsRequest());
		} else {
			delimiterResponse = userEngine.defaultDelimiterChars(new DelimiterCharsRequest());
		}

		
		//receive destination
		DestinationResponse destinationResponse = userEngine.receiveDestination(new DestinationRequest());
	}
}
