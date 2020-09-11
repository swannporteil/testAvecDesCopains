/** =============================================================================
 *
 * @(#) LoginController.java

 *
 * Copyright (c) Naval Group SA property, (2019), all rights reserved.
 *
 * Both the content and the form of this software are the property of Naval Group SA and/or of third party.
 * It is formally prohibited to use, copy, modify, translate, disclose or perform all or
 * part of this software without obtaining Naval Group SA’s prior written consent or authorization.
 * Any such unauthorized use,copying, modification, translation, disclosure or performance by any means
 * whatsoever shall constitute an infringement punishable by criminal or civil law and, more generally, a breach of
 * Naval Group SA’s rights.
 * ============================================================================= */

package com.usermanagement.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController
{
	private final static String LOGINPATH="/login";
	
	/**
	 * The login page mapping method
	 * @return "login" string which is redirected into login.html using Thymeleaf.
	 */
	@RequestMapping(value=LOGINPATH, produces={MediaType.TEXT_HTML_VALUE}, method=RequestMethod.GET)
	public String loginPage()
	{
		return "login" ;
	}
}
