package usercomputeengineapi;

public interface UserEngine {

	SourceResponse receiveSource(SourceRequest sourceRequest);

	CharResponse receiveChars(CharRequest charRequest);

	DestinationResponse receiveDestination(DestinationRequest destinationRequest);

	DelimiterResponse receiveDelimiterChoice(DelimiterRequest delimiterRequest);

	DelimiterResponse defaultDelimiterChars(DelimiterCharsRequest delimiterCharsRequest);
	
	DelimiterResponse delimiterChars(DelimeterRequest delimeterRequest);


	
}
