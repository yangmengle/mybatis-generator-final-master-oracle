package org.mybatis.generator.internal.types;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;

import java.sql.Types;

public class MyJavaTypeResolverDefaultImpl extends JavaTypeResolverDefaultImpl {
    public MyJavaTypeResolverDefaultImpl() {
        super();
        //把数据库的 NVARCHAR2 映射成 String
        super.typeMap.put(Types.OTHER, new JdbcTypeInformation("NVARCHAR2", new FullyQualifiedJavaType(String.class.getName())));
    }
}
