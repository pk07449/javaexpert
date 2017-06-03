package com.pnakaj.jdbc.factory;

/**
 * Created by pankaj on 2/24/2017.
 */
public class JDBCTemplate {

/*
    private Triple<Triple<Connection, PreparedStatement,Optional<Tupple<ResultSet,JDBCRowMapper>>>> processRequest(Tupple<Connection, PreparedStatement> tupple) throws SQLException {
              tupple.getRight().executeUpdate();
              return new Tupple<>(tupple.left, tupple.right, Optional.empty());

    }

    private Triple<Triple<Connection, PreparedStatement,Optional<Tupple<ResultSet,JDBCRowMapper>>> processRequestd(Triple<Connection, PreparedStatement,Optional<Tupple<ResultSet,JDBCRowMapper>>) throws SQLException {
        ResultSet resultSet = tupple.getRight().executeQuery();
        return new Tupple<>(tupple.left, tupple.right,Optional.of(new Tupple<>(resultSet,mapper)));

    }


    private Tupple<Connection, PreparedStatement> initilalization(String sql) throws SQLException {
        Connection connection = JDBCConnectionFactory.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        return new Tupple<>(connection, preparedStatement);
    }


    private void destroy(Triple<Connection, PreparedStatement,Optional<Tupple<ResultSet,JDBCRowMapper>>> triple) throws SQLException {

        triple._3().ifPresent(resultSet -> {
            try {
                resultSet.right.mapToDb(resultSet.left);
                resultSet.left.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });
        triple._2().close();
        triple._1().close();
    }

    public void processForCreateUpdateAndDelete(String sql) throws SQLException {
        destroy(processRequest(initilalization(sql)));
    }

    public void processForReterive(String sql,JDBCRowMapper rowMapper) throws SQLException {
        destroy(processRequestForReterive(initilalization(sql),rowMapper));
    }

    public void save(String sqlQuery) throws SQLException {
        processForCreateUpdateAndDelete(sqlQuery);
    }

    class Tupple<L,R> {
        private L left;
        private R right;

        public Tupple(L l, R r){
            this.left = l;
            this.right = r;
        }

        public L getLeft() {
            return left;
        }

        public R getRight() {
            return right;
        }
    }
*/

}


