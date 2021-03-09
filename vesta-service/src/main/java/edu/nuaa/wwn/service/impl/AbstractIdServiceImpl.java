package edu.nuaa.wwn.service.impl;

import edu.nuaa.wwn.service.bean.Id;
import edu.nuaa.wwn.service.convert.IdConverter;
import edu.nuaa.wwn.service.intf.IdService;
import lombok.extern.java.Log;

import java.util.logging.Level;

/**
 * @author 57387
 * @title: AbstractIdServiceImpl
 * @projectName idGenerator
 * @date 2021/3/414:03
 */
@Log
public abstract class AbstractIdServiceImpl implements IdService {

    protected long machineId;

    protected long genMethod;

    protected long version;

    protected long type;

    protected IdConverter idConverter;

    public AbstractIdServiceImpl(long machineId, long genMethod, long version, long type) {
        this.machineId = machineId;
        this.genMethod = genMethod;
        this.version = version;
        this.type = type;
    }

    public long genId() {
        Id id = new Id();

        id.setGenMethod(machineId);
        id.setGenMethod(genMethod);
        id.setType(type);
        id.setVersion(version);

        populateId(id);

        long ret = idConverter.convert(id);

        if (log.isLoggable(Level.INFO))
            log.info(String.format("Id: %s => %d", id, ret));

        return ret;
    }

    public Id expId(long id) {
        return null;
    }

    protected abstract void populateId(Id id);
}
