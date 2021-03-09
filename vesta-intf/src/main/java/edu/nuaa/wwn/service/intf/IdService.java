package edu.nuaa.wwn.service.intf;

import edu.nuaa.wwn.service.bean.Id;

import java.util.Date;

/**
 * @author 57387
 * @title: IdService
 * @projectName idGenerator
 * @date 2021/3/413:46
 */
public interface IdService {

    public long genId();

    public Id expId(long id);

    public long makeId(long time, long seq);

    public long makeId(long time, long seq, long machine);

    public long makeId(long genMethod, long time, long seq, long machine);

    public long makeId(long type, long genMethod, long time,
                       long seq, long machine);

    public long makeId(long version, long type, long genMethod, long time,
                       long seq, long machine);

    public Date transTime(long time);
}
