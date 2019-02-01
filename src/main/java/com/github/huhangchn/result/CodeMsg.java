package com.github.huhangchn.result;

public class CodeMsg {


    private int code;
    private String msg;

    //通用的错误码
    public static CodeMsg SUCCESS = new CodeMsg(100000, "success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(100001, "接口 [%s] 内部错误，请联系管理员");
    public static CodeMsg BIND_ERROR = new CodeMsg(100002, "参数校验异常：%s");
    public static CodeMsg NOT_FOUND = new CodeMsg(100005, "接口 [%s] 不存在");
    public static CodeMsg UNAUTHORIZED = new CodeMsg(100005, "签名认证失败");

    //登录模块 1001XX
    public static CodeMsg LOGIN_ERROR = new CodeMsg(100100, "登录失败");
    public static CodeMsg SESSION_ERROR = new CodeMsg(100101, "Session不存在或者已经失效");
    public static CodeMsg PASSWORD_EMPTY = new CodeMsg(100102, "登录密码不能为空");
    public static CodeMsg MOBILE_EMPTY = new CodeMsg(100103, "手机号不能为空");
    public static CodeMsg MOBILE_ERROR = new CodeMsg(100104, "手机号格式错误");
    public static CodeMsg MOBILE_NOT_EXIST = new CodeMsg(100105, "手机号不存在");
    public static CodeMsg PASSWORD_ERROR = new CodeMsg(100106, "密码错误");
    public static CodeMsg ACCESS_DENIED = new CodeMsg(100107, "拒绝访问");
    public static CodeMsg USER_NOT_FOUND = new CodeMsg(100108, "用户不存在");
    public static CodeMsg PERMISSION_DENIED = new CodeMsg(100109, "无权访问");
    public static CodeMsg AUTH_FAILED = new CodeMsg(100110, "登陆认证失败");


    //商品模块 1002XX

    //订单模块 1003XX
    public static CodeMsg ORDER_NOT_EXIST = new CodeMsg(100300, "订单不存在");

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    //上传模块 1004XX
    public static CodeMsg UPLOAD_ERROR = new CodeMsg(100400, "上传失败");


    public CodeMsg format(Object... args) {
        int code = this.code;
        String message = String.format(this.msg, args);
        return new CodeMsg(code, message);
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "CodeMsg [code=" + code + ", msg=" + msg + "]";
    }

}