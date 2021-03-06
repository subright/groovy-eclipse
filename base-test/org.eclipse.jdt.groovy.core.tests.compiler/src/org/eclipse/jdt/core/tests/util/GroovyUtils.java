/*******************************************************************************
 * Copyright (c) 2011 Codehaus, SpingSource and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Andrew Eisenberg - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.core.tests.util;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Version;

/**
 * 
 * @author Andrew Eisenberg
 * @created Mar 17, 2011
 */
public class GroovyUtils {
    static public final int GROOVY_LEVEL;
    static {
    	Version ver = Platform.getBundle("org.codehaus.groovy").getVersion();
        GROOVY_LEVEL = ver.getMajor() * 10 + ver.getMinor();
    }
    public static boolean isGroovy16() {
        return GROOVY_LEVEL == 16;
    }
    public static boolean isGroovy17() {
        return GROOVY_LEVEL == 17;
    }
    public static boolean isGroovy18() {
        return GROOVY_LEVEL == 18;
    }

    public static boolean isGroovy20() {
        return GROOVY_LEVEL == 20;
    }

    public static boolean isGroovy21() {
        return GROOVY_LEVEL == 21;
    }

    public static boolean isGroovy22() {
        return GROOVY_LEVEL == 22;
    }
	public static boolean isAtLeastGroovy22() {
		return GROOVY_LEVEL>=22;
	}

}
