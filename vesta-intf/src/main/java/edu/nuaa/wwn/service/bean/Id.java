package edu.nuaa.wwn.service.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

import java.io.Serializable;

/**
 * @author 57387
 * @title: Id
 * @projectName idGenerator
 * @date 2021/3/413:45
 */

@Data
@Log
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Id implements Serializable {

    private static final long serialVersionUID = 3834537890966538990L;

    private long type;

    private long machine;

    private long time;

    private long seq;

    private long genMethod;

    private long version;
}
