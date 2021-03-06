/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.search.test.embedded;

/**
 * @author Emmanuel Bernard
 */
public interface Person {

	String getName();

	void setName(String name);

	Address getAddress();

	void setAddress(Address address);

}
