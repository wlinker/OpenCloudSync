/**
 * OpenCloudSync: Open source cloud synchronization solution; an extensible software that allows you to synchronize your data with different storage systems.
 *
 *     Copyright (C) 2012 Sebastien Dubois <seb__at__dsebastien.net>
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.opencloudsync;

/**
 * Classes that implement this interface expose a digest that uniquely identifies them.
 * Date: 4/04/12
 * Time: 18:07
 */
public interface DigestHolder {
    /**
     * Get the digest bytes.
     * @return the digest bytes.
     */
    byte[] getDigest();

    /**
     * Get a {@link String} representation of the digest bytes.
     * @return a {@link String} representation of the digest bytes.
     */
    String getDigestAsHexString();
}
