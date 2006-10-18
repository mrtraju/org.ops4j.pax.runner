/*
 * Copyright 2006 Niclas Hedhman.
 *
 * Licensed  under the  Apache License,  Version 2.0  (the "License");
 * you may not use  this file  except in  compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed  under the  License is distributed on an "AS IS" BASIS,
 * WITHOUT  WARRANTIES OR CONDITIONS  OF ANY KIND, either  express  or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pixea.runner.editor;

import org.ops4j.pixea.runner.PaxRunnerRuntimeException;
import org.ops4j.pax.runner.repositories.RepositoryType;

public class UnknownRepositoryTypeException extends PaxRunnerRuntimeException
{
    private RepositoryType m_type;

    public UnknownRepositoryTypeException( RepositoryType type )
    {
        super( "Unknown RepositoryType: " + type );
        m_type = type;
    }

    public RepositoryType getType()
    {
        return m_type;
    }
}