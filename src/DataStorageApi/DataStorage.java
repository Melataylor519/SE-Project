package DataStorageApi;

public interface DataStorage {
    DataReadRepsonse readData(DataReadRequest request);
    DataWriteResponse writeData(DataWriteRequest request);
}
