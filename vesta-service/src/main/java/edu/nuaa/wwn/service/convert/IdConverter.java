package edu.nuaa.wwn.service.convert;

import edu.nuaa.wwn.service.bean.Id;

/**
 * @author 57387
 * @title: IdConvert
 * @projectName idGenerator
 * @date 2021/3/414:16
 */
public interface IdConverter {

    public long convert(Id id);

    public Id convert(long id);

}
