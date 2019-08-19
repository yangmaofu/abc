package com.luan.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class SessionUtils {

	public static final String sessionKey="sessionUser";
	private static HttpSession getSession() {
		HttpSession session = null;
		try {
			session = getRequest().getSession();
		} catch (Exception e) {
		}
		return session;
	}

	public static HttpServletRequest getRequest() {
		ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		return attrs.getRequest();
	}

	/**
	 * 从session中获取信息
	 *
	 */
	public static Object getObject() {
		return getSession().getAttribute(sessionKey);
	}

	public static void setObject(Object object) {
		getSession().setAttribute(sessionKey, object);
	}

	public static void invalidate() {
		HttpSession session = getSession();
		session.removeAttribute(sessionKey);
		session.invalidate();
	}
}
