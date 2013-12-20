package org.everit.osgi.samples.simple.tests.core;

/*
 * Copyright (c) 2011, Everit Kft.
 *
 * All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */

import org.everit.osgi.samples.simple.core.Foo;
import org.junit.Assert;

/**
 * The tester class that gets the annotations in the interface it implements.
 */
public class FooTestImpl implements FooTest {

    /**
     * The object we want to test. Blueprint sets this property.
     */
    private Foo foo;

    public void setFoo(final Foo foo) {
        this.foo = foo;
    }

    /**
     * The tester function. Annotation is defined in the {@link FooTest} interface.
     */
    public void testFoo() {
        String result = foo.foonction("John");
        
        System.out.println("The result is " + result);
        Assert.assertEquals("Good afternoon John!", result);
    }
}
