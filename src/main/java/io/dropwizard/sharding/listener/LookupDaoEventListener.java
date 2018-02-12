package io.dropwizard.sharding.listener;

public interface LookupDaoEventListener<T> {

    void handleSave(T entity);

    void handleGet(String id);

    void handleUpdate(String id);

}
