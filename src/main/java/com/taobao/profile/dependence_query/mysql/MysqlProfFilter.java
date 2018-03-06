package com.taobao.profile.dependence_query.mysql;

import com.taobao.profile.config.ProfFilter;

/**
 * @author weigao
 * @since 15/6/1
 */
public class MysqlProfFilter extends ProfFilter {

    public final static String MysqlPath = "com/mysql/jdbc/ConnectionImpl";

    private static MysqlProfFilter instance = new MysqlProfFilter();
    protected MysqlProfFilter() {
        includePackage.add(MysqlPath.toLowerCase());
    }

    public static boolean isMysqlQuery(String className){
        String icaseName = className.toLowerCase().replace('.', '/');
        return icaseName.startsWith(MysqlPath);
    }

    public static MysqlProfFilter getInstance(){
        return instance;
    }

}
