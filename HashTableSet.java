
package csci235;

import java.util.ArrayList;
import java.util.List;

public class HashTableSet<T> implements Set<T> 
{

    private List<T>[] buckets;
    private int size;

    public HashTableSet(int numBuckets) {
       size = 0;
       buckets = createBucketArray( numBuckets ); 
    }


    // Construct an array of buckets of neededSize, and initialize it.

    private List<T> [] createBucketArray( int neededSize )
    {
        if( neededSize < 1 )
           throw new IllegalArgumentException( "nrbuckets must be greater than zero" ); 

       // Seems that this problem is unfixable:

       @SuppressWarnings("unchecked" )

       List<T>[] arr = new List[ neededSize ];
 
       for( int i = 0; i != neededSize; ++ i )
           arr[i] = new ArrayList<T>( );

       return arr; 
    }

}


