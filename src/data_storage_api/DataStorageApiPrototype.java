package data_storage_api;

public class DataStorageApiPrototype {
    public void prototype(DataStorage dataStorage) {
        //read data
        DataReadRepsonse readResponse = dataStorage.readData(new DataReadRequest());

        //write data
        DataWriteResponse writeResponse = dataStorage.writeData(new DataWriteRequest());
    }

}
