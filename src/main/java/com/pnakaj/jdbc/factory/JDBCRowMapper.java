package com.pnakaj.jdbc.factory;

import java.sql.ResultSet;

/**
 * Created by pankaj on 2/24/2017.
 */
@FunctionalInterface
public interface JDBCRowMapper<T> {
    T mapToDb(ResultSet resultSet);
}
