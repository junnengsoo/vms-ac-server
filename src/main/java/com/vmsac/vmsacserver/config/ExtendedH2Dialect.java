package com.vmsac.vmsacserver.config;

import org.hibernate.dialect.H2Dialect;
import java.sql.Types;

public class ExtendedH2Dialect extends H2Dialect {
    public ExtendedH2Dialect() {
        super();
        registerColumnType(Types.ARRAY, "array");
    }
}
