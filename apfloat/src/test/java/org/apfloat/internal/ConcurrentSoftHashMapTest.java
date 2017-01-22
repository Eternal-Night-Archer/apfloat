package org.apfloat.internal;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @since 1.7.0
 * @version 1.7.0
 * @author Mikko Tommila
 */

public class ConcurrentSoftHashMapTest
    extends TestCase
{
    public ConcurrentSoftHashMapTest(String methodName)
    {
        super(methodName);
    }

    public static void main(String[] args)
    {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite()
    {
        TestSuite suite = new TestSuite();

        suite.addTest(new ConcurrentSoftHashMapTest("testSoft"));
        suite.addTest(new ConcurrentSoftHashMapTest("testPutIfAbsent"));

        return suite;
    }

    public static void testSoft()
    {
        ConcurrentMap<Integer, byte[]> map = new ConcurrentSoftHashMap<Integer, byte[]>();

        final int SIZE = 1000000;

        byte[] value = new byte[4 * SIZE];
        map.put(1, value);
        assertEquals("Size after put", 1, map.size());
        assertNotNull("Value", map.get(1));
        value = null;

        // Force out of memory
        try
        {
            List<byte[]> dummy = new ArrayList<byte[]>();
            for (int i = 2; i < 1000000000 && map.get(1) != null; i++)
            {
                dummy.add(new byte[SIZE]);
            }
        }
        catch (OutOfMemoryError oome)
        {
            // Should happen eventually
        }

        assertNull("Cleared", map.get(1));

        map.put(1, value);
        map.clear();
        assertNull("Explicitly cleared", map.get(1));

        assertNull("Removed", map.remove(1));

        try
        {
            map.entrySet();
        }
        catch (UnsupportedOperationException uoe)
        {
            // Ignore
        }

        try
        {
            map.remove(1, value);
        }
        catch (UnsupportedOperationException uoe)
        {
            // Ignore
        }

        try
        {
            map.replace(1, value);
        }
        catch (UnsupportedOperationException uoe)
        {
            // Ignore
        }

        try
        {
            map.replace(1, value, value);
        }
        catch (UnsupportedOperationException uoe)
        {
            // Ignore
        }
    }

    public static void testPutIfAbsent()
    {
        ConcurrentMap<Integer, Integer> map = new ConcurrentSoftHashMap<Integer, Integer>();
        Integer key1 = new Integer(1);
        Integer value1 = new Integer(2);
        Integer value2 = new Integer(3);
        assertNull("First putIfAbsent", map.putIfAbsent(key1, value1));
        assertSame("Second putIfAbsent", value1, map.putIfAbsent(key1, value2));
        assertSame("Get", value1, map.get(key1));
    }
}
