// Last updated: 7/15/2026, 8:24:13 PM
1class PeekingIterator implements Iterator<Integer> {
2    
3    Iterator<Integer> iter = null;
4    Integer next = null;
5    
6	public PeekingIterator(Iterator<Integer> iterator) {
7	    // initialize any member here.
8	    iter = iterator;
9        if(hasNext()) next = iter.next();
10	}
11	
12    // Returns the next element in the iteration without advancing the iterator.
13	public Integer peek() {
14        return next;
15	}
16	
17	// hasNext() and next() should behave the same as in the Iterator interface.
18	// Override them if needed.
19	@Override
20	public Integer next() {
21	    Integer currVal = next;
22        if(iter.hasNext()) 
23            next = iter.next();
24        else 
25            next = null;
26        return currVal;
27	}
28	
29	@Override
30	public boolean hasNext() {
31	    return next != null || iter.hasNext();
32	}
33}