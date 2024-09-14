package data_storage_api;

public interface DataStorage {
    DataReadRepsonse readData(DataReadRequest request);
    DataWriteResponse writeData(DataWriteRequest request);
}
