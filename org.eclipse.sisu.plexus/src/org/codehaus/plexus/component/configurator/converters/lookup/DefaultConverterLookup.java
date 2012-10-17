/*******************************************************************************
 * Copyright (c) 2010, 2012 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Stuart McCulloch (Sonatype, Inc.) - initial API and implementation
 *******************************************************************************/
package org.codehaus.plexus.component.configurator.converters.lookup;

import org.codehaus.plexus.component.configurator.ComponentConfigurationException;
import org.codehaus.plexus.component.configurator.converters.ConfigurationConverter;

public final class DefaultConverterLookup
    implements ConverterLookup
{
    public void registerConverter( final ConfigurationConverter converter )
    {
        throw new UnsupportedOperationException();
    }

    public ConfigurationConverter lookupConverterForType( final Class<?> type )
        throws ComponentConfigurationException
    {
        throw new UnsupportedOperationException();
    }
}
