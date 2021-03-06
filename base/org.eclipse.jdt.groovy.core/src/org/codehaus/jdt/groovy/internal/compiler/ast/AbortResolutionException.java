/*******************************************************************************
 * Copyright (c) 2009 Codehaus.org, SpringSource, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Andy Clement        - Initial API and implementation
 *******************************************************************************/
package org.codehaus.jdt.groovy.internal.compiler.ast;

/**
 * Thrown when resolution of a type should not continue
 * 
 * @author Andy Clement
 */
public class AbortResolutionException extends IllegalStateException {

	private static final long serialVersionUID = 1L;

	public AbortResolutionException(String message) {
		super(message);
	}

}
