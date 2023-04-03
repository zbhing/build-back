package com.build.bus.api.constant;

/**
 * @author zbhing
 * @description
 */
public interface CommonConstant {
    String LOGIN_USER = "loginUser";
    String REQUEST_ATTRIBUTES = "requestAttributes";
    String BUS_ACCOUNT = "busAccount";
    String BUS_ACCOUNT_ = "bus_account";
    String ALL = "all";
    String TOKEN_FIELD = "X-Access-Token";
    String LANGUAGE = "language";
    String ADMIN = "admin";
    Integer STATUS_YES = 1;
    Integer STATUS_NO = 0;
    String YES = "1";
    String NO = "0";
    Integer STATUS_NORMAL = 0;
    Integer STATUS_DISABLE = -1;
    Integer DEL_FLAG_1 = 1;
    Integer DEL_FLAG_0 = 0;
    int LOG_TYPE_1 = 1;
    int LOG_TYPE_2 = 2;
    int LOG_TYPE_3 = 3;
    int LOG_TYPE_4 = 4;
    int OPERATE_TYPE_QUERY = 1;
    int OPERATE_TYPE_ADD = 2;
    int OPERATE_TYPE_EDIT = 3;
    int OPERATE_TYPE_DELETE = 4;
    int OPERATE_TYPE_IMPORT = 5;
    int OPERATE_TYPE_EXPORT = 6;
    int OPERATE_TYPE_CANCAL = 7;
    int OPERATE_TYPE_CLOSE = 8;
    Integer SC_INTERNAL_SERVER_ERROR_500 = 500;
    Integer SC_OK_200 = 200;
    Integer SC_ELS_NO_AUTHZ = 510;
    Integer SC_ELS_TOKEN_EXPIRE = 520;
    Integer SC_ELS_SIGN_OUT = 530;
    Integer SC_ELS_AGAIN = 800;
    Integer MENU_TYPE_0 = 0;
    Integer MENU_TYPE_1 = 1;
    Integer MENU_TYPE_2 = 2;
    String NO_SEND = "0";
    String HAS_SEND = "1";
    String HAS_CANCLE = "2";
    String HAS_READ_FLAG = "1";
    String NO_READ_FLAG = "0";
    String SMS_TPL_TYPE_0 = "0";
    String SMS_TPL_TYPE_1 = "1";
    String SMS_TPL_TYPE_2 = "2";
    String STATUS_0 = "0";
    String STATUS_1 = "1";
    String STATUS_2 = "2";
    String CLOSE_0 = "0";
    String CLOSE_1 = "1";
    String ACT_SYNC_0 = "0";
    String ACT_SYNC_1 = "1";
    Integer RULE_FLAG_0 = 0;
    Integer RULE_FLAG_1 = 1;
    Integer USER_UNFREEZE = 1;
    Integer USER_FREEZE = 2;
    String RESULT_SUCCESS = "success";
    String SPLIT_CHAR = ",";
    String PREFIX_USER_TOKEN_REPEAT = "sys:token:repeat:";
    String CLOUD = "cloud";
    String LOCAL = "local";
}