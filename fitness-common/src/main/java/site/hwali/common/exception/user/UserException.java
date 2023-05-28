package site.hwali.common.exception.user;

import site.hwali.common.exception.base.BaseException;

/**
 * 用户信息异常类
 *
 * @author lihua
 */
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args) {
        super("user", code, args, null);
    }
}
