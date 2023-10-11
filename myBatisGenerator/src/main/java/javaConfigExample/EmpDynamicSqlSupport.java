package javaConfigExample;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class EmpDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-10-11T16:41:32.644+08:00", comments="Source Table: SCOTT.EMP")
    public static final Emp emp = new Emp();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-10-11T16:41:32.644+08:00", comments="Source field: SCOTT.EMP.EMPNO")
    public static final SqlColumn<Short> empno = emp.empno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-10-11T16:41:32.645+08:00", comments="Source field: SCOTT.EMP.ENAME")
    public static final SqlColumn<String> ename = emp.ename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-10-11T16:41:32.645+08:00", comments="Source field: SCOTT.EMP.JOB")
    public static final SqlColumn<String> job = emp.job;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-10-11T16:41:32.645+08:00", comments="Source field: SCOTT.EMP.MGR")
    public static final SqlColumn<Short> mgr = emp.mgr;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-10-11T16:41:32.645+08:00", comments="Source field: SCOTT.EMP.HIREDATE")
    public static final SqlColumn<Date> hiredate = emp.hiredate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-10-11T16:41:32.646+08:00", comments="Source field: SCOTT.EMP.SAL")
    public static final SqlColumn<BigDecimal> sal = emp.sal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-10-11T16:41:32.646+08:00", comments="Source field: SCOTT.EMP.COMM")
    public static final SqlColumn<BigDecimal> comm = emp.comm;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-10-11T16:41:32.646+08:00", comments="Source field: SCOTT.EMP.DEPTNO")
    public static final SqlColumn<Short> deptno = emp.deptno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2023-10-11T16:41:32.644+08:00", comments="Source Table: SCOTT.EMP")
    public static final class Emp extends SqlTable {
        public final SqlColumn<Short> empno = column("EMPNO", JDBCType.NUMERIC);

        public final SqlColumn<String> ename = column("ENAME", JDBCType.VARCHAR);

        public final SqlColumn<String> job = column("JOB", JDBCType.VARCHAR);

        public final SqlColumn<Short> mgr = column("MGR", JDBCType.NUMERIC);

        public final SqlColumn<Date> hiredate = column("HIREDATE", JDBCType.TIMESTAMP);

        public final SqlColumn<BigDecimal> sal = column("SAL", JDBCType.NUMERIC);

        public final SqlColumn<BigDecimal> comm = column("COMM", JDBCType.NUMERIC);

        public final SqlColumn<Short> deptno = column("DEPTNO", JDBCType.NUMERIC);

        public Emp() {
            super("SCOTT.EMP");
        }
    }
}